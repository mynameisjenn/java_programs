package com.jenniferhatton;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        int result = 1 + 2;
//        System.out.println("1 + 2 = " + result);
//
//        int previousResult = result;
//        result = result - 1;
//        System.out.println(previousResult + " - 1 = " + result);
//
//        previousResult = result;
//        result = result * 10;
//        System.out.println(previousResult + " * 10 = " + result);
//
//        previousResult = result;
//        result = result / 5;
//
//        System.out.println(previousResult + " / 5 = " + result);
//
//        previousResult = result;
//        result = result % 3;
//
//        System.out.println(previousResult + " % 3 = " + result);
//
//        previousResult = result;
//        result = result + 1;
//        System.out.println("Result is now: " + result);
//        result++;
//        System.out.println("Result is now: " + result);
//        result--;
//        System.out.println("Result is now: " + result);
//        result+= 2;
//        System.out.println("Result is now: " + result);
//        result*= 10;
//        System.out.println("Result is now: " + result);
//        result-=10;
//        System.out.println("Result is now: " + result);
//        result/= 10;
//        System.out.println("Result is now: " + result);
//
//        boolean isAlien = false;
//        if (isAlien == false)
//            System.out.println("It is not an alien!");
//
//        int topScore = 80;
//        if(topScore >= 100)
//            System.out.println("You got the top score!");
//
//        int secondTopScore = 95;
//        if((topScore > secondTopScore) && (topScore < 100))
//            System.out.println("Greater than top score, less than 100.");
//
//        if((topScore > 90 ) || (secondTopScore <= 90))
//            System.out.println("One of these tests is true!");
//
//        int newValue = 50;
//        if(newValue == 50)
//            System.out.println("This is a true!");
//
//        boolean isCar = false;
//        if (isCar == true)
//            System.out.println("Car is true.");
//
//
//        isCar = true;
//        boolean wasCar = isCar ? true : false;
//        if(wasCar)
//            System.out.println("wasCar is true!");

        double firstValue = 20;
        double secondValue = 80;

        double result = (firstValue + secondValue) * 25;
        double newResult = result % 40;

        if (newResult <= 20)
            System.out.println("Total was over the limit!");
    }
}
