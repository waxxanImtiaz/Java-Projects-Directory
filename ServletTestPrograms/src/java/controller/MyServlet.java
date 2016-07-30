/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
public class MyServlet extends HttpServlet {

   @Override
   public void service( HttpServletRequest req,HttpServletResponse res )
   throws ServletException,IOException
   {
       PrintWriter out = res.getWriter();
       String fileName = getServletConfig().getInitParameter("myFile");
       
       File f = new File(fileName);
       
       
       String num1 = req.getParameter("num1");
       String num2 = req.getParameter("num2");
       
       FileOutputStream openFile = new FileOutputStream(f);
       DataOutputStream writeFile = new DataOutputStream(openFile);
       
       writeFile.writeChars(num1);
       writeFile.writeChars(num2);
       writeFile.flush();
       writeFile.close();
       openFile.close();
       FileInputStream fis = new FileInputStream(f);
       
       DataInputStream dos = new DataInputStream(fis);
       int i; 
       while( (i=dos.read()) != -1 ){
           out.print("<h1>"+(char)i+"</h1>");
      }
     fis.close();
     dos.close();
   }
}
