package com.jenniferhatton;

public class Main {

    public static void main(String[] args) {

//        // long has a width of 64. Can store a number with 9 and 18 places after
//        long myLongValue = 100L;
//
//        // int has a width of 32
//        int myMinValue = -2_147_483_648;
//        int myMaxValue = 2_147_483_647;
//        int myTotal = (myMinValue/2);
//        System.out.println("myTotal = " + myTotal);
//
//        // short has a width of 16
//        short myShortValue = 32767;
//        short myNewShortValue = (short) (myShortValue/2);
//
//        // byte has a width of 8
//        byte myByteValue = -128;
//        byte myNewByteValue = (byte) (myByteValue/2);
//        System.out.println("myNewByteValue = " + myNewByteValue);



        byte first = 1;
        short second = 8;
        int third = 12;
        long fourth = 50000L + 10L * (first + second + third);
        short fifth = (short) (1000 + 10 * (first + second + third));

        System.out.println("My Long Total = " + fourth);
        System.out.println("My Short Total = " + fifth);
    }
}
