package Tutorials.com.tutorials.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.JDBC
 * @created_on - April 14-2023
 */
public class Repo {

    public static boolean insert(Entity entity){
        try{
            Connection connection = JdbcConnection.create();

            String query = "insert into entity(id, name, email) value(?, ?, ?)";

            //Statement
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, entity.getId()+ "");
            statement.setString(2, entity.getName());
            statement.setString(3, entity.getEmail());

            //Execute
            int i = statement.executeUpdate();
            return i==1 ? true : false;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public static void display(){
        try{
            Connection connection = JdbcConnection.create();

            String query = "select * from entity";

            //Statement
            PreparedStatement statement = connection.prepareStatement(query);


            //Execute
            statement.execute();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void delete(Integer id){
        try{
            Connection connection = JdbcConnection.create();

            String query = "delete id from entity where id=?";

            //Statement
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);

            //Execute
            statement.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
