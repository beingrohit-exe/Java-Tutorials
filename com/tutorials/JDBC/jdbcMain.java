package Tutorials.com.tutorials.JDBC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.JDBC
 * @created_on - April 14-2023
 */
public class jdbcMain {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter Data : ");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;

            System.out.println("Press A to Add Statement");
            System.out.println("Press B to Delete Statement");
            System.out.println("Press C to display Statement");
            System.out.println("Press 4 to exit");

        String data = read.readLine();
        switch (data){
            case "A":
                System.out.println("Enter ID");
                String Id = read.readLine();
                System.out.println("Enter Name");
                String name = read.readLine();
                System.out.println("Enter Email");
                String email = read.readLine();

                Entity entity = new Entity();
                entity.setId(Integer.parseInt(Id));
                entity.setName(name);
                entity.setEmail(email);
                boolean a = Repo.insert(entity);
                if (a){
                    System.out.println("Data successfully added in database");
                }
                else {
                    System.out.println("Error");
                }
        }
        switch (data){
            case "A":
                System.out.println("Enter ID");
                String Id = read.readLine();
                System.out.println("Enter Name");
                String name = read.readLine();
                System.out.println("Enter Email");
                String email = read.readLine();

                Entity entity = new Entity();
                entity.setId(Integer.parseInt(Id));
                entity.setName(name);
                entity.setEmail(email);
                Repo.insert(entity);

                break;
            case "B":
                System.out.println("Enter Id to be deleted");
                String s = read.readLine();
                Repo.delete(Integer.parseInt(s));
                break;
            case "C":
                Repo.display();
                break;
            case "D":
                System.out.println("Thanks");
                break;
        }
    }
}
