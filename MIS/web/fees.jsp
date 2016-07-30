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
        	    	<li class="start selected"><a href="fees.jsp">FEES</a></li>
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
            <h4>Dawood Universy Of Engineering And Technology</h4>
            <br />
    
     <table align="center" width="780">
            <tr><td colspan="9" width="195"> <br /> <FONT FACE="Times New Roman, Times, serif" SIZE="5"  COLOR="#990000"><b>&nbsp; FEES</b> </FONT></td></tr>
         <td colspan="5" width="195"  height="30"><FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"><b><center> FEES STATEMENT</center></b> </FONT></td>
          </tr>
          
          <tr>
          <td width="195" height="30">&nbsp; Ist YEAR<td>&nbsp; Mid Term</td><td>&nbsp; Ist Semister exam</td><td>&nbsp; Mid Term</td><td>&nbsp; 2nd Semister exam</td></td></FONT>
          </tr>
          <tr>
          <td width="195" height="30">&nbsp; - - <td>&nbsp;  - -</td><td>&nbsp;  - - </td><td>&nbsp; - - </td><td>&nbsp; - -</td></td></FONT>
          </tr>
          <tr>
          <td width="195" height="30">&nbsp; 2nd YEAR<td>&nbsp; Mid Term</td><td>&nbsp; 3rd Semister exam</td><td>&nbsp; Mid Term</td><td>&nbsp; 4th Semister exam</td></td></FONT>
          </tr>
          <tr>
          <td width="195" height="30">&nbsp; - - <td>&nbsp;  - -</td><td>&nbsp;  - - </td><td>&nbsp; - - </td><td>&nbsp; - -</td></td></FONT>
          </tr>
          <tr>
          <td width="195" height="30">&nbsp; 3rd YEAR<td>&nbsp; Mid Term</td><td>&nbsp; 5th Semister exam</td><td>&nbsp; Mid Term</td><td>&nbsp; 6th Semister exam</td></td></FONT>
          </tr>
          <tr>
          <td width="195" height="30">&nbsp; - - <td>&nbsp;  - -</td><td>&nbsp;  - - </td><td>&nbsp; - - </td><td>&nbsp; - -</td></td></FONT>
          </tr>
          <tr>
          <td width="195" height="30">&nbsp; 4th YEAR<td>&nbsp; Mid Term</td><td>&nbsp; 7th Semister exam</td><td>&nbsp; Mid Term</td><td>&nbsp; 8th Semister exam</td></td></FONT>
          </tr>
          <tr>
          <td width="195" height="30">&nbsp; - - <td>&nbsp;  - -</td><td>&nbsp;  - - </td><td>&nbsp; - - </td><td>&nbsp; - -</td></td></FONT>
          </tr>
          
          
         <tr> <td colspan="5" width="295"  height="30"><a href="#"><FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"><b><center>FEES CHART</center></b> </FONT></a></td>
          </tr><tr>
          
          
<td width="195" height="30"><FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000"><b>&nbsp; FINE</b></FONT></td>
         <td colspan="4">&nbsp; - - ( not paying fees on time ) </td>
          </tr>
       	
          <tr>
          <td colspan="5" width="295"  height="30"><FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"><b>&nbsp; Note : Pay fees on time otherwise you will not be able to sit in exams .</b> </FONT></td>
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