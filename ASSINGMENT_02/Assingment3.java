import java.util.*;
import java.util.Scanner;

public class Assingment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Get values from user
		System.out.println("This program computes powers of BASE_X to POWER_Y.");
		System.out.println("Enter a BASE_X number: ");
		
		double base_x = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("Enter a POWER_Y number: ");
		
		double power_y = sc.nextDouble();
		
		System.out.println();
		
		sc.close(); //close out console
		
		double result = printPowersOfN(base_x, power_y);
		
		System.out.println("  ");
		
		System.out.println("Final result of BASE_X of: \t " + base_x + "\t to POWER_Y of: \t" + power_y + "\t is: \t" + result);
		
	}
	
	public static double printPowersOfN (double base_x, double power_y) {
	
		double result = 0.0;
		
		for (int i = 0; i <= power_y; i++) {
			result = Math.pow(base_x, i);
			System.out.print(result + " , ");
	}
		System.out.println ("  ");
		
		return result;
		
	}
	
}
		
		
		
		
		
		
		

		
		
		