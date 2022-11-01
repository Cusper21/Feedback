package com.example.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("email");
        String password_ =request.getParameter("password_");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        RequestDispatcher dispatcher= null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/feedback","root","");
            PreparedStatement pst = conn.prepareStatement("select * from tbllogin where Email=? and Password_=?");

            pst.setString(1,email);
            pst.setString(2,password_);

            ResultSet rs = pst.executeQuery();
            if (rs.next()){
                session.setAttribute("email", rs.getString("email"));
                dispatcher = request.getRequestDispatcher("index.jsp");
            }
            dispatcher.forward(request, response);
        }catch (Exception ex){
            out.print(ex);
        }

    }
}
