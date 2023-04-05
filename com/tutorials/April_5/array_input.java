package Tutorials.com.tutorials.April_5;

import java.util.Scanner;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.March_5
 * @created_on - April 05-2023
 */
public class array_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length : ");
        int i1 = sc.nextInt();
        int[] array = new int[i1];
//        array[0] = 10;
//        array[1] = 2;
//        array[2] = 4;
//        array[3] = 20;
//        array = new int[]{43, 5, 7, 4};
//        String[] stringArray = new String[10];

//        array[0] = sc.nextInt();
//        array[1] = sc.nextInt();
//        array[2] = sc.nextInt();
//        array[3] = sc.nextInt();
        for (int i=0 ; i<array.length ; i++){
            System.out.println("Enter for Index "+ i + " :");
            array[i] = sc.nextInt();
        }

        //For Printing
        for (int i=0 ; i<array.length ; i++){
            int a = array[i];
            System.out.print(a + " , ");
        }

//        For Each
        for(int a : array){
            System.out.println(a);
        }
    }
}
