package com.systemdesign.railwayreservationsystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TicketSystem ticketSystem = new TicketSystem();
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

                    ticketSystem.bookTicket(name, age, gender, berth);
                    break;

                case 2:
                    System.out.println("Enter ticket ID to cancel: ");
                    String ticketId = sc.nextLine();
                    ticketSystem.cancelTicket(ticketId);
                    break;

                case 3:
                    ticketSystem.printBookedTickets();
                    break;
                case 4:
                    ticketSystem.printAvailableTickets();
                    break;
                case 5:
                    ticketSystem.viewRacTickets();
                    break;
                case 6:
                    ticketSystem.viewWaitingListTickets();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice. Try again.");
            }

        }
    }
}
