package Tutorials.com.tutorials.April_6;
/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.April_6
 * @created_on - April 06-2023
 */
public class class_methods {
    public static void main(String[] args) {
        class_two name = new class_two();
        int sum = name.sum(10, 40);
        System.out.println(sum);
        name.name2(70);

        constructor constructor = new constructor(1);
        constructor.a = 200;
        System.out.println(constructor.a);
    }
}

