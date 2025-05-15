package com.abhi.donation.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/feedback")
public class FeedbackServlet extends HttpServlet {
    public FeedbackServlet(){
        System.out.println("object created in feedback");
    }
    @Override
    protected void doPost(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("type");
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
        System.out.println("request dispatcher running  feedback... ");
        String name1=servletRequest.getParameter("name");
        String location=servletRequest.getParameter("location");
        servletRequest.setAttribute("name",name);
        servletRequest.setAttribute("ph_no",phno);
        servletRequest.setAttribute("id",id);
        servletRequest.setAttribute("name1",name1);
        servletRequest.setAttribute("location",location);
        RequestDispatcher requestDispatcher= servletRequest.getRequestDispatcher("feedbackJsp.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);
    }
}
