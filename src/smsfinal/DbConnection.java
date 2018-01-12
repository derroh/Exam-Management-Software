package smsfinal;

import java.sql.Connection;     //connects app wth dbase
import java.sql.DriverManager;  //
import java.sql.PreparedStatement;  //sends data to dbase
import java.sql.ResultSet;  //gets data from dbse eg bal
import java.sql.Statement;  //acts as compiler..
import javax.swing.JOptionPane;


public class DbConnection{
 
                Connection conn=null;
                PreparedStatement pst = null;
                ResultSet rs = null;
                Statement stm = null;
                
                
      public Connection Connectdb()
      {
          
          String dbname, user, password, url,Driver;
          
                 dbname="sms";//place name of dbase in the quotation marks eg trial
                 user ="root"; //default name in mysql is root
                 password="";//place here pword after you create one
                 url="jdbc:mysql://localhost:3306/";//
                 Driver="com.mysql.jdbc.Driver";
           try{
           
             Class.forName(Driver);//pwrd
             conn=DriverManager.getConnection(url+dbname,user,password);
           return conn;
           } 
           catch(Exception ex){
            
               JOptionPane.showMessageDialog(null, "An error occured while establishing database connection\nKindly make sure your database is up and running.", "Database Connection error", JOptionPane.ERROR_MESSAGE);
               ex.printStackTrace();
               JOptionPane.showMessageDialog(null, ex);
             return null;
           }         
          
          
          
      
      }

}
