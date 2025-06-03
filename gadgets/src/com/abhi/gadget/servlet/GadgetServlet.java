package com.abhi.gadget.servlet;

import com.abhi.gadget.dto.GadgetDto;
import com.abhi.gadget.runner.GadgetDetails;
import com.abhi.gadget.service.ProductService;
import com.abhi.gadget.service.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/gadget")
public class GadgetServlet extends HttpServlet {

    public GadgetServlet() {
        System.out.println("Object created successfully in gadget servlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running doPost in GadgetServlet");

        String id = req.getParameter("productId");
        String name = req.getParameter("productName");
        String price = req.getParameter("price");
        String quantity = req.getParameter("quantity");
        String category = req.getParameter("category");

        GadgetDto gadget = new GadgetDto();
        gadget.setProductId(Integer.parseInt(id));
        gadget.setProductName(name);
        gadget.setPrice(Double.parseDouble(price));
        gadget.setQuantity(Integer.parseInt(quantity));
        gadget.setCategory(category);

        ProductService productService = new ProductServiceImpl();
        boolean isSaved = productService.save(gadget);

        if (isSaved) {
            req.setAttribute("gadget", gadget);
            req.setAttribute("msg", "Product saved successfully.");
            RequestDispatcher rd = req.getRequestDispatcher("GadgetSuccess.jsp");
            rd.forward(req, resp);
        } else {
            req.setAttribute("msg", "Failed to save product.");
            RequestDispatcher rd = req.getRequestDispatcher("gadget.jsp");
            rd.forward(req, resp);
        }
    }
}
