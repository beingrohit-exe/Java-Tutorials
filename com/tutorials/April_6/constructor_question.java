package Tutorials.com.tutorials.April_6;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.April_6
 * @created_on - April 06-2023
 */
public class constructor_question {

    String name;
    int age;

//    constructor_question(String name, int age){
//        this.name = name;
//        this.age = age;
//    }

    public static void main(String[] args) {
//        constructor_question ab = new constructor_question("Rohit", 25);
//        constructor_question ab1 = new constructor_question("Sachin", 20);
//        constructor_question ab2 = new constructor_question("Rishab", 26);
        constructor_question ab = new constructor_question();
        ab.name = "Rohit";
        ab.age = 24;

        constructor_question ab1 = new constructor_question();
        ab1.name  = "Scahin";
        ab1.age = 20;


//        System.out.println("Name : " + ab.name + " Age : " + ab.age);
//        System.out.println("Name : " + ab1.name + " Age : " + ab1.age);
//        System.out.println("Name : " + ab2.name + " Age : " + ab2.age);
    }
}
