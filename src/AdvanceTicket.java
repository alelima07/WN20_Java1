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

public class AdvanceTicket extends Ticket{
	private int days;
	private double price;

	public AdvanceTicket(int number, int days) {
		super(number);
		this.days = days;
	}

	public double getPrice() {
		if(this.days >= 10) {
			price = 30;
		} else {
			price = 40;
		}
		return price;
	}
	
	public int getDays() {
		return days;
	}

	public String toString() {
		return "Number: " + super.getNumber() + ", Price: $" + getPrice() + ", Purchased " + getDays() + " days before event";
	}

}
