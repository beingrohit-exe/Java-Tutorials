package Tutorials.com.tutorials.April_11;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.April_11
 * @created_on - April 11-2023
 */
public class ArrayException {
    public static void main(String[] args) {
        int[] array = {1,2,4,5,6,7};
        try{
            System.out.println(array[8]);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmatic Exception : " + e);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Array Exception" + ex.getMessage());
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally Executed");
        }
        int a=10;
        if (a>7){
            System.out.println(a);
        }
    }
}
