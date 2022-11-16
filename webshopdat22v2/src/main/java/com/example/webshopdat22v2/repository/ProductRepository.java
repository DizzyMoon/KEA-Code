package com.example.webshopdat22v2.repository;

import com.example.webshopdat22v2.model.Product;
import com.example.webshopdat22v2.util.ConnectionManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

@Repository
public class ProductRepository {

    @Value("${spring.datasource.url}")
    private String db_url;

    @Value("${spring.datasource.username}")
    private String userid;

    @Value("${spring.datasource.password}")
    private String userpwd;
    List<Product> productList = new LinkedList<Product>();

    public List<Product> getAll() {
        try {
            //Connection setup
            //Connection conn = DriverManager.getConnection(db_url, userid, userpwd);

            ConnectionManager connManager = new ConnectionManager();
            Connection conn = connManager.getConnection(db_url, userid, userpwd);
            PreparedStatement psts = conn.prepareStatement("SELECT * FROM product");
            ResultSet resultSet = psts.executeQuery();

            //While more results exist


            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int price = resultSet.getInt(3);
                productList.add(new Product(id, name, price));
                System.out.println(id + name + price);
            }

            return productList;
        } catch (SQLException e) {
            System.out.println("Could not connect to database");
            e.printStackTrace();

            return null;
        }
    }
}
