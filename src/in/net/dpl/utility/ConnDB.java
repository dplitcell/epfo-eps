/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.net.dpl.utility;

import java.sql.*;

/**
 *
 * @author Accounts
 */
public class ConnDB {
        


public Connection make_connection() throws SQLException{
         Connection conn = null;
         
 
        try
           {
              
               
               //PRODUCTION
	        	String userName = "pamsprod";
	            String password = "pamsprod";
               Class.forName ("oracle.jdbc.OracleDriver").newInstance ();
               String url="jdbc:oracle:thin:@//172.16.0.51:1521/pamsprod";
               
               
               //Test DB
               /*String userName = "gst";
               String password = "gst123";
               Class.forName ("oracle.jdbc.OracleDriver").newInstance ();
               String url="jdbc:oracle:thin:@172.16.0.51:1521:pamsuat";*/
               conn = DriverManager.getConnection (url, userName, password); 
                                               
           }catch (SQLException e)
           {
              e.printStackTrace();
           }
           catch (Exception e)
           {

               e.printStackTrace();
           }
           
        
         
           return conn;
        }

}
