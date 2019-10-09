package com.jenniferhatton;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String numberAsString = "2019.102";
        System.out.println("numberAsString = " + numberAsString);

        double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

//        int numberTwo = Integer.parseInt(numberAsString);
//        System.out.println("number = " + numberTwo);

        numberAsString += 1;
        System.out.println(numberAsString);
        number += 1;
        System.out.println(number);
    }
}
