package samplePrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCConnectionExample {

  public static void main(String[] args) {
    try {
      /* 1. Register the driver class */
      Class.forName("oracle.jdbc.driver.OracleDriver");

      /* 2. Create Connection object */
      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","user","password");
      /*
       * The connection URL for the oracle10G database is jdbc:oracle:thin:@localhost:1521:xe where
       * jdbc is the API, oracle is the database, thin is the driver, 
       * localhost is the server name on which oracle is running, we may also use IP address, 
       * 1521 is the port number and 
       * XE is the Oracle service name. 
       * You may get all these information from the tnsnames.ora file.
       */

      /* 3. Create Statement object */
      Statement stmt=con.createStatement();

      /* 4. Execute the query */
      ResultSet rs=stmt.executeQuery("select * from emp");  
      while(rs.next())  
        System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));

      /* 5. Close Connection object */
      con.close();

    } catch(Exception e) {
      System.out.println(e);
    }  

  }

}
