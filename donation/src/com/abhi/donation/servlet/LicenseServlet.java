package com.abhi.donation.servlet;

import com.abhi.donation.dto.LicenseDto;
import com.abhi.donation.service.LicenseService;
import com.abhi.donation.service.LicenseServiceImpl;

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
        String licenseType=servletRequest.getParameter("licenseType");
        String phone=servletRequest.getParameter("phone");
        String licenseId=servletRequest.getParameter("licenseId");
        System.out.println("request dispatcher running in license... ");
        String personName=servletRequest.getParameter("personName");
        String personLocation=servletRequest.getParameter("personLocation");

        LicenseDto licenseDto=new LicenseDto();
        licenseDto.setLicenseType(licenseType);
        licenseDto.setPhone(phone);
        licenseDto.setLicenseId(licenseId);
        licenseDto.setPersonName(personName);
        licenseDto.setPersonLocation(personLocation);

        LicenseService licenseService=new LicenseServiceImpl();
        boolean saved=licenseService.save(licenseDto);
        if(saved){
            servletRequest.setAttribute("licenseDto",licenseDto);
            servletRequest.setAttribute("message", "Saving of license details successfully");
            RequestDispatcher requestDispatcher= servletRequest.getRequestDispatcher("licenseJsp.jsp");
            requestDispatcher.forward(servletRequest,servletResponse);
        }else{
            RequestDispatcher requestDispatcher =
                    servletRequest.getRequestDispatcher("licenseJsp.jsp");
            servletRequest.setAttribute("message", "Saving of license details Failed");
        }

    }
}
