package com.abhi.servlet;

import com.abhi.dto.FurnitureDto;
import com.abhi.service.FurnitureServiceImpl;
import com.abhi.service.Service;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/furniture")
public class FurnitureServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String brand = req.getParameter("brand");
        String material = req.getParameter("material");
        String size = req.getParameter("size");
        String model = req.getParameter("model");
        String benefits = req.getParameter("benefits");

        FurnitureDto furnitureDto = new FurnitureDto();

        furnitureDto.setBrand(brand);
        furnitureDto.setMaterial(material);
        furnitureDto.setSize(size);
        furnitureDto.setModel(model);
        furnitureDto.setBenefits(benefits);
        Service service=new FurnitureServiceImpl();
        boolean saved=service.save(furnitureDto);

        if(saved){
            req.setAttribute("furnitureDto", furnitureDto);
            RequestDispatcher dispatcher = req.getRequestDispatcher("FurnitureSuccess.jsp");
            dispatcher.forward(req, resp);
        }
        else{

            req.setAttribute("message", "failed to save ");
            RequestDispatcher dispatcher = req.getRequestDispatcher("furniture.jsp");
            dispatcher.forward(req, resp);
        }


    }
}
