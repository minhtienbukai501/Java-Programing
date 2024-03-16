/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leminhtien.data.impl;

import java.util.ArrayList;
import java.util.List;
import leminhtien.data.dao.UserDao;
import leminhtien.data.driver.MySQLDriver;
import leminhtien.data.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lemin
 */
public class UserImpl implements UserDao {

    Connection conn = MySQLDriver.getConnection();

    @Override
    public List<User> finAll() {
        List<User> listUser = new ArrayList<>();
        String sql = "select *from users";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");

                String email = rs.getString("email");
                String phone = rs.getString("phone");
                String password = rs.getString("password");
                String role = rs.getString("Role");
                listUser.add(new User(id, name, email, phone, password, role));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listUser;
    }

    @Override
    public User timkiemTheoEMailPhonePassword(String Emailphone, String Password) {

        String sql;
        if (Emailphone.contains("@")) {
            sql = "select * from users where email = ? and password = ?";
        } else {
            sql = "select * from users where phone = ? and password = ?";
        }

        User user = null;
        PreparedStatement pre;
        try {
            pre = conn.prepareStatement(sql);
            pre.setString(1, Emailphone);
            pre.setString(2, Password);
            ResultSet rs = pre.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                String password = rs.getString("password");
                String role = rs.getString("Role");
                return new User(id, name, email, phone, password, role);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    @Override
    public User findUser(String Email) {
        
        String sql = "";
        if(Email.contains("@")){
            sql = "select * from Users where email = ?";
        } else 
        {
            sql = "select * from Users where phone = ?";
        }
        User user = null;
        PreparedStatement pre;
        try {
            pre = conn.prepareStatement(sql);
            pre.setString(1, Email);
            ResultSet rs = pre.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                String password = rs.getString("password");
                String role = rs.getString("Role");
                return new User(id, name, email, phone, password, role);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    @Override
    public void insertUser(String name, String email, String phone, String Password, String role) {
        String sql = "insert into users(name , email, phone, password, Role) values "
                + "('" + name + "', '" + email + "', '" + phone + "', '" + Password + "', '"+role+"')";

        PreparedStatement pre;
        try {
            pre = conn.prepareStatement(sql);
            pre.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UserImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
