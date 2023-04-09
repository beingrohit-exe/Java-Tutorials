package Tutorials.com.tutorials.April_9;

import java.util.HashMap;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.April_9
 * @created_on - April 09-2023
 */
public class Maps {
    /**
     * Map stores values in key/value pair
     */
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<String, String> mapInteger = new HashMap<>();

        //adding values
        map.put(1, "Rohit");
        map.put(2, "Rishab");
        map.put(4, "Sachin");
        map.put(5, "Sher");


        String s = map.get(3);
//        String remove = map.remove(5);
//        System.out.println(remove);

        int size = map.size();
        map.replace(4, "Lion");
        System.out.println(map);
        System.out.println(size);

        for (Integer a : map.keySet()){
            System.out.println(a);
        }

        for (String a : map.values()){
            System.out.println(a);
        }

        for (Integer a : map.keySet()){
            System.out.println(a + " = " + map.get(a));
        }
    }
}
