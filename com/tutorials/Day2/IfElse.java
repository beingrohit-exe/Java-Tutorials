package Tutorials.com.tutorials.Day2;
import java.util.*;
/**
 * @author - IfElse
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.Day2
 * @created_on - April 03-2023
 */
public class IfElse {
    /**
     * <
     * >
     * >=
     * <=
     *
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = scanner.nextInt();
        System.out.println(age>16);
        if (age>16){
            System.out.println("You are eligible for Car License");

            //Nested if else condition
//            if (age>18){
//                System.out.println("You are eligible for Car License and Scooty");
//            }
//            else{
//                System.out.println("You are eligible for Scooty");
//            }
        }
        else if(age>16){
            System.out.println("You are eligible for Scooty");
        }
        else {
            System.out.println("You are not eligible");
        }
    }
}


/**
 * if (boolean condition == true){
 *    //Execute
 * } else {
 *     //boolean == false
 * }
 */
