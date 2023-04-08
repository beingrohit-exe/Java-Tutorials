package Tutorials.com.tutorials.April_8;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.April_8
 * @created_on - April 08-2023
 */

class Fruits {
    public void Mango(){
        System.out.println("Fruit");
    }
}
public class Inheritance extends Fruits {
    @Override
    public void Mango() {
        super.Mango();
        System.out.println("Orange");
    }

    /**
     * We can inherit attributes and methods from one class to another
     */
    public static void main(String[] args) {
        Inheritance i = new Inheritance();
        i.Mango();
    }
}
