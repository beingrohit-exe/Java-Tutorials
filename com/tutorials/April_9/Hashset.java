package Tutorials.com.tutorials.April_9;

import java.util.HashSet;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.April_9
 * @created_on - April 09-2023
 */
public class Hashset {
    public static void main(String[] args) {

        //Shows only unique elements
        HashSet<Integer> hashset = new HashSet();
        hashset.add(1);
        hashset.add(2);
        hashset.add(4);
        hashset.add(4);
        hashset.add(5);
        System.out.println(hashset);
    }
}
