package Tutorials.com.tutorials.April_8;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.April_8
 * @created_on - April 08-2023
 */

class OClass{
    int x = 10;
    class InnerClass{
        int y = 20;
    }
}
public class OuterClass {

    static class Node{
        Node node;
        int data;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        OClass o = new OClass();
        OClass.InnerClass i = o.new InnerClass();
        System.out.println(i.y);

    }
}
