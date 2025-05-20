package com.abhi.toy.servlet;

import com.abhi.toy.dto.ToyDto;
import com.abhi.toy.service.ToyService;
import com.abhi.toy.service.ToyServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/toy")
public class ToyServlet extends HttpServlet {
    public ToyServlet(){
        System.out.println("object created successfully in toy");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running httpServlet in toy");
        String name=req.getParameter("name");
        String type=req.getParameter("type");
        String price=req.getParameter("price");
        String selling=req.getParameter("selling");
        String mrp=req.getParameter("mrp");
        String description=req.getParameter("description");
        String brand=req.getParameter("brand");
        String quantity=req.getParameter("quantity");
        String color=req.getParameter("color");
        String weight=req.getParameter("weight");
        String date=req.getParameter("date");
        String warranty=req.getParameter("warranty");

        ToyDto toyDto=new ToyDto();
        toyDto.setName(name);
        toyDto.setType(type);
        toyDto.setPrice(price);
        toyDto.setSelling(selling);
        toyDto.setMrp(mrp);
        toyDto.setDescription(description);
        toyDto.setBrand(brand);
        toyDto.setQuantity(quantity);
        toyDto.setColor(color);
        toyDto.setWeight(weight);
        toyDto.setDate(date);
        toyDto.setWarranty(warranty);
        ToyService toyService=new ToyServiceImpl();
        boolean saved=toyService.save(toyDto);
        if(saved){
            req.setAttribute("toyDto",toyDto);
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("ToySuccess.jsp");
            requestDispatcher.forward(req,resp);
        }else {
            req.setAttribute("message","failed to save");
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("toy.jsp");
            requestDispatcher.forward(req,resp);
        }




    }
}
