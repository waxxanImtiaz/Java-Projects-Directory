
package controller;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletContext;
import javax.servlet.*;
import javax.servlet.http.*;
public class SetterServlet extends HttpServlet {
        private Education edu;
        private PersonalInfo pInfo;
        private OtherInfo otherInfo;
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        String username;
        ServletContext context = getServletContext();
        
        PrintWriter out = response.getWriter();
        edu = new Education();
        pInfo = new PersonalInfo();
        otherInfo = new OtherInfo();
        HttpSession session = request.getSession();
        username = session.getAttribute("username").toString();
        Database db = (Database)getServletContext().getAttribute("db");
        
        ResultSet rs;
        
        try{
       
         //get personal info   
        rs = db.runSql("select*from ST_PERSONALINFO where id = '"+username+"'");
        
        while(rs.next()){
        //set personal info
        pInfo.setCaste(rs.getString("caste"));;
        pInfo.setCnic(rs.getString("cnic"));
        pInfo.setEmail(rs.getString("email"));
        pInfo.setGender(rs.getString("gender"));
        pInfo.setPermAdd(rs.getString("perm_address"));
        pInfo.setStContactNum(rs.getString("stContact"));
        pInfo.setfContactNum(rs.getString("fContact"));
        pInfo.setEmail(rs.getString("email"));
        pInfo.setAddress(rs.getString("address"));
        pInfo.setName(rs.getString("name"));
        pInfo.setfName(rs.getString("fname"));
        pInfo.setId(username);
        pInfo.setDepart(rs.getString("department"));
        pInfo.setBatch(rs.getString("batch"));
        
        }
        //get education
        rs = db.runSql("select*from education where id = '"+username+"'");
        
        while(rs.next()){
        //set education
        edu.setGraduation(rs.getString("graduation"));
        edu.setIntermediate(rs.getString("intermediate"));
        edu.setMatriculation(rs.getString("matriculation"));
        }
        //get other info
        rs = db.runSql("select*from other_info where id = '"+username+"'");
        
        while(rs.next()){
        
        //set other info
        otherInfo.setTechSkils(rs.getString("techinalSkills"));
        otherInfo.setAreaOfIntrest(rs.getString("area_of_intrest"));
        otherInfo.setExtraActivities(rs.getString("activities"));
        otherInfo.setInternship(rs.getString("internship"));
        otherInfo.setProject(rs.getString("project"));
        otherInfo.setLanguages(rs.getString("languages"));
        }
        LecturesClass lc = new LecturesClass(db,pInfo);
       
        session.setAttribute("pInfo", pInfo);
        session.setAttribute("edu", edu);
        session.setAttribute("otherInfo", otherInfo);
        session.setAttribute("lc", lc);
       
         response.sendRedirect("menu.jsp");
       
//        RequestDispatcher rd=request.getRequestDispatcher("index.jsp");  
//        rd.forward(request, response); 
        }catch(SQLException e)
        {
            System.out.println("Error:"+e.getMessage());
        }catch( NullPointerException e)
        {
            out.println("<h1>Exception:"+e.getMessage()+"</h1>");
        }
        
    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        doPost(request,response);
    }
  
}
