package Tutorials.com.tutorials.Day2;

import java.util.Scanner;

/**
 * @author - table
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.Day2
 * @created_on - April 03-2023
 */
public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        /**
         *   num  a   multiplication
         *   2 * 1 = 2
         *   2 * 2 = 4
         *   .
         *   .
         *   .
         *   .
         *   2 * 10 = 20
         */
        System.out.println("Enter initial value : ");
        int a = sc.nextInt();
        System.out.println("Enter End : ");
        int end = sc.nextInt();

        while (a<=end) {
//            int multi = num * a;
//            System.out.println(num + " * " + a + " " + " = " + multi);
            System.out.println(num + " * " + a + " " + " = " + num * a);
            a++;
        }
    }
}
