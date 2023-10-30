package org.de.jdbc.crudexample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/de-jdbc", "root", null);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from product");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " "
                        + rs.getDate(3) + " " + rs.getString(4)
                        + " " + rs.getInt(5));
            }
//            Thread.sleep(5*6*1000);
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}