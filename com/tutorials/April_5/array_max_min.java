package Tutorials.com.tutorials.April_5;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.March_5
 * @created_on - April 05-2023
 */
public class array_max_min {
    public static void main(String[] args) {
        int[] array = {2,6,1,4,8,5,7};
        int max = array[0];
        for (int i=1 ; i<array.length ; i++){
            if (array[i]>max){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
