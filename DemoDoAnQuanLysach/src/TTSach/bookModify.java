/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TTSach;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TechCare
 */
public class bookModify {
     public static List<book> findAlll() {
        List<book> bookList = new ArrayList<>();
        
        Connection connection = null;
        Statement statement = null;
        
        try {
          
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysach", "root", "");
            
            //query
            String sql = "select * from sach";
            statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {                
                book b; 
                b = new book(resultSet.getString("tensach"), resultSet.getString("tacgia"), 
                         resultSet.getString("theloai"), resultSet.getString("nhaxuatban"),
                        resultSet.getInt("soluong"), resultSet.getFloat("dongia"),
                        resultSet.getString("ngaynhap"));
                bookList.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(bookModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(bookModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(bookModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
        
        return bookList;
    }
}
