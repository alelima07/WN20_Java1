/* ITC 115 - SEATTLE CENTRAL COLLEGE
* INSTRUCTOR - AVA MEREDITH
* STUDENT: ALESSANDRA LIMA
* Write a static method named isSorted that accepts an array of doubles as
* a parameter and returns true if the list is in sorted (nondecreasing) 
* order and false otherwise. Assume the array has at least one element. A
* one-element array is considered to be sorted. 
*/
public class Chap7Ex04 {

	public static void main(String[] args) {
		double[] arr1 = {15.1, 11.3, 21.2, 13.4}; 
		System.out.println(isSorted(arr1));
		//returns false
		
		double[] arr2 = {1.5, 4.3, 6.0, 18.5, 23.1, 43.4};
		System.out.println(isSorted(arr2));
		//returns true
		
		double[] arr3 = {42.0, 27.0};
		System.out.println(isSorted(arr3));
		//returns false
		
		double[] arr4 = {50};
		System.out.println(isSorted(arr4));
		//returns true
	}
	public static boolean isSorted(double[] array) {
	    double pre = array[0];
	    
	    for (int i = 1; i < array.length; i++) {
	        double current = array[i];
	        if (pre >= current) {
	            return false;
	        }
	        pre = current;
	    }
	    
	    return true;
	}
}
