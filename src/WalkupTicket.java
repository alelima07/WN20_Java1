//*******************************************************************
//Seattle Central College	
//ITC 115 - Assignment 10 - Ex5-Ex7 - AdvancedTicket subclass
// Alessandra Lima 
// Implement a subclass called AdvancedTicket to represent tickets
// purchased in advance. And advanced ticket is constructed with a
// ticket number and with the number of days in advance that the ticket
//  was purchased. Advanced tickets purchased 10 or more days before
//  the event cost $30, and advanced tickets purchased fewer than 10
//  days before the event cost $40.
//*******************************************************************

//  Define class that inherits the Ticket abstract superclass
public class WalkupTicket extends Ticket{
	private double price = 50;
	
	public WalkupTicket(int number){
		super(number);
	}
	
//  Required method definition, based on abstract methods in Ticket superclass
//  if statement to return different prices based on how many advanceDays were entered.
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return "Number: " + super.getNumber() + ", Price: $" + getPrice();
	}

}
