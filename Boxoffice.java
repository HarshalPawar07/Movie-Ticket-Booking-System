package com.jsp.oops.Relationship;

import java.util.Scanner;

public class Boxoffice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Theatre theatre=new Theatre("INOX", 500);
		boolean flag=true;
		while(flag) {
			System.out.println("Enter 1: Show Seat Availaibility " +"Enter 2: Book Ticket "+ "Enter 3: To check ticket details"+ "Enter 4: Cancel Ticket"+ "Enter 5: Exit");
			int n=sc.nextInt();
			switch(n) {
			case 1:{
				int no_of_seats=theatre.getNo_of_seats();
				System.out.println(no_of_seats+" Seats are available");
			}break;
			case 2:{
				System.out.println("Enter movie name:");
				String name=sc.next();
				System.out.println("Enter no of seats");
				int num=sc.nextInt();
				theatre.setTicket(new Ticket(name, num));
				int res=theatre.bookTicket();
				System.out.println("Successfully booked "+res+" tickets");	
			}break;
			case 3:{
				System.out.println("===Ticket Details===");
				Ticket t=theatre.getTicket();
				System.out.println("Movie Name: "+t.getMovie_name());
				System.out.println("Booked Tickets: "+t.getNo_of_tickets());
//				or
//				System.out.println(theatre.getTicket().getMovie_name());
			}break;
			case 4:{
				System.out.println("Enter the number of tickets to be canceled");
				int cancel=sc.nextInt();
				theatre.cancelTicket(cancel);
			}break;
			case 5:{
				System.out.println("case 5");
				flag=false;
			}break;
			default:{
				System.out.println("Wrong Input");
			}
			}
		}
	}
}
