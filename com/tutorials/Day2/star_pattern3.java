package Tutorials.com.tutorials.Day2;

/**
 * @author - star_pattern3
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.Day2
 * @created_on - April 03-2023
 */
public class star_pattern3 {
    public static void main(String[] args) {
        /**
         * 8
         * 8 8
         * 8 8 8
         * 8 8 8 8
         * 8 8 8
         * 8 8
         * 8
         */

        int rows = 5;
        for (int i=1 ; i<=rows ; i++){
            for (int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=2 ; i<=rows ; i++){
            for (int j=i ; j<=rows ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
