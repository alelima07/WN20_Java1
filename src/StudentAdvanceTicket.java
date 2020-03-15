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

public class StudentAdvanceTicket extends AdvanceTicket{
	private double price;
	
	public StudentAdvanceTicket(int number, int days) {
		super(number, days);
	}

	public double getPrice() {
		price = super.getPrice() / 2;
		return price;
	}
	

	public String toString() {
		return "Number: " + super.getNumber() + ", Price: $" + getPrice() + ", Purchased " + super.getDays() + " days before event. (STUDENT ID REQUIRED)";
	}
}
