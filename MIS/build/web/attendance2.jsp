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
        	    	<li class="start selected"><a href="attendance2.jsp">ATTENDANCE</a></li>
          	 	<li class="end"><a href="LogoutServlet">Logout</a></li>
        	</ul>
	</div>
    </nav>


    <div id="body" class="width">

		<br />
        
		<section id="content">
        <h2><%=pInfo.getName() %></h2>
            <h4><%=pInfo.getId() %> </h4>
            <h4><%=pInfo.getDepart()%></h4>
            <h4>Dawood University Of Engineering And Technology</h4>
            <br />
    
      <table align="center" width="780">
            <tr><td colspan="5" width="197"> <br /><FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"><b>ATTENDANCE</b> </FONT></td>     
            <tr><td colspan="5" width="197"> <br /><FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"><b>IST SEMISTER IST YEAR</b> </FONT></td></tr>
 		   <tr>
          <td width="197" height="29">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000">IST SEMISTER</FONT></td>
          <td colspan="4" width="206">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"><center><b>CEDIT HOUR</b></center></FONT></td>
          </tr>
          <tr>
          <td width="197">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"> COURSE</FONT></td>
          <td colspan="2" width="206">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"><center>THEORY </center></FONT></td>
          <td colspan="2" width="188">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"><center>PRACTICAL</center> </FONT></td>
          </td>
          </tr>
          
           <tr>
          <td width="156">        </td>
          <td width="156">TOTAL  </td>
          <td width="156">ATTENDED</td>
          <td width="156">TOTAL </td>
          <td width="156"> ATTENDED </td>
         
          </tr>
           <tr>
          <td><FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000">ITC</FONT> </td>
          <td> 100 </td>
          <td> --- </td>
          <td> 50</td>
          <td> --- </td>
           </tr>
          
          <tr>
          <td> <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000">CPP 1 </FONT></td>
          <td>100</td>
          <td> --- </td>
          <td> 50 </td>
          <td> --- </td>
          </tr>
          
          <tr>
          <td>  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000">EPC </FONT></td>
          <td>100 </td>
          <td> --- </td>
          <td> -- </td>
          <td> --- </td>
          </tr>
          
          <tr>
          <td><FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000">PAK STUDIES</FONT></td>
          <td>50 </td>
          <td> --- </td>
          <td> -- </td>
          <td>--- </td>
          </tr>
          
          <tr>
          <td> <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000">ISLAMIAT </FONT></td>
          <td> 50 </td>
          <td> --- </td>
          <td> -- </td>
          <td> --- </td>
          </td>
          </tr><tr>
          <td width="197">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000">CALCULAS</FONT></td>
          <td>100 </td>
          <td> --- </td>
          <td> -- </td>
          <td> --- </td>
          </td>
          </tr>
          <tr>
          <td colspan="5" height="30" >  </td>
          </tr>
          <tr>
          <td colspan="2" width="197">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000">PERCENTAGE </FONT></td>
          <td colspan="3" width="196">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"> ---	 </FONT></td>
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