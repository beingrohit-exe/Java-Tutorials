package Tutorials.com.tutorials.April_8;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.April_8
 * @created_on - April 09-2023
 */
public class ChartArray {
    public static void main(String[] args) {
        int[] array = {5,2,7,1,8,4};

        int max = array[0];
        for (int j : array){
            if (j > max) max = j;
        }
        for (int floor = max ; floor >=1 ; floor--){  //8 7 6 5
            for (int building=0 ; building<array.length ; building++){
                if (array[building]>=floor){
                    System.out.print("*\t");
                }
                else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
}
