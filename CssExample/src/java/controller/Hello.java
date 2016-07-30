
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Hello extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
            PrintWriter out = response.getWriter();
            
            String cssLocation = request.getContextPath() + "/Web-INF/css/style.css";
            String cssTag = "<link rel='stylesheet' type='text/css' href='" + cssLocation + "'>";
                    
            out.println("<html>");
            out.println("<head>");
            out.println(cssTag);
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 id = \'hello\'>Hello imtiaz</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

   

