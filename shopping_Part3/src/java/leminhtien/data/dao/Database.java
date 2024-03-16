/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leminhtien.data.dao;

import leminhtien.data.impl.CategoryImpl;
import leminhtien.data.impl.ProductImpl;
import leminhtien.data.impl.UserImpl;

/**
 *
 * @author lemin
 */
public class Database {
    public static CategoryDao getCategoryDao(){
        return new CategoryImpl();
    }
    
    public static ProductDao getProductDao(){
        return new ProductImpl();
    }
    
    public static UserDao getUserDao(){
        return new UserImpl();
    }
}
