package com.jenniferhatton;

public class Main {

    public static void main(String[] args) {

		double valueOne = 20.00d;
		double valueTwo = 80.00d;

		double result = (valueOne + valueTwo) * 100;
		System.out.println(result);

		double remainder = result % 40.00d;
		System.out.println(remainder);

		boolean isZero = (remainder == 0) ? true : false;
		System.out.println(isZero);

		if (!isZero) {
			System.out.println("Got some remainder!");
		}
    }
}
