package com.abhi.donation.servlet;

import com.abhi.donation.dto.LaboratoryDto;

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
        servletRequest.setAttribute("laboratoryDto",laboratoryDto);
        RequestDispatcher requestDispatcher= servletRequest.getRequestDispatcher("labJsp.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);
    }
}
