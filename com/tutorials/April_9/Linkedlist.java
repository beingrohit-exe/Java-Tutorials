package Tutorials.com.tutorials.April_9;

import java.util.LinkedList;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.April_9
 * @created_on - April 09-2023
 */
public class Linkedlist {
    public static void main(String[] args) {
        /**
         *
         * _ _ _ _ _
         *  (N) -> (N) -> (N) -> (N) -> null
         *             (N)
         *  ArrayList -> For storing and accessing the data
         *  LinkedList -> Data Manipulation
         *
         *  both comes List Interface
         *
         *  addFirst(), addLast(), removeLast(), removeFirst(), getLast(), getFirst()
         *
         */

        LinkedList<Integer> linkedlist = new LinkedList();
        linkedlist.addFirst(20);
        linkedlist.addFirst(10);
        System.out.println(linkedlist);
    }
}
