package com.jenniferhatton;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println(previousResult);

        result = result - 1;
        System.out.println("3 - 1 = " + result);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 4;
        System.out.println("20 / 4 = " + result);

        result = result % 3;
        System.out.println("5 % 3 = " + result);

        //result + 1 is short cut to result++;
        //result - 1 is short cut to result--;
        //result = result + 2 is short cut to result += 2;
        //result = result * 2 is short cut to result *= 2;
        //result = result / 2 is short cut to result /= 2;
        //result = result - 2 is short cut to result -= 2;


        boolean isAlien = false;

        if (!isAlien) {
            System.out.println("It is not an alien!");
        }

        int topScore = 80;

        if (topScore >= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;

        if((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true.");
        }

        int newValue = 50;

        if(newValue == 50) {
            System.out.println("This is true!");
        }

        boolean isCar = false;

        if(isCar) {
            System.out.println("This is true!");
        }

        //ternary operator - takes 3 operands - shortcut for if-else statements
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar) {
            System.out.println("wasCar is true.");
        }


    }
}
