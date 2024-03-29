package com.jenniferhatton;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        calculateScore("Jennifer", 5 );
//        calculateScore(9);
//        calculateScore();

        System.out.println(calculateFeetAndInchesToCentimeters(13, 1));
        System.out.println(calculateFeetAndInchesToCentimeters(0, 0));
        System.out.println(calculateFeetAndInchesToCentimeters(65));

    }


    public static double calculateFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 ||inches > 12) {
            System.out.println("Invalid parameters.");
            return -1;
        }
        double centimeters = (feet * 12 + inches) * 2.54;
        System.out.println(feet + " ft and " + inches + " is equal to " + centimeters );
        return centimeters;
    }

    public static double calculateFeetAndInchesToCentimeters(double inches) {
        if(inches < 0) {
            return -1;
        } else{
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches.");
            return calculateFeetAndInchesToCentimeters(feet, remainingInches);
        }
    }



//    public static int calculateScore(String playerName, int score) {
//        System.out.println("Player " + playerName + " scored " + score + " points.");
//        return score * 1000;
//    }
//
//    public static int calculateScore(int score) {
//        System.out.println("Unnamed Player scored " + score + " points.");
//        return score * 1000;
//    }
//
//    public static int calculateScore() {
//        System.out.println("No player name and no score.");
//        return 0;
//    }
}
