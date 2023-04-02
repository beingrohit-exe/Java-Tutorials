package com.tutorials;

/**
 * @author - TypeCasting
 * @project - Java DSA
 * @package - com.tutorials
 * @created_on - April 02-2023
 */
public class TypeCasting {
    public static void main(String[] args) {

        //Narrowing Casting
        /**
         * byte -> short -> char -> int -> long -> float -> double
         */
        int a = (int)10.90;

        //Widening Casting
        /**
         *  byte <- short <- char <- int <- long <- float <- double
         */
        int b = 10;
        double d = b;
        System.out.println(a);  //10
        System.out.println(b);  //10
        System.out.println(d);  //10.0


    }
}
