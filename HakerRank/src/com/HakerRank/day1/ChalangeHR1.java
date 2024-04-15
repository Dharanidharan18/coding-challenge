package com.HakerRank.day1;

import java.util.Scanner;

public class ChalangeHR1 {
	



	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	    	System.out.println("Enter a number form 0 to 100");
	        int N = scanner.nextInt();
	        while(N>0 && N<=100){
	                if(N!=0) {
	                    System.out.println("Weird");
	                }else {
	                    if(N>=2 && N<=5) {
	                        System.out.println("Not Weird");
	                    }else if (N>=6 && N<=20) {
	                        System.out.println("Weird");
	                    }else {
	                        System.out.println("Not Weird");
	                    }
	                }
	                break ;
	            }
	        
	    
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        scanner.close();
	    }
	}



