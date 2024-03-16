/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leminhtien.data.impl;

import leminhtien.data.dao.CategoryDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import leminhtien.data.dao.CategoryDao;
import leminhtien.data.driver.MySQLDriver;
import leminhtien.data.model.Category;

/**
 *
 * @author lemin
 */
public class CategoryImpl implements CategoryDao {
    Connection con = MySQLDriver.getConnection();
    @Override
    public List<Category> findAll(){
        List <Category> listCategory = new ArrayList<>();
        String sql = "select *from categories";
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                
                listCategory.add(new Category(id, name));
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(CategoryImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return listCategory;
    }
    @Override
    public boolean insert(Category category){
        return true;
    }
    @Override
    public boolean update(Category category){
        return true;
    }
    @Override
    public boolean delete(int id){
        return true;
    }
    @Override
    public Category find(int id){
        return null;
    }
}
