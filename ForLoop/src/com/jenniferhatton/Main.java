package com.jenniferhatton;

public class Main {

    public static void main(String[] args) {
        // write your code here

        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at + " + i + "% interest " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("-----------------------------");

        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at + " + i + "% interest " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("-----------------------------");

        for (int i = 8; i > 1; i--) {
            System.out.println("Test " + i);
        }


        System.out.println("-----------------------------");

        int count = 0;
        for(int i = 0; i < 25; i++) {
                if(isPrime(i) && count <= 3) {
                    System.out.println("This is a prime number: " +  i );
                }
                count++;
        }
    }



        public static boolean isPrime(int n){

        if (n == 1 || n == 0) {
            return false;
        }

        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


        public static double calculateInterest(double amount, double interestRate) {
            return amount * (interestRate / 100);
    }
}
