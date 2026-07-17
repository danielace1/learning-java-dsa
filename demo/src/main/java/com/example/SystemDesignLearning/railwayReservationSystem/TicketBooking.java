package com.example.SystemDesignLearning.railwayReservationSystem;

import java.util.*;

import com.example.SystemDesignLearning.railwayReservationSystem.enums.BerthType;
import com.example.SystemDesignLearning.railwayReservationSystem.enums.TicketStatus;
import com.example.SystemDesignLearning.railwayReservationSystem.models.Passenger;
import com.example.SystemDesignLearning.railwayReservationSystem.models.Ticket;;

public class TicketBooking {

    private static final int MAX_RAC = 1;
    private static final int MAX_WAITING = 1;

    private final List<BerthType> berthsAvailable = new ArrayList<>(Arrays.asList(BerthType.values()));
    private final Queue<Passenger> racQueue = new LinkedList<>();
    private final Queue<Passenger> waitingQueue = new LinkedList<>();
    private final List<Passenger> confirmedBookings = new ArrayList<>();
    private int ticketCounter = 1;
    private int passengerCounter = 1;

    public void bookTicket(String name, int age, String gender, BerthType berthPreference) {
        String ticketId = "T" + ticketCounter++;
        String passengerId = "P" + passengerCounter++;

        Passenger passenger;
        Ticket ticket;

        if (!berthsAvailable.isEmpty()) {
            // allocate berth
            BerthType allottedBerth = allocateBerth(age, gender, berthPreference);
            ticket = new Ticket(ticketId, berthPreference, allottedBerth, TicketStatus.CONFIRMED);
            passenger = new Passenger(passengerId, name, age, gender, ticket);

            // create ticket
            confirmedBookings.add(passenger);
            berthsAvailable.remove(allottedBerth);

            System.out.println("Ticket Confirmed: " + passenger);
        } else if (racQueue.size() < MAX_RAC) {
            ticket = new Ticket(ticketId, berthPreference, null, TicketStatus.RAC);
            passenger = new Passenger(passengerId, name, age, gender, ticket);

            // added to RAC
            racQueue.offer(passenger);
            System.out.println("Ticket in RAC: " + passenger);
        } else if (waitingQueue.size() < MAX_WAITING) {
            ticket = new Ticket(ticketId, berthPreference, null, TicketStatus.WAITING);
            passenger = new Passenger(passengerId, name, age, gender, ticket);

            // added to waiting list
            waitingQueue.offer(passenger);
            System.out.println("Ticket in Waiting list: " + passenger);
        } else {
            System.out.println("No Tickets available.");
        }
    }

    public void cancelTicket(String ticketId) {
        // find passenger
        Passenger passengerToCancel = null;
        for (Passenger p : confirmedBookings) {
            if (p.getTicket().getTicketId().equals(ticketId)) {
                passengerToCancel = p;
                break;
            }
        }
        if (passengerToCancel == null) {
            System.out.println("Ticket not found");
            return;
        }
        // remove passenger
        confirmedBookings.remove(passengerToCancel);
        // free berth
        berthsAvailable.add(passengerToCancel.getTicket().getAllottedBerth());

        // move RAC to confirmed
        if (!racQueue.isEmpty()) {
            Passenger racPassenger = racQueue.poll();
            BerthType allocatedBerth = allocateBerth(racPassenger.getAge(), racPassenger.getGender(),
                    racPassenger.getTicket().getPreferredBerth());

            racPassenger.getTicket().setAllottedBerth(allocatedBerth);
            racPassenger.getTicket().setStatus(TicketStatus.CONFIRMED);
            confirmedBookings.add(racPassenger);
            berthsAvailable.remove(allocatedBerth);

            System.out.println("RAC ticket moved to confirmed: " + racPassenger);
        }

        // move waiting to RAC
        // move RAC to confirmed
        if (!waitingQueue.isEmpty()) {
            Passenger waitingPassenger = waitingQueue.poll();
            racQueue.offer(waitingPassenger);

            waitingPassenger.getTicket().setStatus(TicketStatus.RAC);
            System.out.println("Waiting list ticket moved to RAC: " + waitingPassenger);
        }

        System.out.println("Ticket Canceled Successfully for ID: " + ticketId);
    }

    private BerthType allocateBerth(int age, String gender, BerthType preference) {
        if (age > 60 || gender.equalsIgnoreCase("female") && berthsAvailable.contains(BerthType.LOWER)) {
            return BerthType.LOWER;
        }

        if (berthsAvailable.contains(preference)) {
            return preference;
        }

        return berthsAvailable.get(0);
    }

    public void viewConfirmed() {
        if (confirmedBookings.isEmpty()) {
            System.out.println("No confirm tickets.");
        } else {
            System.out.println("Confirmed Tickets: ");

            for (Passenger passenger : confirmedBookings) {
                System.out.println(passenger);
            }
        }
    }

    public void viewRAC() {
        if (racQueue.isEmpty()) {
            System.out.println("No RAC tickets");
        } else {
            System.out.println("RAC tickets");
            for (Passenger passenger : racQueue) {
                System.out.println(passenger);
            }
        }
    }

    public void viewWaiting() {
        if (waitingQueue.isEmpty()) {
            System.out.println("No Waiting list tickets");
        } else {
            System.out.println("Waiting List tickets");
            for (Passenger passenger : waitingQueue) {
                System.out.println(passenger);
            }
        }
    }

    public void viewAvailability() {
        System.out.println("Available Berths: " + berthsAvailable.size());
        System.out.println("Available RAC tickets: " + (MAX_RAC - racQueue.size()));
        System.out.println("Available Waiting List tickets: " + (MAX_WAITING - waitingQueue.size()));
    }

}
