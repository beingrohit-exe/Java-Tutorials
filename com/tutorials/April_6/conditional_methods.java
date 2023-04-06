package Tutorials.com.tutorials.April_6;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.April_6
 * @created_on - April 06-2023
 */
public class conditional_methods {
    static int name(int a, int b){
        int sum = a+b;
        if (sum>20){
            return sum;
        }
//        else {
//            return 100;
//        }
        return 100;
    }
    public static void main(String[] args) {
        int name = name(7, 0);
        System.out.println(name);
    }
}
