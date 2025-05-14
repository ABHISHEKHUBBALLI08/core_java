package com.abhi.donation.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/fir")
public class FirServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
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
        System.out.println("request dispatcher running ... ");
        RequestDispatcher requestDispatcher= servletRequest.getRequestDispatcher("firJsp.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);
    }
}
