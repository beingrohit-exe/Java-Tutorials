package Tutorials.com.tutorials.April_8;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.April_8
 * @created_on - April 08-2023
 */
public class Modifiers {
    /**
     * Access Modifiers
     * public, private, default, protected
     *
     * Non-Access Modifiers
     * final, abstract
     *
     * public : Code accessible all classes
     * private : Only accessible within same class where it declared
     * default : Same package
     * protected : Same package and subclasses
     *
     * final : cannot modified, not be inherited
     * abstract : classes cannot be used to create objects
     *
     * static
     */
    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        //Encapsulation e = new Encapsulation("Rohit", 24);
        e.setName(null);
        e.setAge(24);

        System.out.println(e.getName());
        System.out.println(e.getAge());

        System.out.println(e);
    }

}
