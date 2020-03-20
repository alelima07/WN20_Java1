// Seattle Central College
// ITC 115 - Assignment 11 - ch9 Ex2&3 - Janitor and HarvardLawyer
// Student: Alessandra Souza Lima
//  Add Janitor and HarvardLawyer classes to law firm employees, that 
//  interact with the superclass. Recreated from previous exercises to
//  have Employee class be abstract, and to include more superclass
//  interaction.

public class HarvardLawyer extends Lawyer{
	public void showSalary() {
        System.out.println("My salary is $48,000.");
    }
	
	public void applyForVacation() {
        for(int i = 0; i < 3; i++) {
        	System.out.print("pink");
        }
        System.out.println();
    }
    
    public void showVacation() {
        System.out.println("I receive 3 weeks and 3 days vacation.");
    }
}
