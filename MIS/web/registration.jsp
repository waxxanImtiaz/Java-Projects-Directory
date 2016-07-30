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
        	    	<li class="start selected"><a href="registration.jsp">REGISTRATION</a></li>
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
     <table WIDTH=780 HEIGHT=500 >
          <tr><td colspan="3">
  <FONT FACE="arial, helvetica" SIZE="4"  COLOR="royal blue">&nbsp; Registration Form :</FONT> <br />
      </td></tr>
        
<form action="#" method="get">

<tr>
<td><FONT FACE="arial, helvetica" SIZE="3" COLOR="#990000" >&nbsp; Shifts</FONT></td>
<td><input type="radio" name="sex" value="male"> morning</td>
<td><input type="radio" name="sex" value="female"> evening
</td></tr>
</form>
<tr>
<td><FONT FACE="arial, helvetica" SIZE="3" COLOR="#990000">&nbsp; Name</FONT></td>
<td colspan="2"><input type="text" name="name" placeholder="Enter Your Name" size="40"></td>
</tr>
<tr>
<td><FONT FACE="arial, helvetica" SIZE="3"COLOR="#990000" >&nbsp; Father Name</FONT></td>
<td colspan="2"><input type="text" name="fname" placeholder="Enter Your father Name" size="40"></td>
</tr>
<tr>
<td><FONT FACE="arial, helvetica" SIZE="3"COLOR="#990000" >&nbsp; Surname</FONT></td>
<td colspan="2"><input type="text" name="surname" placeholder="Enter Your surname" size="40"></td>
</tr>
<form>
<tr>
<td><FONT FACE="arial, helvetica" SIZE="3"COLOR="#990000" >&nbsp; Sex</FONT></td>
<td><input type="radio" name="sex" value="male"> male</td>
<td><input type="radio" name="sex" value="female"> female
</td></tr></form>
<tr>
<td><FONT FACE="arial, helvetica" SIZE="3" COLOR="#990000">&nbsp; Date Of Birth</FONT></td>
<td colspan="2"><input type="date" name="dob" placeholder="enter your date of birth" size="40"></td>
</tr>
<tr>
<td><FONT FACE="arial, helvetica" SIZE="3"COLOR="#990000" >&nbsp; Year</FONT> </td>
<td colspan="2"><input type="text" name="qualification" placeholder="Enter Your Year" size="40"></td>
</tr>
<form>
<tr>
<td><FONT FACE="arial, helvetica" SIZE="3"COLOR="#990000" >&nbsp; Semister</FONT></td>
<td><input type="radio" name="sex" value="male"> spring </td>
<td><input type="radio" name="sex" value="female"> fall
</td></tr></form>
</tr>
<tr> 
<td><FONT FACE="arial, helvetica" SIZE="3" COLOR="#990000" >&nbsp; CNIC Number</FONT> </td>
<td colspan="2"><input type="text" name="nic" placeholder="Enter Your nic" size="40"></td>
</tr>
<tr>
<td><FONT FACE="arial, helvetica" SIZE="3"COLOR="#990000" >&nbsp; Residential Address</FONT> </td>
<td colspan="2"><input type="text" name="address" placeholder="Enter Your residential address"></td>
</tr>
<tr>
<td><FONT FACE="arial, helvetica" SIZE="3"COLOR="#990000" >&nbsp; Telephone</FONT> </td>
<td colspan="2"><input type="text" name="telephone_res" placeholder="Enter Your residential number" size="40"></td>
</tr>
<tr>
<td><FONT FACE="arial, helvetica" SIZE="3"COLOR="#990000" >&nbsp; Mobile</FONT></td>
<td colspan="2"><input type="text" name="telephone_mob" placeholder="Enter Your mobile number" size="40"></td>
</tr>
<tr>
<td><FONT FACE="arial, helvetica" SIZE="3"COLOR="#990000" >&nbsp; Email</FONT></td>
<td colspan="2"><input type="email" name="email" placeholder="Enter Your email" size="40"></td>
</tr>
<tr>
<td colspan="3">&nbsp; <button type="submit" value="Submit">Submit</button></td>
</tr>
</table>

</form>
     
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