//The parameter weekday is true if it is a weekday, 
//and the parameter vacation is true if we are on vacation. 
//We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
//
//
//sleepIn(false, false) → true
//sleepIn(true, false) → false
//sleepIn(false, true) → true


package com.CodingBat.day1;

public class Chalange2 {
	
	public boolean sleepIn(boolean weekday, boolean vacation) {
		  
		  if(!weekday || vacation) {
		    return true;
		  }
		  return false;
		  
		}

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		
	
		Chalange2 chalange2 = new Chalange2();
		
		boolean result1 = chalange2.sleepIn(true, false);
		System.out.println(result1);
		
		boolean result2 = chalange2.sleepIn(true, true);
		System.out.println(result2);
		
		boolean result3 = chalange2.sleepIn(false, true);
		System.out.println(result3);
		
		boolean result4 = chalange2.sleepIn(false, false);
		System.out.println(result4);
		 

	}

}
