package Tutorials.com.tutorials.April_8;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.April_8
 * @created_on - April 08-2023
 */
public class PolyMorphism {
    /**
     *
     */

    public static void main(String[] args) {
        Car a = new Suzuki();
        a.car();
        Hyundai h = new Hyundai();
        h.car();
        h.bike();

        int[] array = new int[5];   //  array 4k   |     [4k_ 4k04_ 4k08_ 4k12_ 4k16_]
    }
}

class Car {
    public void car(){
        System.out.println("Hyundai Creta");
    }

    public void bike(){
        System.out.println("Bike");
    }
}

class Hyundai extends Car{
    public void car(){
        System.out.println("Creta");
    }
}

class Suzuki extends Car {
    public void car(){
        System.out.println("Suzuki Baleno");
    }
}