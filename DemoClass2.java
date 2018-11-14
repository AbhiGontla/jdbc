import java.sql.*;

public class DemoClass2 {
    public static void main(String []args)
    {
     try{
            String query="select * from emp2 ";
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe",
                    "system",
                    "oracle"
            );
            System.out.println("connection established sucessfully");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
           while(rs.next())
           {
           System.out.println("***************************************");
            /*System.out.println(rs.getInt("EMPID")+"--"+rs.getString("EMPNAME")+"--"+rs.getString("EMPJOB")+"--"+rs.getInt("EMPSAL"));*/
              System.out.println(rs.getInt(1)+"--"+rs.getString(2)+"--"+rs.getString(3)+"--"+rs.getInt(4));         
            }
            st.close();
            con.close();
}catch(Exception e)
{
System.out.println(e);
}    
    }
}

