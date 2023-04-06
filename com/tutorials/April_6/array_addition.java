package Tutorials.com.tutorials.April_6;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.April_6
 * @created_on - April 06-2023
 */
public class array_addition {
    public static void main(String[] args) {
        int[] a1 = {9,6,4,7,5};
        int[] a2 = {6,7,2,1};
        int[] sum = new int[Math.max(a1.length, a2.length)];
        int k = sum.length-1;
        int i = a1.length-1;
        int j = a2.length-1;
        int carry = 0;
        while(k>=0){
            int d=carry;
            if (i>=0) d+= a1[i];  //d=5
            if (j>=0) d+=a2[j];   //d=6
            carry = d/10; // carry = 0
            d=d%10; // d=6
            sum[k] = d;
            i--;
            j--;
            k--;
        }
        if (carry!=0) System.out.println(carry);
        for (int array : sum){
            System.out.println(array);
        }
    }
}
