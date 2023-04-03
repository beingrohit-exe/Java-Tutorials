package Tutorials.com.tutorials.Day2;

/**
 * @author - nested_for_loop
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.Day2
 * @created_on - April 03-2023
 */
public class nested_for_loop {
    public static void main(String[] args) {
        for (int i=0 ; i<7 ; i++){
            System.out.println("Inside I loop : " + i);  //1 -> 0
            for (int j=0 ; j<7 ; j++){
                System.out.print("From J loop : " + j + " "); // 1 -> 0,1,2,3,4,5,6
            }
            System.out.println();
        }
    }
}
