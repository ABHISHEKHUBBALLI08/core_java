package com.abhi.donation.servlet;

import com.abhi.donation.dto.FeedbackDto;
import com.abhi.donation.service.FeedbackService;
import com.abhi.donation.service.FeedbackServiceImpl;

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
        String type=servletRequest.getParameter("type");
        String phnumber=servletRequest.getParameter("phnumber");
        String id=servletRequest.getParameter("id");
        System.out.println("request dispatcher running  feedback... ");
        String name=servletRequest.getParameter("name");
        String location=servletRequest.getParameter("location");

        FeedbackDto feedbackDto=new FeedbackDto();
        feedbackDto.setType(type);
        feedbackDto.setPhnumber(phnumber);
        feedbackDto.setId(id);
        feedbackDto.setName(name);
        feedbackDto.setLocation(location);

        FeedbackService feedbackService=new FeedbackServiceImpl();
        boolean saved=feedbackService.save(feedbackDto);
        if(saved){
            servletRequest.setAttribute("feedbackDto",feedbackDto);
            servletRequest.setAttribute("message", "Saving of feedback details successfully");
            RequestDispatcher requestDispatcher= servletRequest.getRequestDispatcher("feedbackJsp.jsp");
            requestDispatcher.forward(servletRequest,servletResponse);
        }else{
            RequestDispatcher requestDispatcher =
                    servletRequest.getRequestDispatcher("feedbackJsp.jsp");
            servletRequest.setAttribute("message", "Saving of feedback details Failed");
        }

    }
}
