package com.jenniferhatton;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        char charValue = 'F';

    switch (charValue) {

        case 'A': case 'B': case 'C': case 'D': case 'E':
            System.out.println("Value is " + charValue);
            break;

            default:
                System.out.println("The switch value is not found.");

    }

    String month = "March";

    switch (month.toLowerCase(Locale.forLanguageTag(month))) {

        case "january": case "february": case "march": case "april": case "may": case "june":
        case "july": case "august": case "september": case "october": case "november": case "december":

            System.out.println("It's the month of " + month + ".");
            break;
            default:
                System.out.println("Month not found.");
    }

    }
}
