package Tutorials.com.tutorials.April_9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.April_9
 * @created_on - April 09-2023
 */
public class iterators {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Creta");
        list.add("Baleno");
        list.add("Venue");
        list.add("Breeza");

        Iterator<String> iterator = list.iterator();

        System.out.println(iterator.next());

        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(iterator.next());
            if (next.length()>5){
                iterator.remove();
            }
        }
    }
}
