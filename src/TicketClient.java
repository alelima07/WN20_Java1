//*******************************************************************
//	Seattle Central College
// Student: Alessandra Lima
// ITC 115 - Assignment 10 - Ex5-Ex7 - GetTickets class (client app)
//  Client app that call from main the creations and toString methods of
//    both Walkup and Advanced ticket types. Tests for advancedDays price
//    variations, and creates tickets both by creating new objects individually
//    and by grouping together in an array. Calls the toString method to
//    display ticket info, and calls the getPrice methods separately as well.
//  Define the following operations:
//      - the ability to construct a ticket by number.
//      - the ability to ask for a ticket's price.
//      - the ability to println a ticket object as a String:
//            - e.g. "Number: 17, Price: 50.0"
//*******************************************************************


public class TicketClient {
	public static void main(String[] args) {
		WalkupTicket();
		System.out.println();
		AdvanceTicket();
		System.out.println();
		StudentAdvanceTicket();
	}
	
	public static void WalkupTicket() {
		for(int i = 1; i <= 3; i++) {
			WalkupTicket ticket = new WalkupTicket(i);
			System.out.println(ticket);
		}
	}
	
	public static void AdvanceTicket() {
		int days = 0;
		for(int i = 1; i <= 5; i++) {
			AdvanceTicket ticket = new AdvanceTicket(i, days);
			System.out.println(ticket);
			days+=5;
		}
	}
	
	public static void StudentAdvanceTicket() {
		int days = 0;
		for(int i = 1; i <= 5; i++) {
			StudentAdvanceTicket ticket = new StudentAdvanceTicket(i, days);
			System.out.println(ticket);
			days+=5;
		}
	}

}
