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
import java.util.ArrayList;
import java.util.List;
import leminhtien.data.dao.Database;
import leminhtien.data.model.Category;
import leminhtien.data.model.Product;

/**
 *
 * @author lemin
 */
public class HomeServlet extends HttpServlet {

   
  

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Category> listCategory = Database.getCategoryDao().findAll();
        request.setAttribute("listCategory", listCategory);
        List<Product> listProduct = Database.getProductDao().finAll();
        request.setAttribute("listProduct", listProduct);
        String id_category = request.getParameter("id_category");
        request.setAttribute("id_category", id_category);
        request.setAttribute("title", "Home Page");
        request.getRequestDispatcher("./views/home.jsp").include(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
    }

    

}
