package Tutorials.com.tutorials.April_11;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.April_11
 * @created_on - April 11-2023
 */
public class ThrowKeyword {

    static void method(int a){

        if (a<25){
            throw new ArithmeticException("Not valid");
        }
        else {
            System.out.println("Valid");
        }
    }
    public static void main(String[] args) {
        method(20);
    }
}

/**
 * Threads, File Handling
 */
