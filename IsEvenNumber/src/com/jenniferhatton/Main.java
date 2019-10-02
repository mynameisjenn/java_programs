package com.jenniferhatton;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int number = 4;
        int last = 20;
        int count = 0;

        while(number <= last) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            count++;
            System.out.println("Even number is: " + number);
                if(count == 5) {
                    break;
                }
        }
        System.out.println("There are " + count + " even numbers.");

    }

    public static boolean isEvenNumber(int number) {
        if(number % 2 == 0) {
            return true;
        }
        return false;
    }
}
