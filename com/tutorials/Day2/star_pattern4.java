package Tutorials.com.tutorials.Day2;

/**
 * @author - star_pattern4
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.Day2
 * @created_on - April 04-2023
 */
public class star_pattern4 {
    public static void main(String[] args) {
        /**
         *         8
         *       8 8
         *     8 8 8
         *   8 8 8 8
         * 8 8 8 8 8
         */
        int rows =5;
        for (int i=0 ; i<rows ; i++){
            for (int j=rows-i ; j>=0 ; j--){
                System.out.print(" ");
            }
            for(int j=0 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
