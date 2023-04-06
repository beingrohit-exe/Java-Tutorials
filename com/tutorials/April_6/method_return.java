package Tutorials.com.tutorials.April_6;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.April_6
 * @created_on - April 06-2023
 */
public class method_return {
    static int sumMethod() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        return sum;
    }

    static String stringMethod(){
        String a = "Rohit Parihar";
        String substring = a.substring(6);
        return substring;
    }
    static int[] arrayMethod() {
        int [] array = {1,2,4,5,6,7};
        return array;
    }


    public static void main(String[] args) {
        int sum = sumMethod();
        System.out.println(sum);
        System.out.println(stringMethod());
    }
}
