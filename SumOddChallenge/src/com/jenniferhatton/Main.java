package com.jenniferhatton;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isOdd(3));
        System.out.println(sumOdd(5, 10));


    }

    public static boolean isOdd(int number) {
        if(number < 0) {
            return false;
        }

        if(number % 2 != 0) {
            return true;
        }
        return false;
    }


    public static int sumOdd(int start, int end) {

        if(end < start || start < 0) {
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
