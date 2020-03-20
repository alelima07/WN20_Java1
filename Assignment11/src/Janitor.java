// Seattle Central College
// ITC 115 - Assignment 11 - ch9 Ex2&3 - Janitor and HarvardLawyer
// Student: Alessandra Souza Lima
//  Add Janitor and HarvardLawyer classes to law firm employees, that 
//  interact with the superclass. Recreated from previous exercises to
//  have Employee class be abstract, and to include more superclass
//  interaction.

//a class to represent janitors
public class Janitor extends Employee {
	    public void showHours() {
	        System.out.println("I work 80 hours per week.");
	    }

	    public void showSalary() {
	        System.out.println("My salary is $30,000.");
	    }

	    public void showVacation() {
	        System.out.println("I receive 1 week of vacation.");
	    }
	    
	    public void clean() {
	    	System.out.println("Workin' for the man.");
	    }
}
