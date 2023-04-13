package Tutorials.com.tutorials.April_11.LinkedList;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.April_11.LinkedList
 * @created_on - April 11-2023
 */
public class AddLast {

    /**
     *     Head                                         Tail
     * (Data | Next)->(Data | Next)->(Data | Next)->(Data | Next)-> null      (2)->null
     *
     * (Data | Next)->(Data | Next)->(Data | Next)->(Data | Next)-> ()->null
     *
     */

    static class Node{
        int data;
        Node next;
    }

    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        void addLast(int value){
            Node node = new Node();
            node.data = value;
            node.next = null;
            if (size==0){
                head = node;
                tail = node;
            }
            else {
                tail.next = node;
                tail = node;
            }
            size++;
        }

        void addFirst(int value){
            Node node = new Node();
            node.data = value;
            node.next = head;
            head = node;
            if (size==0){
                tail = node;
            }
            size++;
        }

        public void display(){
            Node node = head;
            while(node!=null){
                System.out.print(node.data + " -> ");
                node  = node.next;
            }
        }

        public void addAt(int value, int index){
            //Todo
        }

        public int getData(int index){
            if (size==0){
                System.out.println("List is empty");
                return -1;
            }
            else if(size<0 || index>=size){
                System.out.println("Wrong Index");
                return -1;
            }
            else{
                Node temp = head;
                for (int i=0 ; i<index ; i++){
                    temp = temp.next;
                }
                return temp.data;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(2);
        list.addLast(4);
        list.addLast(6);
        list.addLast(7);
        list.addFirst(1);
        System.out.println(list.size);
        int data = list.getData(1);
        System.out.println(data);
//        list.display();
    }
}
