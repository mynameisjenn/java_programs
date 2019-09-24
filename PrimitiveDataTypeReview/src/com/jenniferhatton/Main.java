package com.jenniferhatton;

public class Main {

    public static void main(String[] args) {
	    //byte - rarely use this
        //boolean - common rue
        //char - sometimes
        //short - rarely
        //integer - common use
        //long - sometimes
        //float - rarely
        //double - common use

        //String not a data type - it's actually a class - sequence of characters

        String myString = "This is a string";

        System.out.println("My string is = " + myString);
        myString = myString + " and this is more!";
        System.out.println("My string is = " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("My string is = " + myString);

        //Strings in Java are immutable - they don't change they just get recreated as a new string
    }
}
