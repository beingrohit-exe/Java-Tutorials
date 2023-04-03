package Tutorials.com.tutorials.Day2;

/**
 * @author - start_pattern1
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.Day2
 * @created_on - April 03-2023
 */
public class start_pattern1 {
    public static void main(String[] args) {
        /**
         * *
         * **
         * ***
         * ****
         * *****
         */
        int rows = 5;
        for (int i=1 ; i<=rows ; i++){
            for (int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
