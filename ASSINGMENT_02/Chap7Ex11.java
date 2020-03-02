/*ITC 115 - SEATTLE CENTRAL COLLEGE
* INSTRUCTOR - AVA MEREDITH
* STUDENT: ALESSANDRA LIMA
* Write a method named isUnique that takes an array of integers as a parameter and that 
* returns a boolean value indicating whether or not the values in the array are unique (true 
* for yes, false for no). The values in the list are considered unique if there is no 
* pair of values that are equal. 
*/
public class Chap7Ex11 {

	public static void main(String[] args) {
		int[] arr1 = {5, 10, 6}; 
		System.out.println(isUnique(arr1));
		// return true
		
		int[] arr2 = {};
		System.out.println(isUnique(arr2));
		// return true
		
		int[] arr3 = {205};
		System.out.println(isUnique(arr3));
		//return true
		
		int[] arr4 = {3, 5, 5};
		System.out.println(isUnique(arr4));
		//return false
		
		int[] arr5 = {2, 4, 6, 8, 10, 12, -2, -4};
		System.out.println(isUnique(arr5));
		//return true
		
		int[] arr6 = {12, 4, 4, 8, 10, 12, -1, -1, -1};
		System.out.println(isUnique(arr6));
		//return false

	}

	public static boolean isUnique(int[] array) {
	    for (int i = 0; i < array.length; i++) {
	        int min = array[i];
	        
	        for (int j = i + 1; j < array.length; j++) {
	            if (min > array[j]) {
	                array[i] = array[j];
	                array[j] = min;
	                min = array[i];
	            }
	        }
	        
	    }
	    
	    for (int i = 0; i < array.length - 1; i++) {
	        if (array[i] == array[i + 1]) {
	            return false;
	        }
	    }
	    
	    return true;
	}

}
