package Tutorials.com.tutorials.April_11;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.April_11
 * @created_on - April 11-2023
 */
public class Exceptions {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmatic Exception : " + e);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Array Exception");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
