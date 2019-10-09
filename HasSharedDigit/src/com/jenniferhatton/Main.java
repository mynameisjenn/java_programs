package com.jenniferhatton;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));

    }

    public static boolean hasSharedDigit(int numOne, int numTwo) {

        if(numOne < 10 || numOne > 99 || numTwo < 10 || numTwo > 99) {
            return false;
        }

        int firstNumOne = numOne / 10;
        int secondNumOne = numOne % 10;

        int firstNumTwo = numTwo / 10;
        int secondNumTwo = numTwo % 10;

        return firstNumOne == firstNumTwo || firstNumOne == secondNumTwo || secondNumOne == firstNumTwo || secondNumOne == secondNumTwo;

    }
}

//
//        Write a method named hasSharedDigit with two parameters of type int.
//
//        Each number should be within the range of 10 (inclusive) - 99 (inclusive).
//
//        If one of the numbers is not within the range, the method should return false.
//
//        The method should return true if there is a digit that appears in both numbers,
//
//        such as 2 in 12 and 23; otherwise, the method should return false.
//
//
//        EXAMPLE INPUT/OUTPUT:
//
//        * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
//
//        * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
//
//        * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
//
//
//        NOTE: The method hasSharedDigit should be defined as public static like we have been doing so far in the course.
//
//        NOTE: Do not add a main method to the solution code.