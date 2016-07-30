<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>SIS</title>
<link rel="stylesheet" href="css/styles.css" type="text/css" />

</head>
<body>
     <%
         controller.PersonalInfo pInfo = null;
         session = request.getSession(false);
         response.setHeader("Cache-Control","no-cache"); //HTTP 1.1 
         response.setHeader("Cache-Control","no-store");
         response.setHeader("Pragma","no-cache"); //HTTP 1.0 
         response.setDateHeader ("Expires", 0);
       
    try{
        if( !session.getAttribute("username").toString().equals( "" ) )
        {
               pInfo = (controller.PersonalInfo)session.getAttribute("pInfo");
         
        }
        }catch( Exception e )
        {
            
                request.getRequestDispatcher("indexpage.html").include(request, response);
                out.println("<h1 style = 'color: blue;'>Please login</h1>");
        }
    %>
   
<div id="container">
    <header>
	<div class="width">
    			
          <img src="img/top_img.jpg.png" width="818" height="220">  
            
       	</div>
    </header>
    <nav>
	<div class="width">
    		<ul>
        		<li class=""><a href="menu.jsp">HOME</a></li>
        	    	<li class="start selected"><a href="transcript.jsp">TRANSCRIPT</a></li>
          	 	<li class="end"><a href="LogoutServlet">Logout</a></li>
        	</ul>
	</div>
    </nav>


    <div id="body" class="width">

		<br />
        
		<section id="content">
    <h2><%=pInfo.getName() %></h2>
            <h4><%=pInfo.getId() %></h4>
            <h4><%=pInfo.getDepart() %></h4>
            <h4>Dawood University Of Engineering And Technology</h4>
            <br />
     <table align="center" width="780">
 <tr><td colspan="6" width="197" height="35"><FONT FACE="Times New Roman, Times, serif" SIZE="5"  COLOR="#990000"><b>&nbsp; Academic Transcript</b> </FONT></td>     </tr>
 		   <tr>
          <td colspan="6" width="197" height="29"><center><b>D_13_CS_30</b></center></td>
          
          </tr>
          <tr>
   <td width="200"> <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"><center>Semister</center></FONT></td>  <td width="206">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"><center>TOTAL MARKS (Th/Pr)</center></FONT></td>  	<td width="206">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"><center>EARNED MARKS</center></FONT></td>
 <td width="188">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"><center>PERCENTAGE % </center> </FONT></td>
 <td width="188">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"><center>GRADE </center> </FONT></td>
 <td width="188">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"><center>GPA </center> </FONT></td>
</td>
</tr> 
          <tr>
<td height="25" >&nbsp; 1st </td>  <td>&nbsp; 600 </td>  <td> </td> <td> </td> <td> </td><td> </td> 
          </tr>
         
          <tr>
<td height="25" >&nbsp; 2nd </td> <td>&nbsp; 650 </td>  <td> </td> <td> </td> <td> </td><td> </td> 
          </tr>
         
          <tr>
<td height="25" >&nbsp; 3rd </td> <td>&nbsp; 650 </td>  <td> </td> <td> </td> <td> </td><td> </td> 
          </tr>
          
          <tr>
<td height="25" >&nbsp; 4th </td> <td>&nbsp; 650 </td>  <td> </td> <td> </td> <td> </td><td> </td> 
          </tr>
          
          <tr>
<td height="25" >&nbsp; 5th </td> <td>&nbsp; 700 </td>  <td> </td> <td> </td> <td> </td><td> </td> 
          </tr>
     
          <tr>
<td height="25" >&nbsp; 6th</td>  <td>&nbsp; 550 </td>  <td> </td> <td> </td> <td> </td><td> </td> 
          </tr>
          
          <tr>
<td height="25" >&nbsp; 7th </td> <td>&nbsp; 500 </td>  <td> </td> <td> </td> <td> </td> <td> </td> 
          </tr>
          
          <tr>
<td height="25" >&nbsp; 8th </td> <td>&nbsp; 600  </td>  <td> </td> <td> </td> <td> </td><td> </td> 
          </tr>
          
          <tr><td colspan="6" height="20" >  </td></tr>
          
          <tr>
          <td colspan="3"  width="197">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000">&nbsp; TOTAL PERCENTAGE </FONT></td>
          <td colspan="3" width="196">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000">&nbsp;  ---	 </FONT></td>
          </tr><tr>
          <td colspan="3" width="157">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000">&nbsp; TATAL GPA</FONT></td>
          <td colspan="3"  width="157">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000">&nbsp;  --- </FONT></td>
          </tr>
          </table>
    
        </section>
        
    
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="file:///D|/my material/My projects/@SIS/img/4.jpg" width=140" height="180">
       
        <aside class="sidebar">
        
	
            <ul>	
               <li>
                    <h4>Categories</h4>
                    <ul>
                        <li><a href="menu.jsp">Home Page</a></li>
                        <li><a href="">Examples</a></li>
                        
                    </ul>
                </li>
                
                <li>
                    <h4>About us</h4>
                    <ul>
                        <li class="text">
                        	<p style="margin: 0;">AQ _ IA _ MM _ BR <a href="#" class="readmore"><br /><br />Read More </a></p>
                        </li>
                    </ul>
                </li>
                
                <li>
                	<h4>Search</h4>
                    <ul>
                    	<li class="text">
                            <form method="get" class="searchform" action="#" >
                                <p>
                                    <input type="text" size="22" value="" name="s" class="s" />
                                    
                                </p>
                            </form>	
						</li>
					</ul>
                </li>
                
                <li>
                    <h4>Helpful Links</h4>
                    <ul>
                        <li><a href="#"> WASSAN</a></li>
                        <li><a href="#"> LAGHARI</a></li>
                        <li><a href="#"> MAHAM </a></li>
                        <li><a href="#"> BANIN </a></li>
                    </ul>
                </li>
                
            </ul>
		
        </aside>
    	<div class="clear"></div>
    </div>
    <footer>
        <div class="footer-content width">
            <ul>
            	<li><h4>Laghari</h4></li>
                <li><a href="#">Laghari</a></li>
                
                
            </ul>
            
            <ul>
            	<li><h4>WASSAN</h4></li>
                <li><a href="#">wassan</a></li>
                
                
            </ul>
         
            
            <div class="clear"></div>
        </div>
        <div class="footer-bottom">
<p>&copy; AQ-IA-MM-BR . Desiign And Developed by Abdul Qayyum laghari-Imtiaz Ali Wassan-MAHAM MOBIN-SYEDA BANIN RIZVI </p>
         </div>
    </footer>
</div>
</body>
</html>