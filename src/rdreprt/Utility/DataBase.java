/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rdreprt.Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class DataBase {
    
    
    
    public static Connection connectDb() throws SQLException, ClassNotFoundException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String dburl = "jdbc:sqlserver://LAPTOP-P2UO0UDH\\NIRJONSQL:1433;databaseName=BDInfo";

        Connection con = null;
        con = DriverManager.getConnection(dburl, "sa", "asdfghjkl");
        return con;
    }

    

    public static void runQuery(String SQLString) throws SQLException, ClassNotFoundException {
        Connection conn = connectDb();

        Statement stmt = conn.createStatement();

        String query = SQLString;
        int num = stmt.executeUpdate(query);
        System.out.println("Row modified " + num);

    }

    public static ArrayList getDataList(String SQLstring, String column) throws SQLException, ClassNotFoundException {
        Connection conn = connectDb();
        if (conn != null) {
            System.out.println("hi");
        }

        Statement stmt = conn.createStatement();

        ResultSet rst;
        rst = stmt.executeQuery(SQLstring);
        ArrayList<String> list = new ArrayList<>();
        while (rst.next()) {
            String s = rst.getString(column).toString();
            list.add(s);
        }
        return list;

    }
}
