package com.jenniferhatton;

public class Main {

    public static void main(String[] args) {
        // primitive data types

        // byte 1 byte -128 to 127
        // short 2 bytes -32,768 to 32,767
        // int 4 bytes -2,147,483,648 to 2,147,483, 647
        // long 8 bytes -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        // float 4 bytes approximately ±3.40282347E+38F (6-7 significant decimal digits)
        // double 8 bytes approximately ±1.79769313486231570E+308 (15 significant decimal digits)
        // char 2 bytes 0 to 65,536 (unsigned)
        // boolean not defined precisely true or false

        String myString = "This is a string";
        System.out.println("myString is: " + myString);
        myString = myString + " and this is more stuff added to myString ";
        System.out.println(myString);
        myString = myString + "\u00A9 2019";
        System.out.println(myString);

        String numString = "243.11";
        String secondNumString = "3421.111";
        String totalString = numString + secondNumString;
        System.out.println(totalString);

        String lastString = "10";
        int myInt = 50;

        lastString = lastString + myInt;
        System.out.println(lastString);
        double newNum = 391.291;
        lastString = lastString + newNum;
        System.out.println(lastString);
    }
}
