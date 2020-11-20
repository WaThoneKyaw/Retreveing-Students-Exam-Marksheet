package application;


import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class ConnectionUtil {
	Connection conn = null;
    public static Connection connectdb()
    {
        try
        {
        	String url ="jdbc:mysql://localhost/admin";
        	String username="root";
        	String password="";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,username,password);
            return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
	
}
