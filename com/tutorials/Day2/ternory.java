package Tutorials.com.tutorials.Day2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * @author - ternory
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.Day2
 * @created_on - April 03-2023
 */
public class ternory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println(age>16 ? "Eligible" : "Not Eligible");
    }
}
