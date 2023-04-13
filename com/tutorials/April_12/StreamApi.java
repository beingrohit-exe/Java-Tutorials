package Tutorials.com.tutorials.April_12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.April_12
 * @created_on - April 12-2023
 */
public class StreamApi {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Rohit");
        list.add("Sachin");
        list.add("Rishab");
        list.add("Rakesh");

        String name = "rohit";


        List<String> collect = list.stream().filter(e -> e.length() >5).collect(Collectors.toList());

//        List<Integer> collect1 = list.stream().map(e -> e.length()).collect(Collectors.toList());

        List<Integer> collect1 = list.stream().map(String::length).collect(Collectors.toList());


        List<String> uppercase = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        List<char[]> collect3 = list.stream().map(String::toCharArray).collect(Collectors.toList());

        List<Integer> collect2 = list.stream().filter(e -> e.length() > 5).map(e -> e.length()).collect(Collectors.toList());
        System.out.println(collect2);
        System.out.println(collect3);

        collect3.forEach(e-> {
            for (Character c : e){
                System.out.println(c);
            }
        });

    }
}
