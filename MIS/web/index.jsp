<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>SIS</title>
<link rel="stylesheet" href="css/styles.css" type="text/css" />

</head>
<body>
 <%
         controller.Education edu = null;
         beans.StudentPersonalInfo pInfo = null;
         controller.OtherInfo otherInfo = null;
         session = request.getSession();
        response.setHeader("Cache-Control","no-cache"); //HTTP 1.1 
        response.setHeader("Cache-Control","no-store");
        response.setHeader("Pragma","no-cache"); //HTTP 1.0 
        response.setDateHeader ("Expires", 0);
       
    try{
        if( session != null)
        {
               edu = (controller.Education)session.getAttribute("edu");
               pInfo = (controller.PersonalInfo)session.getAttribute("pInfo");
               otherInfo = (controller.OtherInfo)session.getAttribute("otherInfo");
               out.println("NAME:"+pInfo.getfName());
         
        }
        else
        {
             request.getRequestDispatcher("indexpage.html").include(request, response);
             out.println("<h1 style = 'color: blue;'>Please login</h1>");
       
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
        	    	<li class="start selected"><a href="index.jsp">PROFILE</a></li>
          	 	<li class="end"><a href="LogoutServlet">Logout</a></li>
        	</ul>
	</div>
    </nav>


    <div id="body" class="width">

		<br />

		<section id="content">
      <h2><%=pInfo.getName()%> </h2>
            <h4><%=pInfo.getId()%> </h4>
            <h4><%=pInfo.getDepart()%> </h4>
            <h4>Dawood Universy Of Engineering And Technology</h4>
            <br />
	 <table align="center" width="780">
   
            <tr><td colspan="2" width="395" height="35"> <b>&nbsp; PERSONEL INFORMATION</b> </td></tr>
          <tr>
          <td width="395" >  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000">&nbsp; ID </FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000"> <%=pInfo.getId()%>  </FONT></td>
          </tr>
          <tr>
          <td width="395">  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000">&nbsp; FATHER NAME </FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000"><%=pInfo.getfName()%> </FONT></td>
          </tr>
          
          <tr>
          <td width="395">  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000">&nbsp; CASTE </FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000"> <%=pInfo.getCaste()%> </FONT></td>
          </tr>
          <tr>
          <td width="395">  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000">&nbsp; C NIC </FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000"><%=pInfo.getCnic()%></FONT></td>
          </tr>
          <tr>
          <td width="395">  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000">&nbsp; ADDRESS </FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000"><%=pInfo.getAddress()%> </FONT></td>
          </tr>
          <tr>
          <td width="395">  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000">&nbsp; PERMANENT ADDRESS </FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000"><%=pInfo.getPermAdd()%></FONT></td>
          </tr>
          <tr>
          <td width="395">  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000">&nbsp; GENDER</FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000"><%=pInfo.getGender()%></FONT></td>
          </tr>
          <tr>
          <td width="395">  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000">&nbsp; CONTACT </FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000"><%=pInfo.getStContactNum()%></FONT></td>
          </tr>
          <tr>
          <td width="395">  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000">&nbsp; FATHER CONTACT </FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000"><%=pInfo.getfContactNum()%> </FONT></td>
          </tr>
          <tr>
          <td width="395">  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000">&nbsp; E-MAIL</FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000"><%=pInfo.getEmail()%></FONT></td>
          </tr>
          </table>
          <br />
          <table align="center" width="780">
          <tr><td colspan="2" width="395" height="35"><b>&nbsp; EDUCATION</b> </FONT></td></tr>
          <tr>
          <td width="395">  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000">&nbsp; matriculation</FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000"><%=edu.getMatriculation()%></FONT></td>
          </tr>
          <tr>
          <td width="395">  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000">&nbsp; INTERMEDIATE</FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000"><%=edu.getIntermediate()%></FONT></td>
          </tr>
          
          <tr>
          <td width="395">  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000">&nbsp; GRADUATION </FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000"><%=edu.getGraduation()%> </FONT></td>
          </tr>
          </table>
          <br />
          <table align="center" width="780">
          <tr><td colspan="2" width="395" height="35"><b>&nbsp; OTHER INFORMATION</b> </FONT></td></tr>
          <tr>
          <td width="395">&nbsp; TECHNICAL SILLS</FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000"><%=otherInfo.getTechSkils()%></FONT></td>
          </tr>
          <tr>
          <td width="395">&nbsp; INTERENSHIP</FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000"><%=otherInfo.getInternship()%></FONT></td>
          </tr>
          
          <tr>
          <td width="395">&nbsp; PROJECT </FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000"><%=otherInfo.getProject()%> </FONT></td>
          </tr>
          <tr>
          <td width="395">&nbsp; ACTIVITIES SPORTS/ELSE</FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000">          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000"><%=otherInfo.getExtraActivities()%></FONT></td>
</FONT></td>
          </tr>
          <tr>
          <td width="395">&nbsp; AREA OF INTEREST</FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000"> <%=otherInfo.getAreaOfIntrest()%></FONT></td>
          </tr>
          
          <tr>
          <td width="395"> &nbsp; LANGUAGES</FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000">          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000"><%=otherInfo.getLanguages()%></FONT></td>
</FONT></td>
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
