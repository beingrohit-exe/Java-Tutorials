package Tutorials.com.tutorials.April_8;

import java.util.Scanner;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.April_8
 * @created_on - April 09-2023
 */
public class SearchArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length : ");
        int length = sc.nextInt();

        int[] array = new int[length];

        for (int i=0 ; i<array.length ; i++){
            System.out.print("Enter data for Index " + i + " : ");
            array[i] = sc.nextInt();
            System.out.println();
        }
        System.out.println("Enter data to search : ");
        int data = sc.nextInt();
        int index = -1;
        for (int i=0; i<array.length ; i++){
            if (array[i]==data){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
