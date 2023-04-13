package Tutorials.com.tutorials.April_12;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.April_12
 * @created_on - April 12-2023
 */
public class lambda {

    interface InitialMessage{
        void message1(String message);
    }
    public static void main(String[] args) {
        String one = "Hello";
        InitialMessage initialMessage = message -> System.out.println(one + " " + message);
        initialMessage.message1("Rohit");
    }
}
