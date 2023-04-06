package Tutorials.com.tutorials.April_6;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.April_6
 * @created_on - April 06-2023
 */
public class method_parametres {
    public static void main(String[] args) {
        int i = (char)sumMethod(10, 20, "rohit");
        sumMethod(10,20);
        System.out.println(i);
    }

    static int sumMethod(int a, int b, String name){
        int length = name.length();
        int sum = a+b;
        return sum;
    }

    static int sumMethod(int a, int b){
        int sum = a+b;
        return sum;
    }
}
