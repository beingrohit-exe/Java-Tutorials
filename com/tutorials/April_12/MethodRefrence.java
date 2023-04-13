package Tutorials.com.tutorials.April_12;

import java.util.ArrayList;
import java.util.List;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.April_12
 * @created_on - April 12-2023
 */
public class MethodRefrence {
    /**
     * static method
     */

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Rohit");
        list.add("Sachin");
        list.add("Rishab");
        list.add("Rakesh");

//        for (String a : list){
//            System.out.println(a);
//        }

        list.forEach(a-> {
            String substring = a.substring(0, 4);
            System.out.println(substring);
        });

        //Method Refrence
        list.forEach(System.out::println);
    }
}
