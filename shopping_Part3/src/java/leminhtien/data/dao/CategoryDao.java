/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package leminhtien.data.dao;

import java.util.List;
import leminhtien.data.model.Category;

/**
 *
 * @author lemin
 */
public interface CategoryDao {
    public List<Category> findAll();
    public boolean insert(Category category);
    public boolean update(Category category);
    public boolean delete(int id);
    public Category find(int id);
    
}
