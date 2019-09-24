package com.jenniferhatton;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int myValue = 1000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Min Value: " + myMinIntValue);
        System.out.println("Integer Max Value: " + myMaxIntValue);
        System.out.println("Busted Max Value: " + (myMaxIntValue + 1));
        System.out.println("Busted Min Value: " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min Value: " + myMinByteValue);
        System.out.println("Byte Max Value: " + myMaxByteValue);


        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min Value: " + myMinShortValue);
        System.out.println("Short Max Value: " + myMaxShortValue);

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min Value: " + myMinLongValue);
        System.out.println("Long Max Value: " + myMaxLongValue);

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);


    }
}
