/* SCC - ITC 115 Object Oriented Programming   
 * Instructor: Ava Meredith
 * Student: Alessandra Lima
 * Date: Feb8, 2020
 * Class name: Chap4Ex03
 * 
 * The method named season takes as parameters two integers representing a month and a day and
 * returns a string indicating the season for that month and day
 */

public class Chap4Ex03 {

	public static void main(String[] args) {
			
	        
	        int month = 6;
	        
	        int day   = 16;
	        
	        System.out.println(season(month,day));
	        
	        
	    }
			
		
		
		public static String season(int m, int d) {
			    
				if(m < 3 || (m == 3 && d <= 15) || (m == 12 && d >= 16)) {
			        return "Winter";
			    
				} else if((3 < m && m < 6) || (m == 3 && d >= 16) || (m == 6 && d <= 15)) {
			       
					return "Spring";
			    
				} else if((6 < m && m < 9) || (m == 6 && d >= 16) || (m == 9 && d <= 15)) {
			       
					return "Summer";
			    } else {
			        
			    	return "Fall";
			    }
				
			}

	}


