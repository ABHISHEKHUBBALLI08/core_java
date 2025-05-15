package com.abhi.donation.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/license")
public class LicenseServlet extends HttpServlet {
    public LicenseServlet(){
        System.out.println("objected created in license");
    }
    @Override
    protected void doPost(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("licenseType");
        String phno=servletRequest.getParameter("phone");
        Long ph;
        if(phno!=null && phno==""){
            ph=Long.parseLong(phno);
        }
        String id=servletRequest.getParameter("licenseId");
        Long iid;
        if(id!=null && id==""){
            iid=Long.parseLong(id);
        }
        System.out.println("request dispatcher running in license... ");
        String person=servletRequest.getParameter("personName");
        String location=servletRequest.getParameter("personLocation");
        servletRequest.setAttribute("name",name);
        servletRequest.setAttribute("ph_no",phno);
        servletRequest.setAttribute("id",id);
        servletRequest.setAttribute("person",person);
        servletRequest.setAttribute("location",location);
        RequestDispatcher requestDispatcher= servletRequest.getRequestDispatcher("licenseJsp.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);
    }
}
