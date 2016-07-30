<html>
<head>
<title></title>
</head>
<body bgcolor ='#F5F5F5'>
<font face='Bitstream Vera Sans' color='#CD5C5C'>
<form name="Form1"  >
</font>
<%@ page import ="java.sql.*,java.util.*,java.awt.*,java.io.*" %>
 
<%!
 
%>
 
<%!
      String DomainName ="jdbc:oracle:thin:@192.168.251.28:1521:ss";
      String UserName="hr";
      String PassWord="ssss";
 
      private byte[] getReturnInvoiceDetails(String SId)
      {
 
           byte[] image = new byte[300000];
           try
           {
 
                  int n=0;
                  n =System.in.available();
                  image = new byte[n];
                 Image pic =null;
                  Blob blob =null;
 
                  String QS =" Select shadeimg  from ShadeCardSample Where id =26";
 
                   Class.forName("oracle.jdbc.OracleDriver");
                   Connection cn=DriverManager.getConnection(DomainName,UserName,PassWord);  
                   Statement  st=cn.createStatement();
                   ResultSet  rs= st.executeQuery(QS);
 
                   while(rs.next())
                   {
                     image  =rs.getBytes(1);
 
                   }
 
             }
           catch(Exception e)
           {
               System.out.println(e);
           }
 
        return image;
      }
%>
 
<%
 
    String ID =(String)request.getParameter("IMGID");
 
    byte[] Pic = getReturnInvoiceDetails(ID);
    response.setContentType("image/gif");
    OutputStream o =response.getOutputStream();
    o.write(Pic);
    o.flush();
    o.close();
    out.close();    
%>
</form>
<body>
</html>
