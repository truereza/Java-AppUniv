/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appuniversitas.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author REZA
 */
public class koneksi {
    private static Connection conn = null;
    
    public static Connection getConnection() throws Exception{
        if(conn==null){
            try{
               Class.forName("com.mysql.jdbc.Driver"); //Melakukan registrasi class Driver dan memasukkan nilai dengan memanggil JDBC Driver dari database Server MySQL.
                conn = DriverManager.getConnection("jdbc:mysql://localhost/universitas","root",""); 
            } catch (Exception e){
                e.printStackTrace();
                return null;
            }
        }
        return conn;
    }
    
    public static boolean isConnect(){
        try {
            if(getConnection()==null){
                return false;
            }
        } catch (Exception ex){
            Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
}
