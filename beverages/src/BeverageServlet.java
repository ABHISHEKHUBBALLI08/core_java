import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/order")
public class BeverageServlet extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("name");
        String contactNumber=servletRequest.getParameter("contactnumber");
        Long c_number;
        if(contactNumber!=null && contactNumber==""){
            c_number = Long.parseLong(contactNumber);
        }
        String drinks=servletRequest.getParameter("drink");
        String location=servletRequest.getParameter("location");
        String drinkPrice=servletRequest.getParameter("drinkprice");
        Long drink_p=null;
        if(drinkPrice!=null && drinkPrice==""){
            drink_p = Long.parseLong(drinkPrice);
        }
        servletResponse.setContentType("text/html");
        PrintWriter result=servletResponse.getWriter();
        result.println("<h1>Thanks for ordering the drinks</h1>"+drinks);

    }
}
