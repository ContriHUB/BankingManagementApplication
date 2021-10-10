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

    private Connection conn;
    private static javaconnect uniqueJavaConnect;

    private javaconnect() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn=DriverManager.getConnection("jdbc:sqlite:/home/nisiddharth/Desktop/Banking_Management_Application/bank.sqlite");
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }

    public static javaconnect getInstance() {
        if(uniqueJavaConnect == null) uniqueJavaConnect = new javaconnect();
        return uniqueJavaConnect;
    }

    public Connection ConnectDb(){
        return conn;
    }
}
