package com.jenniferhatton;

public class Main {

    public static void main(String[] args) {
	// write your code here
        sumOdd(1, 100);
        sumOdd(-1, 100);
        sumOdd(100, 100);
        sumOdd(13, 13);
        sumOdd(100, -100);
        sumOdd(100, 1000);


    }

    public static boolean isOdd(int number) {
        if(number < 0) {
            return false;
        }

        if(number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static int sumOdd(int start, int end) {

        if(end < start || start < 0) {
            System.out.println("-1");
            return -1;
        }

        int sum = 0;
        for(int i = start; i <= end; i++)
            if(isOdd(i)) {
                sum += i;
            }
        System.out.println(sum);
        return sum;
    }
}
