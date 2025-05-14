package com.abhi.donation.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/donate")
public class DonationServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("name");
        String phno=servletRequest.getParameter("phnumber");
        Long ph;
        if(phno!=null && phno==""){
            ph=Long.parseLong(phno);
        }
        String amount=servletRequest.getParameter("amount");
        Long amount1;
        if(amount!=null && amount==""){
            amount1=Long.parseLong(amount);
        }
        String location=servletRequest.getParameter("location");
//        servletResponse.setContentType("text/html");
//        PrintWriter res=servletResponse.getWriter();
//        res.println("<h1>Thank you for donating</h1>");
//        res.println("<h1> Donor name is:</h1>"+name);
//        res.println("<h1> Donor phone number  is:</h1>"+phno);
//        res.println("<h1> Donor name is:</h1>"+amount);
        System.out.println("request dispatcher running ... ");
        RequestDispatcher requestDispatcher= servletRequest.getRequestDispatcher("donationJsp.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);


    }
}
