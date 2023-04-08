package Tutorials.com.tutorials.April_8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.April_8
 * @created_on - April 08-2023
 */
public class Dates {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(LocalDate.now()); //yyyy-MM-dd
        System.out.println(LocalTime.now());
        System.out.println(LocalDate.now().minusDays(2));
        System.out.println(LocalDateTime.now());

        LocalDateTime localDate = LocalDateTime.now();
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm");
        String format = localDate.format(date);
        System.out.println(format);
    }
}
