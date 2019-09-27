package com.jenniferhatton;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int count = 0;
        for(int i = 10; i < 50; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("This is a prime number: " +  i );
                if(count == 3) {
                    System.out.println("Exiting the loop!");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n){

        if (n == 1) {
            return false;
        }

        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
