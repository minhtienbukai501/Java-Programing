/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package leminhtien.data.dao;

import java.util.List;
import leminhtien.data.model.Category;
import leminhtien.data.model.Product;

/**
 *
 * @author lemin
 */
public interface ProductDao {
     public List<Product> finAll();
     public Product findProduct(int id_product);
}
