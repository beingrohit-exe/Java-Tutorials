package Tutorials.com.tutorials.Day2;

import Tutorials.com.tutorials.April_6.java_methods;

/**
 * @author - for_loop
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.Day2
 * @created_on - April 03-2023
 */
public class for_loop {
    public static void main(String[] args) {
        /**
         * for(one ; two ; three){
         *     //loop
         * }
         */

        /**
         * a = a+2   ==  a+=2 ->  a = a + 2
         */
//        int a;
        for (int a=0 ; a<7 ; a++){
            if (a==4) continue;
            System.out.println(a);

            java_methods.method1();

        }
//        System.out.println(a);
    }
}
