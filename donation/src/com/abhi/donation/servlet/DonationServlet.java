package com.abhi.donation.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/donate")
public class DonationServlet extends HttpServlet {
    public DonationServlet(){
        System.out.println("object created in donation");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String phno=req.getParameter("phnumber");
        Long ph;
        if(phno!=null && phno==""){
            ph=Long.parseLong(phno);
        }
        String amount=req.getParameter("amount");
        Long amount1;
        if(amount!=null && amount==""){
            amount1=Long.parseLong(amount);
        }
        String location=req.getParameter("location");

        req.setAttribute("name",name);
        req.setAttribute("ph_no",phno);
        req.setAttribute("amount",amount);
        req.setAttribute("location",location);
        RequestDispatcher result=req.getRequestDispatcher("donationJsp.jsp");
        result.forward(req,resp);
    }
}
