package com.abhi.donation.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/fir")
public class FirServlet extends HttpServlet {
    public FirServlet(){
        System.out.println("object created in fir");
    }
    @Override
    protected void doPost(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("request dispatcher running ... ");
        String name=servletRequest.getParameter("name");
        String phno=servletRequest.getParameter("phnumber");
        Long ph;
        if(phno!=null && phno==""){
            ph=Long.parseLong(phno);
        }
        String fir=servletRequest.getParameter("fir");
        Long firId;
        if(fir!=null && fir==""){
            firId=Long.parseLong(fir);
        }
        String police=servletRequest.getParameter("police");
        String location=servletRequest.getParameter("location");

        servletRequest.setAttribute("name",name);
        servletRequest.setAttribute("ph_no",phno);
        servletRequest.setAttribute("fir",fir);
        servletRequest.setAttribute("police",police);
        servletRequest.setAttribute("location",location);
        RequestDispatcher requestDispatcher= servletRequest.getRequestDispatcher("firJsp.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);

    }
}
