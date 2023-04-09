package Tutorials.com.tutorials.April_9;

import java.util.*;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.April_9
 * @created_on - April 09-2023
 */
public class Arraylist {
    /**
     * [1, 2, 3, 4, 5]
     * [ , , , , ]  -> [1, 2, 3, 4, 5, _, _, _, _, _]
     */

    public static void main(String[] args) {
        ArrayList<String> vehicle = new ArrayList<>();
        //List<String> vehicle = new ArrayList<>();
        vehicle.add("Creta");
        vehicle.add("Baleno");
        vehicle.add("Venue");
        vehicle.add("Breeza");

        String s = vehicle.get(1);

        //For setting data at given index and remove from initial position
        vehicle.set(1, "Salavia");

        //for adding multiple items
        vehicle.addAll(List.of("Creata", "Venue", "Baleno", "Breeza"));
        System.out.println(vehicle);

        //remove at particular index
        vehicle.remove(1);

        //clear arraylist
        //vehicle.clear();

        //Index of given object
        int i = vehicle.indexOf("Venue");

        //checking if object present or not
        boolean brreza = vehicle.contains("Breeza");

//        boolean venue = vehicle.equals("Venue");
        System.out.println(i);

        int size = vehicle.size();

        //Sorting ArrayList
        Collections.sort(vehicle);

        //Convert to Array of Object
        Object[] objects = vehicle.toArray();
        for (Object a : objects){
            System.out.println(a);
        }
        System.out.println(size);

//        for (int a=0 ; a<vehicle.size() ; a++){
//            System.out.println(vehicle.get(a));
//        }
    }
}
