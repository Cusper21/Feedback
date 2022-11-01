package com.example.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet(name = "SaveServlet", value = "/SaveServlet")
public class SaveServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fname = request.getParameter("name");
        String address = request.getParameter("address");
        String email = request.getParameter("email");
        String Checked[] = request.getParameterValues("rChecked");
        String rRadio = request.getParameter("Option");
        String additionalComments = request.getParameter("additionalComments");

        PrintWriter out = response.getWriter();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/feedback","root","");
            PreparedStatement pst = conn.prepareStatement("insert into tblfeedback(SName,Address,Email,rChecked,rRadio,Comment) values(?,?,?,?,?,?)");

            pst.setString(1,fname);
            pst.setString(2,address);
            pst.setString(3,email);
            pst.setString(4,Checked[0]);
            pst.setString(5,rRadio);
            pst.setString(6,additionalComments);
            pst.execute();

        }catch (Exception ex){
            out.print(ex);
        }
    }
}
