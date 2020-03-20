// Seattle Central College
// ITC 115 - Assignment 11 - ch9 Ex2&3 - Janitor and HarvardLawyer
// Student: Alessandra Souza Lima
//  Add Janitor and HarvardLawyer classes to law firm employees, that 
//  interact with the superclass. Recreated from previous exercises to
//  have Employee class be abstract, and to include more superclass
//  interaction.

// A class to represent marketers.
public class Marketer extends Employee {
    public void advertise() {
        System.out.println("Act now, while supplies last!");
    }

    public void showSalary() {
        System.out.println("My salary is $50,000.");
    }
}
