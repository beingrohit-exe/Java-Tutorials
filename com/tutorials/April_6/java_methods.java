package Tutorials.com.tutorials.April_6;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.April_6
 * @created_on - April 06-2023
 */
public class java_methods {
    /**
     * static -> Method belongs to the origin class
     * void -> has no return type
     * methodName -> name()
     *
     * private -> On accessible in that class
     *
     */

    public static void method1(){
        //Method Body
        for (int i=0 ; i<10 ; i++){
            System.out.println(i);
        }
    }


    public static void main(String[] args) {
        method1();
        method1();
    }
}
