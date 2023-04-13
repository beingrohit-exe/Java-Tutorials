package Tutorials.com.tutorials.April_12;

import java.util.Random;
import java.util.UUID;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.April_12
 * @created_on - April 12-2023
 */
public class RandomApi {
    public static void main(String[] args) {
        Random random = new Random();
        random.ints().limit(20).sorted().filter(e-> e>0).forEach(System.out::println);
        String s = UUID.randomUUID().toString();
        int i = new Random().nextInt(4000);

        int i1 = random.nextInt(999999);
        System.out.println(i1);
    }
}
