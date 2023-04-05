package Tutorials.com.tutorials.April_5;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.March_5
 * @created_on - April 05-2023
 */
public class string_array {
    public static void main(String[] args) {
        String[] str = {"rohit", "rishab", "sachin"};
        for (int i=0 ; i<str.length ; i++){
            String stringData = str[i];
            if (stringData.length()<=5){
                String s = stringData.toUpperCase();
                str[i] = s;
            }
            System.out.println(str[i]);
        }
    }
}
