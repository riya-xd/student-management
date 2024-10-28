/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_management_system;
import java.sql.*;
/**
 *
 * @author hp
 */
public class DBConnect{
    static Connection con=null;
    public static Connection connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/studjava?autoReconnect=true&useSSL=false&user=root&password=riya@1712");
        }
        catch(Exception e){
            System.out.println(e);
        }
        return con;
    }
}
