package com.jenniferhatton;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        long days = hours / 24;
        long remainingHours = hours % 24;

        long years = days / 365;
        long remainingDays = days % 60;

        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
}
