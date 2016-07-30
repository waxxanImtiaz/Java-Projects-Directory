/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pak;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.io.*;
/**
 *
 * @author waxxan
 */
public class Test extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        

    final String dbURL = "jdbc:mysql://localhost:3308/personinfo";
    final String dbUser = "root";
    final String dbPass = "12345";

    Connection conn = null;
    Statement stmt = null;

    try {
        //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Class.forName("com.mysql.jdbc.Driver");

        conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
        response.getWriter().println("db connected");
        stmt = (Statement) conn.createStatement();

        ResultSet rs1;
        rs1 = stmt.executeQuery("select*from images where id = 1");
        response.getWriter().println("<h1>Hello</h1>");

        if (rs1.next()) {
            byte[] imgData = rs1.getBytes("image");//Here r1.getBytes() extract byte data from resultSet 
            response.getWriter().println("<h1>image = "+imgData+"</h1>");
            response.setHeader("expires", "0");
            response.setContentType("image/jpg");
            Blob b = rs1.getBlob("image");
            InputStream binaryStream = b.getBinaryStream(0, b.length());
            OutputStream os = response.getOutputStream(); // output with the help of outputStream 
            os.write(imgData);
            
            os.flush();
            os.close();

        }
    } catch (SQLException ex) {
        // String message = "ERROR: " + ex.getMessage();
        ex.printStackTrace();
    }catch( ClassNotFoundException e)
    {
        e.printStackTrace();
    }
    finally {
        if (conn != null) {
            // closes the database connection
            try {
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }


        }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request,response);
    }
    }

    

