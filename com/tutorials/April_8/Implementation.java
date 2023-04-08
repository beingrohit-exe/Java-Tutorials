package Tutorials.com.tutorials.April_8;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.April_8
 * @created_on - April 08-2023
 */
public class Implementation implements Interfaces, SecondInterface{
    @Override
    public void vehicle() {
        System.out.println("Cars");
    }

    @Override
    public String car(String name) {
        return "Car name : " + name;
    }

    @Override
    public void Bikes() {

    }
}

class MyCar {
    public static void main(String[] args) {
        Implementation i = new Implementation();
        String creta = i.car("Creta");
        System.out.println(creta);
    }
}
