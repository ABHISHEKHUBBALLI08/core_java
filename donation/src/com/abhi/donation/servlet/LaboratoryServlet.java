package com.abhi.donation.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/lab")
public class LaboratoryServlet extends HttpServlet {
    public LaboratoryServlet(){
        System.out.println("object created in laboratory");
    }
    @Override
    protected void doPost(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws ServletException, IOException {
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
        System.out.println("request dispatcher running in laboratory ... ");
        String incharge=servletRequest.getParameter("incharge");
        String location=servletRequest.getParameter("location");
        servletRequest.setAttribute("name",name);
        servletRequest.setAttribute("ph_no",phno);
        servletRequest.setAttribute("id",id);
        servletRequest.setAttribute("incharge",incharge);
        servletRequest.setAttribute("location",location);
        RequestDispatcher requestDispatcher= servletRequest.getRequestDispatcher("labJsp.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);
    }
}
