package com.abhi.donation.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/license")
public class LicenseServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("name");
        String phno=servletRequest.getParameter("phnumber");
        Long ph;
        if(phno!=null && phno==""){
            ph=Long.parseLong(phno);
        }
        String id=servletRequest.getParameter("id");
        Long iid;
        if(id!=null && id==""){
            iid=Long.parseLong(id);
        }
        String police=servletRequest.getParameter("person");
        String location=servletRequest.getParameter("location");
        System.out.println("request dispatcher running ... ");
        RequestDispatcher requestDispatcher= servletRequest.getRequestDispatcher("licenseJsp.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);
    }
}
