package com.jenniferhatton;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int switchValue = 4;

        switch (switchValue) {

            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
                System.out.println("Value was 3");
                break;

            case 4: case 5: case 6:
                System.out.println("Value was 4, 5, or 6");
                break;

             default:
                 System.out.println("Value was not 1, 2, 3, 4, 5 or 6");
                 break;
        }



        char charValue = 'T';

    switch (charValue) {

        case 'A': case 'B': case 'C': case 'D': case 'E':
            System.out.println("Value is " + charValue);
            break;

            default:
                System.out.println("The switch value is not found.");
                break;

    }

    String month = "March";

    switch (month.toLowerCase(Locale.forLanguageTag(month))) {

        case "january": case "february": case "march": case "april": case "may": case "june":
        case "july": case "august": case "september": case "october": case "november": case "december":

            System.out.println("It's the month of " + month + ".");
            break;
            default:
                System.out.println("Month not found.");
                break;
    }

    }
}
