package Tutorials.com.tutorials.Day2;

import java.util.Scanner;

/**
 * @author - switch_case
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.Day2
 * @created_on - April 03-2023
 */
public class switch_case {
    public static void main(String[] args) {
        /**
         * switch(expression) {
         *     case 1:
         *          //To be executed
         *          break;
         *     case 2:
         *          //To be executed
         *          break;
         *     default:
         *          //code
         * }
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day : " );
        int day = sc.nextInt();

        switch (day) {
            case 1 :
                System.out.println("Monday");
                //break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
