/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package leminhtien.data.web;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import leminhtien.data.dao.Database;
import leminhtien.data.model.User;

/**
 *
 * @author lemin
 */
public class logginServlet extends HttpServlet {

   
    
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.setAttribute("title", "login Page");
        request.getRequestDispatcher("./views/login.jsp").include(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("emailphone");
        String password = request.getParameter("password");
        User user = Database.getUserDao().timkiemTheoEMailPhonePassword(email, password);
        if(user == null){
            request.getSession().setAttribute("Error_Login", "Your infomation is incorrect!");
            response.sendRedirect("login");
        } else 
        {
            if(user.getRole().equals("admin")){
                response.sendRedirect("admin");
            } else 
            {
                request.getSession().setAttribute("user", user);
                request.removeAttribute("Error_Login");
                response.sendRedirect("home");
            }
        }
    }

    

}
