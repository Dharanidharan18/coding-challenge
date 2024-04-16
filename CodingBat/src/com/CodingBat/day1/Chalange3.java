//We have two monkeys, a and b, and the parameters aSmile and bSmile indicate
//if each is smiling. We are in trouble if they are both smiling or if 
//neither of them is smiling. Return true if we are in trouble.
//
//
//monkeyTrouble(true, true) → true
//monkeyTrouble(false, false) → true
//monkeyTrouble(true, false) → false

package com.CodingBat.day1;

public class Chalange3{
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }

    public static void main(String[] args) {
    	Chalange3 trouble = new Chalange3();

        // Example usage:
        boolean result1 = trouble.monkeyTrouble(true, true);
        System.out.println(result1); // Output: true

        boolean result2 = trouble.monkeyTrouble(false, false);
        System.out.println(result2); // Output: true

        boolean result3 = trouble.monkeyTrouble(true, false);
        System.out.println(result3); // Output: false
    }
}