/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.login_page;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

/**
 *
 * @author HP
 */
public class   Login_Page{

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//       System.out.println("Connected to Database");
                
        try{
//            

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            String connectURL = "jdbc:sqlserver://"+hostname+":1433"+
//                    ";instance="+sqlInstanceName + ";databaseName"+sqlDatabase+";user="+sqlUser+";password="+sqlPassword;

            Connection conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-1GNNH8U:1433;databaseName=student_section;user=sa;password=admin@123456789;encrypt=true;trustServerCertificate=true");
//            System.out.println("Connected to Database");
        }catch (Exception e) {
            e.printStackTrace();
        }
        
        getConnection();
        
    };
    
    public static Connection getConnection() throws SQLException,ClassNotFoundException{
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con= DriverManager.getConnection("jdbc:sqlserver://DESKTOP-1GNNH8U:1433;databaseName=student_section;user=sa;password=admin@123456789;encrypt=true;trustServerCertificate=true");
            System.out.println("Connected to Database");
        return con;
        }catch (Exception e){
            e.printStackTrace();
        }
        
        return null;
    }
    public static void createQuery(String tableName,String attributes){
        
        
        
        
    }
    
}
