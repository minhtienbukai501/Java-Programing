<%
    session.removeAttribute("user");
    session.removeAttribute("cart");
    response.sendRedirect(request.getContextPath()+  "/home");
    
   // request.getRequestDispatcher("./views/home.jsp").forward(request, response);
%>


