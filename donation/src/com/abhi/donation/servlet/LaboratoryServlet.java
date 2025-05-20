package com.abhi.donation.servlet;

import com.abhi.donation.dto.LaboratoryDto;
import com.abhi.donation.service.LabService;
import com.abhi.donation.service.LabServiceImpl;

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
        String phnumber=servletRequest.getParameter("phnumber");
        String id=servletRequest.getParameter("id");
        System.out.println("request dispatcher running in laboratory ... ");
        String incharge=servletRequest.getParameter("incharge");
        String location=servletRequest.getParameter("location");

        LaboratoryDto laboratoryDto=new LaboratoryDto();
        laboratoryDto.setName(name);
        laboratoryDto.setPhnumber(phnumber);
        laboratoryDto.setId(id);
        laboratoryDto.setIncharge(incharge);
        laboratoryDto.setLocation(location);

        LabService labService=new LabServiceImpl();
        boolean saved=labService.save(laboratoryDto);
        if(saved){
            servletRequest.setAttribute("laboratoryDto",laboratoryDto);
            servletRequest.setAttribute("message", "Saving of lab details successfully");
            RequestDispatcher requestDispatcher= servletRequest.getRequestDispatcher("labJsp.jsp");
            requestDispatcher.forward(servletRequest,servletResponse);
        }else{
            RequestDispatcher requestDispatcher =
                    servletRequest.getRequestDispatcher("labJsp.jsp");
            servletRequest.setAttribute("message", "Saving of lab details Failed");

        }

    }
}
