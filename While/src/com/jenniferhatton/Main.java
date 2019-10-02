package com.jenniferhatton;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 1;
        while(count != 6) {
            System.out.println(count);
            count++;
        }

        System.out.println("--------------------------");

        for(int i = 1; i < 6; i++) {
            System.out.println(i);
        }

        System.out.println("--------------------------");

        count = 1;
        do {
            System.out.println(count);
            count++;
        } while(count != 6);

        System.out.println("--------------------------");

        int number = 0;
        while(number < 15) {
            number++;

            if(number <= 5) {
                System.out.println("Skipping: " + number);
                continue;
            }

            System.out.println("Number: " + number);

            if(number >= 10) {
                System.out.println("Breaking at " + number);
                break;
            }
        }
    }
}
