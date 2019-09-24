package com.jenniferhatton;

public class Main {

    public static void main(String[] args) {
	// write your code here

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;
        long crunchedLongValue = 50000L + (10L * (byteValue + shortValue + intValue));

        System.out.println(crunchedLongValue);
    }
}
