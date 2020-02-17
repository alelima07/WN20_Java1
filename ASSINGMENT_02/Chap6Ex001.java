import java.io.*;
import java.util.*;

///SCC - ITC 115 Object Oriented Programming   
//Instructor: Ava Meredith
//Student: Alessandra Lima
//Date: Feb 16, 2020
//Class name: Chap6Ex001

//This program contains a method named boyGirl that accepts a Scanner as a parameter. 
//The Scanner reads its input from a file containing a series of names followed by integers. 
//The files contains names that alternate between boys' names and girls' names. 
//The boyGirls methods also compute the absolute difference between the sum of the boys' integers and the sum of the girls' integers. 
//The input could end with either a boy or girl, and may be an uneven number of names.


public class Chap6Ex001 {
	
	public static void main (String[] args) throws FileNotFoundException{
        File f = new File("boysgirls.txt");
        Scanner input = new Scanner(f);
        boyGirl(input);
    }
    
    public static void boyGirl(Scanner inp){
        int boysTotal = 0;//local variables to keep track of the boys and girls
        int boysNumbTotal = 0;
        int girlsTotal = 0;
        int girlsNumbTotal = 0;
        int count = 0;
        
        while (inp.hasNext()){
            if (count % 2 == 0){
                boysTotal++; //increment the boys count
                boysNumbTotal += readNameNumber(inp);
            } else {
                girlsTotal++; //increment the girls count
                girlsNumbTotal += readNameNumber(inp);
            }
            count += 1;
        }
        System.out.println(boysTotal + " boys, " + girlsTotal + " girls");
        System.out.println("Difference between boys' and girls' sums: " + Math.abs(boysNumbTotal - girlsNumbTotal));
    }
    
    public static int readNameNumber(Scanner inp){
        String name = inp.next();
        int    numb = inp.nextInt();
        //System.out.println(name + ": " + numb);
        return numb;
    }
}
