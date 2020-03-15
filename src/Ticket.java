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

public abstract class Ticket {
	private int number;
	
	public Ticket(int number){
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}

	public abstract double getPrice();
	public abstract String toString();
}
