package com.abhi.sport.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/fooball",loadOnStartup = 1)
public class Fooball extends GenericServlet {
    public Fooball(){
        System.out.println("object created in fooball");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("generic servlet running in fooball");
    }
}
