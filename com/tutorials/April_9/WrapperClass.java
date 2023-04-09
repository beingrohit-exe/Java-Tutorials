package Tutorials.com.tutorials.April_9;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.April_9
 * @created_on - April 09-2023
 */
public class WrapperClass {
    /**
     * int -> Integer
     * long -> Long
     * boolean -> Boolean
     * char -> Character
     * float -> Float
     * double -> Double
     */

    int a = 5;
    static Integer b = 5;

    public static void main(String[] args) {
        int i = b.intValue();
    }
}
