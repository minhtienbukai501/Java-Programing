/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leminhtien.data.model;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author lemin
 */
public class Product {
    private int id, quantity, status, id_category;
    double price;
    private String name, image;

    public Product(int id, double price, int quantity, int status, int id_category, String name, String image) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.status = status;
        this.id_category = id_category;
        this.name = name;
        this.image = image;
    }
    
    public Product(ResultSet rs) throws SQLException {
        this.id = rs.getInt("id");
        this.price = rs.getDouble("price");
        this.name = rs.getNString("name");
        this.image = rs.getNString("image");
        this.quantity = 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getId_category() {
        return id_category;
    }

    public void setId_category(int id_category) {
        this.id_category = id_category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
}
