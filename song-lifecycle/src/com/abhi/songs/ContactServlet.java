package com.abhi.songs;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/contact")
public class ContactServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("name");
        String phoneNo=servletRequest.getParameter("phnumber");
        long ph_num=0;
        if(phoneNo!=null && phoneNo==""){
            ph_num=Long.parseLong(phoneNo);
        }
        servletResponse.setContentType("text/html");
        PrintWriter res=servletResponse.getWriter();

        res.println("<h1>Thank you for contacting us  Mr/Mrs </h1>"+name);
        res.println("<br>");
        res.println("<h1> Your contact number is </h1>"+phoneNo);



    }
}
