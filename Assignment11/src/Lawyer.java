// Seattle Central College
// ITC 115 - Assignment 11 - ch9 Ex2&3 - Janitor and HarvardLawyer
// Student: Alessandra Souza Lima
//  Add Janitor and HarvardLawyer classes to law firm employees, that 
//  interact with the superclass. Recreated from previous exercises to
//  have Employee class be abstract, and to include more superclass
//  interaction.

public class Lawyer extends Employee {
    public void applyForVacation() {
        System.out.println("Use the pink vacation form.");
    }
    
    public void showVacation() {
        System.out.println("I receive 3 weeks vacation.");
    }

    public void sue() {
        System.out.println("I'll see you in court!");
    }
}
