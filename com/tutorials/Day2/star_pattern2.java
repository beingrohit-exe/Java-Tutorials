package Tutorials.com.tutorials.Day2;

/**
 * @author - star_pattern2
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.Day2
 * @created_on - April 03-2023
 */
public class star_pattern2 {
    public static void main(String[] args) {
        /**
         * *****
         * ****
         * ***
         * **
         * *
         */
        int rows = 5;
        for (int i=1 ; i<=rows ; i++){
            for (int j=i ; j<=rows ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
