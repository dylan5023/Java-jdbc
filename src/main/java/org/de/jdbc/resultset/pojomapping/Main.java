package org.de.jdbc.resultset.pojomapping;
import org.de.jdbc.mapper.Product;
import org.de.jdbc.mapper.ResultSetMapper;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        try {

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/de-jdbc", "root", null);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select `id`, `name`, `updated_at`, `contents`, `price` from product");

        List<Product> products = new ArrayList<>();
        while (rs.next()) {
            Product product = ResultSetMapper.create(rs);
            products.add(product);
        }
        products.stream().forEach(it -> it.setPrice(it.getPrice() - 1000));
        con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}