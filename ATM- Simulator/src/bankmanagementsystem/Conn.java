/*

1 Register the Driver
  create Connection
  create statement
  Excute the query
close Connection
*/

package bankmanagementsystem;

import java.sql.*;

public class Conn {

    Connection c; // 2nd step
    Statement s;
    public Conn()
    {
        try  // to catch run tiemm error exceiptin handling is using
            
        {  
           
           
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","DB_USERNAME","DB_PASSWORD");// create connection, root=my sql user name, password
            s=c.createStatement();
            
            
            
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
   
}
