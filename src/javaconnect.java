/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Shruti
 */

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class javaconnect {

    private static javaconnect javaConnect;

    private Connection connection;

    private javaconnect() {
        try {
            Class.forName("org.sqlite.JDBC");
            this.connection = DriverManager.getConnection("jdbc:sqlite:/home/nisiddharth/Desktop/Banking_Management_Application/bank.sqlite");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static javaconnect getInstance() {
        if (javaConnect == null) {
            javaConnect = new javaconnect();
        }
        return javaConnect;
    }

    public Connection connectDb() {
        return connection;
    }
}
