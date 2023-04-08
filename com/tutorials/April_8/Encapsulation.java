package Tutorials.com.tutorials.April_8;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.April_8
 * @created_on - April 08-2023
 */
public class Encapsulation {
    /**
     * OOPS
     * 1. Encapsulation : To hide sensitive data from user
     * 2. Polymorphism
     * 3. Inheritance
     * 4. Abstraction
     */

    private String name;
    private int age;

    //Getter : For getting the data
    public String getName(){
        return name;
    }

    //Setter : For setting the data
    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Encapsulation() {
    }

    public Encapsulation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Encapsulation(String name) {
        this.name = name;
    }

    public Encapsulation(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Encapsulation{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
