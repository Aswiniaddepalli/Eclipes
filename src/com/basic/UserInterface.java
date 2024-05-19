package com.basic;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter movie name: ");
        String movieName = scanner.nextLine();

        System.out.print("Enter no of bookings: ");
        int noOfBookings = scanner.nextInt();

        for (int i = 0; i < noOfBookings; i++) {
            System.out.print("Enter the available tickets: "); 
            int availableTickets = scanner.nextInt();

            Ticket.setAvailableTickets(availableTickets);

            System.out.print("Enter the ticketid: ");
            int ticketId = scanner.nextInt();

            System.out.print("Enter the price: ");
            int price = scanner.nextInt();

            System.out.print("Enter the no of tickets: ");
            int numberOfTickets = scanner.nextInt();

            Ticket ticket = new Ticket();
            ticket.setTicketId(ticketId);
            ticket.setPrice(price);

            int totalAmount = ticket.calculateTicketCost(numberOfTickets);

            if (totalAmount != -1) {
                System.out.println("Available tickets: " + Ticket.getAvailableTickets());
                System.out.println("Total amount: " + totalAmount);
                Ticket.setAvailableTickets(Ticket.getAvailableTickets() - numberOfTickets);
                System.out.println("Available ticket after booking: " + Ticket.getAvailableTickets());
            } else if (numberOfTickets > Ticket.getAvailableTickets()) {
                System.out.println("Tickets are not available");
            } else {
                System.out.println("House full");
                break; // Exit loop if house is full
            }
        }

        scanner.close();
    }
}