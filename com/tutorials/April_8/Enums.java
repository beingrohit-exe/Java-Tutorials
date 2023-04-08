package Tutorials.com.tutorials.April_8;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.April_8
 * @created_on - April 08-2023
 */
enum Enums {
    MALE,
    FEMALE,
    RATHER
}

class Represent{
    public static void main(String[] args) {  //[ 2, 4, 5, 6, 7, 8 ]
        Enums e = Enums.MALE;
        System.out.println(e);
    }
}
