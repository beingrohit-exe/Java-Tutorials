package Tutorials.com.tutorials.April_11;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.April_11
 * @created_on - April 11-2023
 */
public class BinarySearch {
    public static void main(String[] args) {
        /**
         *
         */

        int[] array = {1,2,4,5,6,7,8};
        int data = 2;
        int high = array.length-1;
        int low = 0;
        while(low<=high){
            int mid = (high+low)/2;
            if(array[mid]>data){
                high = mid-1;
            }
            else if(array[mid]<data){
                low = mid+1;
            }
            else {
                System.out.println(mid);
                return;
            }
        }
    }
}
