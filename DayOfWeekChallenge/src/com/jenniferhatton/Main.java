package com.jenniferhatton;

public class Main {

    public static void main(String[] args) {
        // write your code here
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(9);
        printDayOfWeek(-1);
    }

        public static void printDayOfWeek(int day) {

            switch (day) {
                case 0:
                    System.out.println("Sunday");
                    break;

                case 1:
                    System.out.println("Monday");
                    break;

                case 2:
                    System.out.println("Tuesday");
                    break;

                case 3:
                    System.out.println("Wednesday");
                    break;

                case 4:
                    System.out.println("Thursday");
                    break;

                case 5:
                    System.out.println("Friday");
                    break;

                case 6:
                    System.out.println("Saturday");
                    break;

                default:
                    System.out.println("Invalid day");
            }
    }
}
