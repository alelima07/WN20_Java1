// Seattle Central College
// ITC 115 - Final
// Student: Alessandra Souza Lima
public class Book extends Library{

	public Book(int card, int itemNumber) {
		super(card, itemNumber);
	}

	@Override
	public String toString() {
		return getTitle() + " " + getItemNumber() + " " + isCheckedIn();
	}


}
