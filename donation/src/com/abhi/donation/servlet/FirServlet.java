package com.abhi.donation.servlet;

import com.abhi.donation.dto.FirDto;

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
        System.out.println("request dispatcher running in FIR... ");
        String name=servletRequest.getParameter("name");
        String phnumber=servletRequest.getParameter("phnumber");
        String fir=servletRequest.getParameter("fir");
        String police=servletRequest.getParameter("police");
        String location=servletRequest.getParameter("location");

        FirDto firDto=new FirDto();
        firDto.setName(name);
        firDto.setPhnumber(phnumber);
        firDto.setFir(fir);
        firDto.setPolice(police);
        firDto.setLocation(location);
        servletRequest.setAttribute("firDto",firDto);
        RequestDispatcher requestDispatcher= servletRequest.getRequestDispatcher("firJsp.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);

    }
}
