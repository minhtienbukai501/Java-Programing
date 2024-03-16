/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package lmtien.data.web;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author lemin
 */
public class LoginServlet extends HttpServlet {

    

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("./views/login.jsp").include(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String user_name = request.getParameter("username");
        String password = request.getParameter("password");
        String Err_Login = "";
        
        
        String _color = (String)request.getSession().getAttribute("_color");
        if(user_name.matches("admin")  && password.matches("123")){
                Err_Login = "Login Susessful!";
                _color = "blue";
        } else 
       {
            _color = "red";
            Err_Login = "login fail!";
        }
        request.getSession().setAttribute("_color", _color);
        request.getSession().setAttribute("Err_Login", Err_Login);    
        response.sendRedirect("login");
    } 
}
