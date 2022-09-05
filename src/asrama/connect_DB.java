/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asrama;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author zahir-netbook
 */
public class connect_DB {

    public connect_DB() {
    }

    public Connection db_connection(){
        Connection conn = null;
        try{
            String url = "jdbc:mysql://localhost:3306/asrama";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(url,user,pass);
        }catch(SQLException se){se.printStackTrace();}
        return conn;
    }
   
    public void load_DriverJDBC(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Database Connection Success");
        }catch(ClassNotFoundException cnfe){cnfe.printStackTrace();}
    }
    
}
