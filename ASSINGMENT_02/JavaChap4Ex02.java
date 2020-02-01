/* SCC - ITC 115 Object Oriented Programming   
 * Instructor: Ava Meredith
 * Student: Alessandra Lima
 * Date: Jan31, 2020
 * Java - Chap4Ex02
 * Class name: JavaChap4Ex02
 * 
 * Contains a method called repl that accepts a String 
 * and a number of repetitions as parameters and returns the
 * String concatenated that many times. For example, the call 
 * repl("hello", 3) should return "hellohellohello". If the 
 * number of repetitions is zero or less, the method should return an empty string.
 * 
 */

public class JavaChap4Ex02 {

		 public static void main (String[] args){
		        System.out.println(repl("hello", 4)); //this method prints Hello 4 times
		        //System.out.println(repl("hello", 0)) Here it's an empty string 0
		        //System.out.println(repl("hello", 4) + " should match \nhellohellohellohello");
		        
		        // true conditions
		        if(repl("hello",4).equals("hellohellohellohello")) {
		        	System.out.println("True");
		        } else {
		        	System.out.println("One of these things is not like the other");
		        }
		        //false conditions
		        if(repl("hello",4).equals("hellohellohello")) {
		        	System.out.println("True");
		        } else {
		        	System.out.println("One of these things is not like the other");
		        }
		    }
		    
		    public static String repl(String s, int n){
		        String value = "";
		        for (int i = 1; i <= n; i++){
		            value = value + s;
		        }
		        return value;
		    }
		
		   
	}


