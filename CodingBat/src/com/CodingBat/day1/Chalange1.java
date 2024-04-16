//Given a string, take the first 2 chars and return the 
//string with the 2 chars added at both the front and back, 
//so "kitten" yields"kikittenki". If the string length is less than 2,
//use whatever chars are there.
//
//
//front22("kitten") → "kikittenki"
//front22("Ha") → "HaHaHa"
//front22("abc") → "ababcab"

package com.CodingBat.day1;

public class Chalange1 {
		
	public String front22(String str) {
		  int take = 2;
		  if (take > str.length()) {
		    take = str.length();
		  }
		  String front = str.substring(0,take);
		  return front+str+front;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chalange1 chalange1 = new Chalange1();
		
		String str1 = "hello";
		System.out.println(chalange1.front22(str1));
	}

}
