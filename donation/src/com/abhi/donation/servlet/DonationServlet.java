package com.abhi.donation.servlet;

import com.abhi.donation.dto.DonationDto;

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
        String phnumber=req.getParameter("phnumber");
        String amount=req.getParameter("amount");
        String location=req.getParameter("location");
        System.out.println("request running in Donation");
        DonationDto donationDto=new DonationDto();
        donationDto.setName(name);
        donationDto.setPhnumber(phnumber);
        donationDto.setAmount(amount);
        donationDto.setLocation(location);

        req.setAttribute("donationDto",donationDto);

        RequestDispatcher result=req.getRequestDispatcher("donationJsp.jsp");
        result.forward(req,resp);
    }
}
