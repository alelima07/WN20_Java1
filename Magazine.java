// Seattle Central College
// ITC 115 - Final
// Student: Alessandra Souza Lima

public class Magazine extends Library{

	public Magazine(int card, int itemNumber) {
		super(card, itemNumber);
	}
	
	@Override
	public String toString() {
		return getTitle() + " " + getItemNumber() + " " + isCheckedIn();
	}
	
}
