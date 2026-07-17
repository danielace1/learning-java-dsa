package com.example.SystemDesignLearning.railwayReservationSystem;

import java.util.*;

import com.example.SystemDesignLearning.railwayReservationSystem.enums.BerthType;

public class Main {
    public static void main(String[] args) {
        TicketBooking ticketBooking = new TicketBooking();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Railway Booking System:");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. View Confirmed Tickets");
            System.out.println("4. view Available Tickets");
            System.out.println("5. View RAC Tickes");
            System.out.println("6. View Waiting List Tickets");
            System.out.println("7. Exit");

            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Gender: ");
                    String gender = sc.nextLine();
                    System.out.println("Enter Berth Preference (L/U/M): ");
                    String berth = sc.nextLine();

                    BerthType berthPreference;

                    switch (berth) {
                        case "L":
                            berthPreference = BerthType.LOWER;
                            break;
                        case "M":
                            berthPreference = BerthType.MIDDLE;
                            break;
                        case "U":
                            berthPreference = BerthType.UPPER;
                            break;
                        default:
                            System.out.println("Invalid Berth Preference");
                            continue;
                    }

                    ticketBooking.bookTicket(name, age, gender, berthPreference);
                    ;
                    break;

                case 2:
                    System.out.println("Enter ticket ID to cancel: ");
                    String ticketId = sc.nextLine();
                    ticketBooking.cancelTicket(ticketId);
                    break;

                case 3:
                    ticketBooking.viewConfirmed();
                    break;
                case 4:
                    ticketBooking.viewAvailability();
                    break;
                case 5:
                    ticketBooking.viewRAC();
                    break;
                case 6:
                    ticketBooking.viewWaiting();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice. Try again.");
                    sc.close();
            }
        }

    }
}
