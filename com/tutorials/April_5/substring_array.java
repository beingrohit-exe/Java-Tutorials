package Tutorials.com.tutorials.April_5;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.March_5
 * @created_on - April 05-2023
 */
public class substring_array {
    public static void main(String[] args) {
        String str = "Rohitob";
        int i1 = str.indexOf('o');
        int i2 = str.lastIndexOf('o');
        int i3 = str.indexOf("o", 4);
        System.out.println(i3);
        System.out.println(i2);
//        char[] chars = str.toCharArray();
        for (int i=0 ; i<str.length() ; i++){
            for (int j=i ; j<str.length() ; j++){
                String substring = str.substring(j);
                System.out.print(substring + " ");
            }
            System.out.println();
        }
    }
}
