package Tutorials.com.tutorials;

import java.util.ArrayList;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials
 * @created_on - April 23-2023
 */
public class Generics {

    /**
     *
     * Not works with primitive data type
     * int, char, float, boolean
     */
    public static void main(String[] args) {
        GenericsType<String> a = new GenericsType<>();

        GenericsType<Integer> b = new GenericsType<>();

        String rohit = a.getData("Rohit");
        System.out.println(rohit);

        Integer data = b.getData(7);
        System.out.println(data);

        GenericsMethod genericsMethod = new GenericsMethod();
        String rohit1 = genericsMethod.<String>myMethod("Rohit");
        Integer rohit2 = genericsMethod.<Integer>myMethod(2);
        System.out.println(rohit1);
        GenericBound<Integer> genericBound = new GenericBound<>();

        GenericBound<Double> gb = new GenericBound<>();

        Double g1 = gb.getData(7.00d);
        System.out.println(g1);
    }
}

class GenericsType<T>{

    public T getData(T data){
        return data;
    }
}

class GenericsMethod{
    public <M> M myMethod(M a1){
        return a1;
    }
}

class GenericBound<T extends Number> {
    public T getData(T data){
        return data;
    }
}
