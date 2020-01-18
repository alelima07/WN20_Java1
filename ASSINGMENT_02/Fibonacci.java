
public class Fibonacci {
	public static void main(String[] args) {
	//declare variables
	int firstNumber;
	int secondNumber;
	
	//compute Fibonacci Numbers
	firstNumber = 1;
	secondNumber = 1;
	
	System.out.println("The first 12 Fibonacci numbers are");
	System.out.print(firstNumber + " " + secondNumber);
	//Loop for the first 12 numbers
	
	for(int i = 0; i < 10; i++ ) {
		int nextNumber = firstNumber + secondNumber;
		firstNumber = secondNumber;
		secondNumber = nextNumber;
	
		System.out.print(" " + nextNumber);
	
	
		
	}
	
	
	
	
	
	
	
	}

}
	
