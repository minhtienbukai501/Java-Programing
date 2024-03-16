/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leminhtien.data.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import leminhtien.data.dao.ProductDao;
import leminhtien.data.driver.MySQLDriver;
import leminhtien.data.model.Product;

/**
 *
 * @author lemin
 */
public class ProductImpl implements ProductDao{
    Connection con = MySQLDriver.getConnection();
    @Override
     public List<Product> finAll(){
         List<Product > listProduct = new ArrayList<>();
         String sql = "select * from products";
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while(rs.next())
            {
                int id = rs.getInt("id");
                double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                int status = rs.getInt("status");
                int id_category = rs.getInt("id_category");
                String name = rs.getString("name");
                String image = rs.getString("image");
                
                listProduct.add(new Product(id, price, quantity,status, id_category, name, image));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        return listProduct;
     }

    @Override
    public Product findProduct(int id_product) {
        String sql = "select * from products where id = "+id_product;
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            if(rs.next()){
                return new Product(rs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
}
