package com.jenniferhatton;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum = 0;
        int count = 0;
        for(int i = 1; i <= 1000; i++) {
            if(i % 15 == 0) {
                count++;
                sum += i;
                System.out.println("Can be divided by 3 and 5: " + i);
                if(count == 5) {
                    System.out.println("Sum: " + sum);
                    break;
                }
            }
        }
    }
}


//        Create a for statement using a range of numbers from 1 to 1000 inclusive.
//
//        Sum all the numbers that can be divided with both 3 and also with 5.
//
//        For those numbers that met the above conditions, print out the number.
//
//        break out of the loop once you find 5 numbers that met the above conditions.
//
//        After breaking out of the loop print the sum of the numbers that met the above conditions.
//
//        Note: Type all code in main method