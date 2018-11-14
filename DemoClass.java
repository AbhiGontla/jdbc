import java.sql.*;

public class DemoClass {
    public static void main(String []args)
    {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
            System.out.println("connection established sucessfully");

           }catch (Exception e)
        {
            System.err.print(e);
        }

    }
}
