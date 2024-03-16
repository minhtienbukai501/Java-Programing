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
        addProductToCard(request);
        
        request.getRequestDispatcher("./views/home.jsp").include(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
        
         
    }

    void addProductToCard(HttpServletRequest request){
        int id_product;
      
        try {
            id_product = Integer.parseInt(request.getParameter("id_product"));
        } catch (Exception e) {
            id_product = 0;
        }
        
        
          
        List<Product>cart = (ArrayList<Product>)request.getSession().getAttribute("cart");
        if(cart == null){
            cart = new ArrayList<Product>();
        }
        
        if(id_product > 0){
            Product product = Database.getProductDao().findProduct(id_product);
            boolean check = false;
            for(Product x :cart ){
                if(x.getId() == id_product){
                    x.setQuantity(x.getQuantity() + 1);
                    check = true;
                }
            }
            if(check != true){
                cart.add(product);
            }
           
        }
        
        double Sum_Price = 0;
      
        for (Product x :cart){
            Sum_Price += (x.getPrice() * x.getQuantity());
        }
        
        
        request.getSession().setAttribute("Sum_Price", Sum_Price);
        request.getSession().setAttribute("cart", cart);
    }

    private void addProductToCard() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
