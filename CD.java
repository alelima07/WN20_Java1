// Seattle Central College
// ITC 115 - Final
// Student: Alessandra Souza Lima

public class CD extends DVD{

	public CD(int card, int itemNumber) {
		super(card, itemNumber);
	}
	
	@Override
	public String toString() {
		return getTitle() + " " + getItemNumber() + " " + isCheckedIn();
	}

}
