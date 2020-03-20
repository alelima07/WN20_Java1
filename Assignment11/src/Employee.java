// Seattle Central College
// ITC 115 - Assignment 11 - ch9 Ex2&3 - Janitor and HarvardLawyer
// Student: Alessandra Souza Lima
//  Add Janitor and HarvardLawyer classes to law firm employees, that 
//  interact with the superclass. Recreated from previous exercises to
//  have Employee class be abstract, and to include more superclass
//  interaction.

// A class to represent employees in general.
public class Employee {
    public void applyForVacation() {
        System.out.println("Use the yellow vacation form.");
    }

    public void showHours() {
        System.out.println("I work 40 hours per week.");
    }

    public void showSalary() {
        System.out.println("My salary is $40,000.");
    }

    public void showVacation() {
        System.out.println("I receive 2 weeks vacation.");
    }
}
