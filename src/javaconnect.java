/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shruti
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect {
    Connection conn=null;
    public static Connection ConnectDb(){
        try{    
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:/home/nisiddharth/Desktop/Banking_Management_Application/bank.sqlite");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
        return null;
    }
}
