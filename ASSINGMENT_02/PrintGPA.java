import java.util.Scanner;
/* SCC - ITC 115 Object Oriented Programming   
 * Instructor: Ava Meredith
 * Student: Alessandra Lima
 * Date: Feb8, 2020
 * Class name: PrintGPA
 * 
 * Write a method named printGPA that calculates a student's grade point 
 * average. The user will type a line of input containing the student's name, 
 * then a number of scores, followed by that many integer scores.
 */
public class PrintGPA {

	
	public static void main(String[] args) {
				
		//testing
		System.out.println("Testing Maria's score that should have an average of 82.8 ");
		int[] scores = {72,91,84,89,78};
		printGPA("Maria", scores);
		
		
		System.out.println();	
		
		System.out.println("Now you can also give it a try.");
		//enter your own information
		printGPA();
			
		}
	
	public static void printGPA() {
		Scanner console = new Scanner(System.in);
			    
		System.out.print("Enter a student record: ");
			    
		String name = console.next();
			int num = console.nextInt();
			double sum = 0;
			    
			  for(int i = 0; i < num; i++)
			     sum += console.nextInt();
			    
			  System.out.println(name + "'s grade is " + sum / num);
			}
	
	//method used to test printGPA 
	public static void printGPA(String student, int[] scores) {
	       
		String name = student;
		int num = scores.length;
		double sum = 0;
		System.out.print(name + " has " + scores.length + " scores, which are " );    
			  for(int i = 0; i < num; i++) {
				  System.out.print(scores[i] + " " );
			      sum += scores[i];
			  }
			    
			  System.out.println("\n" + name + "'s grade is " + sum / num);
			  
			}
	}


