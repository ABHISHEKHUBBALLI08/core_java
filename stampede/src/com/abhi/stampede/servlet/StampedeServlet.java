package com.abhi.stampede.servlet;

import com.abhi.stampede.dto.StampedeDto;
import com.abhi.stampede.service.StampedeService;
import com.abhi.stampede.service.StampedeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/case")
public class StampedeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StampedeDto stamp=new StampedeDto();
        stamp.setEvent(req.getParameter("event"));
        stamp.setDeaths(req.getParameter("deaths" ));
        stamp.setInjuries(req.getParameter("injuries"));

        StampedeService service=new StampedeServiceImpl();
        boolean saved=service.save(stamp);
        if(saved){
            System.out.println("saved successfully");

        }else{
            System.out.println("saved un-successfully");
        }


    }



}
