package com.jenniferhatton;

public class Main {

    public static void main(String[] args) {
	// write your code here

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float min value: " + myMinFloatValue);
        System.out.println("Float max value: " + myMaxFloatValue);


        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Double min value: " + myMinDoubleValue);
        System.out.println("Double max value: " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;

        System.out.println("Int value: " + myIntValue);
        System.out.println("Float value: " + myFloatValue);
        System.out.println("Double value: " + myDoubleValue);

        //Floating Point Precision Challenge - convert pounds to kilograms
        double pounds = 200d;
        double convertedToKilo = pounds * 0.453592d;
        System.out.println("There are " + convertedToKilo + " kilograms in " + pounds + " pounds.");


        
    }
}
