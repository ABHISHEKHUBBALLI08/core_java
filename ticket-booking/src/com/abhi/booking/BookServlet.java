package com.abhi.booking;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/send")
public class BookServlet  extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("name");
        String contactNumber=servletRequest.getParameter("contactnumber");
        Long c_number;
        if(contactNumber!=null && contactNumber==""){
            c_number = Long.parseLong(contactNumber);
        }
        String movieName=servletRequest.getParameter("moviename");
        String location=servletRequest.getParameter("location");
        String movieprice=servletRequest.getParameter("movieprice");
        Long m_price=null;
        if(movieprice!=null && movieprice==""){
            m_price = Long.parseLong(movieprice);
        }
        servletResponse.setContentType("text/html");
        PrintWriter result=servletResponse.getWriter();
        result.println("<h1>Thanks for booking the movie</h1>"+movieName);

    }
}
