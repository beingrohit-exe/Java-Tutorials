package Tutorials.com.tutorials.April_8;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.April_8
 * @created_on - April 08-2023
 */
abstract class abstraction {
    public abstract void car();
    public abstract void Bike();
}

class Vehicle extends abstraction{

    @Override
    public void car() {
        System.out.println("This is a Car");
    }

    @Override
    public void Bike() {
        System.out.println("This is a Bike");
    }
}

class Moving extends abstraction{

    @Override
    public void car() {
        System.out.println("Coming from Moving class for car");
    }

    @Override
    public void Bike() {
        System.out.println("Coming from Moving class for bike");
    }
}

class RunnableClass {
    public static void main(String[] args) {

//        Making object of Vehicle class
        Vehicle v = new Vehicle();
        v.car();
        v.Bike();

        Moving m = new Moving();
        m.car();
        m.Bike();
    }
}
