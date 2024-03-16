<%
    session.removeAttribute("user");
    response.sendRedirect(request.getContextPath()+  "/home");
   // request.getRequestDispatcher("./views/home.jsp").forward(request, response);
%>


