package Tutorials.com.tutorials.April_12;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.April_12
 * @created_on - April 12-2023
 */
public class lambdawithparameter {
    public static void main(String[] args) {
        InitialMessage initialMessage = (a, b) -> a+b;
        int sum = initialMessage.sum(10, 20);
        System.out.println(sum);

        StringInterface stringInterface = (a, b) -> b.substring(0, a);
        String rohitParihar = stringInterface.stringMessage(5, "Rohit Parihar");
        System.out.println(rohitParihar);
    }

    interface InitialMessage{
        int sum(int a, int b);
    }

    interface StringInterface{
        String stringMessage(int a, String b);
    }
}
