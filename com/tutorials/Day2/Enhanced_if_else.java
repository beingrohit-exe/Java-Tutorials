package Tutorials.com.tutorials.Day2;

import java.util.Scanner;

/**
 * @author - Enhanced_if_else
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.Day2
 * @created_on - April 03-2023
 */
public class Enhanced_if_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age>16)
            System.out.println("Eligible");
        else
            System.out.println("Not Eligible");
    }
}
