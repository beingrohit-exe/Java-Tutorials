package Tutorials.com.tutorials.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.Practice
 * @created_on - April 22-2023
 */
public class PasswordCheck {

    static Boolean doCheck(String username, String password, Integer length){
        int begin = 0;
        List<String> list = new ArrayList<>();
        while(length<password.length()){
            list.add(password.substring(begin, length));
            begin++;
            length++;
        }
//        List<Boolean> collect = list.stream().map(e -> username.contains(e)).collect(Collectors.toList());
        List<Boolean> collect = list.stream().map(username::contains).collect(Collectors.toList());
        if (collect.contains(true)){
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        String username = "rohitparihar";
        String password = "@12rohit34sdkgbsdgjkbfjsbdvi";
        Integer length = 6;
        Boolean isContain = doCheck(username, password, length);
        System.out.println(isContain ? "Password should not be 5 consecutive characters of Username"
                : "Accepted");
    }
}
