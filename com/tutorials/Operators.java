package com.tutorials;

/**
 * @author - Operators
 * @project - Java DSA
 * @package - com.tutorials
 * @created_on - April 02-2023
 */
public class Operators {
    /**
     * Addition +
     * Subtraction -
     * Multiplication *
     * Division /
     * Modulus %
     * Increment ++   Plus by 1
     * Decrement -- or -   Subtract by 1   -a  --a
     * Equal to ==   return boolean
     * Not Equal !=  return boolean
     * Greater >   Lesser <    return boolean
     * Greater equal > =  lesser equal < =  return boolean
     * &&  Logical And     a==b && a==c  x<10 && x<7   x=5
     * || Logical Or    a==b || a==c  x<10 || x<7   x=8
     * ! Logical Not    !a==b   a=false   !a = true
     *
     */
    public static void main(String[] args) {
        String name = "Rohit";
        System.out.printf("My name is %s %s", name, "Parihar");
        System.out.println();

        int number = 2525;
        System.out.println(number%10);
        System.out.println(number/10);

        String name1 = "rohit";

        char c = name1.charAt(4);
        String name2 = new String("rohit");
        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));
        System.out.println(name1.length());
        System.out.println(name1.toUpperCase());
        System.out.println(name1.concat(name2));
        System.out.println(name1 + " Parihar");

        /**
         * 0   1   2   3   4   5   6
         * R   O   H   I   T   P   A
         */
        System.out.println(name1.substring(1, 5));
        System.out.println(name1.charAt(4));
        String hello = "    rishab    ";
        System.out.println(hello.trim());
//        System.out.println(name1==name2);

        StringBuilder stringBuilder = new StringBuilder("rhit");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.insert(1, 'o'));
    }
}
