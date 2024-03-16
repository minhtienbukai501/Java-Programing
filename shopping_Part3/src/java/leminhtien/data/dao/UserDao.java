/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package leminhtien.data.dao;

import java.util.List;
import leminhtien.data.model.User;

/**
 *
 * @author lemin
 */
public interface UserDao {
    public List<User> finAll();
    
    public User timkiemTheoEMailPhonePassword(String email,  String Password);
    public User findUser(String emailPhone);
    public void insertUser(String name, String email, String phone, String Password, String Role);
    
 
}
