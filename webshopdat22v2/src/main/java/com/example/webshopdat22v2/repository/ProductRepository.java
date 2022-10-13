package com.example.webshopdat22v2.repository;
import com.example.webshopdat22v2.model.Product;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

@Repository
public class ProductRepository {

    List<Product> productList = new LinkedList<Product>();
    public List<Product> getAll(){
        try{
            //Connection setup
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/webshop",
                    "root", "root"
            );

            PreparedStatement psts = conn.prepareStatement("SELECT * FROM product");
            ResultSet resultSet = psts.executeQuery();

            //While more results exist


            while(resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int price = resultSet.getInt(3);
                productList.add(new Product(id, name, price));
                System.out.println(id + name + price);
            }

            return productList;
        }
        catch(SQLException e) {
            System.out.println("Could not connect to database");
            e.printStackTrace();

            return null;
        }
    }
}
