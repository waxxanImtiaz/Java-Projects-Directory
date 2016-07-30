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
        		<li class="start selected"><a href="menu.jsp">HOME</a></li>
        	    
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
      
	 <table align="center" width="780" height="180">
           
            <tr> <td height="10"><font color="#000099"><b> PERSONEL</b></td></tr>
            <tr>
            <td>
            <!--THE IMAGES ARE PLACED IN AN UNORDERED LIST-->
<ul class="enlarge"> <!--We give the list a class so that we can style it seperately from other unordered lists-->
<!--First Image-->
<li>
<a href="index.jsp"><p style="box-shadow:0px 5px 15px #00F ;"><img src="img/download (5).jpg" width="50" height="50" /></p> </a><!--thumbnail image-->
<span> <!--span contains the popup image-->
<a href="index.jsp"><img src="img/download (5).jpg" width="280" height="280" /></a> <!--popup image-->
<br /><!--caption appears under the popup image-->
</span>
</li>
<%!
private String sems;
%>
<!--Second Image-->
<li>
<a href="#"><p style="box-shadow:0px 5px 15px #00F ;"><img src="img/images (5).jpg" width="50" height="50" /></p> </a><!--thumbnail image-->
<span> <!--span contains the popup image-->
<a href="#"><img src="img/images (5).jpg" width="280" height="280" /></a> <!--popup image-->
<br /> <!--caption appears under the popup image-->
</span>
</li>
<!--Third Image-->
<li>
<a href="library.jsp"><p style="box-shadow:0px 5px 15px #00F ;"><img src="img/download (6).jpg" width="50" height="50" /></p></a> <!--thumbnail image-->
<span> <!--span contains the popup image-->
<a href="library.jsp"><img src="img/download (6).jpg" width="280" height="280" /></a> <!--popup image-->
<br /> <!--caption appears under the popup image-->
</span>
</li>
<!--4th Image-->
<li>
<a href="lectures.jsp"><p style="box-shadow:0px 5px 15px #00F ;"><img src="img/images.png" width="50" height="50" /></p></a> <!--thumbnail image-->
<span> <!--span contains the popup image-->
    <form action="lectures.jsp">
        <a href="#"><img src="img/images.png" width="280" height="280" /></a> <!--popup image-->
        <button name="sems" value="1"><img src="img/ist_semester.gif" width="80" height="80" /></button> <!--popup image-->
<button name="sems" value="2"><img src="img/2nd_semester.gif" width="80" height="80" /></button> <!--popup image-->
<button name="sems" value="3"><img src="img/3rd_semester.gif" width="80" height="80" /></button> <!--popup image-->
<button name="sems" value="4"><img src="img/4th_semester.gif" width="80" height="80" /></button> <!--popup image-->
<button name="sems" value="5"><img src="img/5th_semester.gif" width="80" height="80" /></button> <!--popup image-->
<button name="sems" value="6"><img src="img/6th_semester.gif" width="80" height="80" /></button> <!--popup image-->
<button name="sems" value="7"><img src="img/7th_semester.gif" width="80" height="80" /></button> <!--popup image-->
<button name="sems" value="8"><img src="img/8th_semester.gif" width="80" height="80" /></button> <!--popup image-->
   
    
    </form>
<br /> <!--caption appears under the popup image-->
</span>
</li>
<!--5th Image-->
<li>
<a href="eligibility.jsp"><p style="box-shadow:0px 5px 15px #00F ;"><img src="img/images (6).jpg" width="50" height="50" /></p></a> <!--thumbnail image-->
<span> <!--span contains the popup image-->
<a href="eligibility.jsp"><img src="img/images (6).jpg" width="280" height="280"/></a> <!--popup image-->
<br /> <!--caption appears under the popup image-->
</span>
</li>
<!--6th Image-->
<li>
<a href="fees.jsp"><p style="box-shadow:0px 5px 15px #00F ;"><img src="img/fees.jpg" width="50" height="50" /></p> </a><!--thumbnail image-->
<span> <!--span contains the popup image-->
<a href="fees.jsp"><img src="img/fees.jpg" width="280" height="280" /></a> <!--popup image-->
<br /> <!--caption appears under the popup image-->
</span>
</li>
</ul>
         
          </td>
            </tr>
            </table>
           <table align="center" width="780" height="260">
           
             <tr> <td height="10"><font color="#000099"><b>ACADEMICS</b></td></tr>
            <tr>
            <td>
             <!--THE IMAGES ARE PLACED IN AN UNORDERED LIST-->
<ul class="enlarge"> <!--We give the list a class so that we can style it seperately from other unordered lists-->
<!--First Image-->
<li>
<a href="#"><p style="box-shadow:0px 5px 15px #00F ;"><img src="img/download (1).jpg" width="50" height="50" /></p></a> <!--thumbnail image-->
<span> <!--span contains the popup image-->
<a href="#"><img src="img/download (1).jpg" width="280" height="280" /></a> <!--popup image-->
<a href="attendance2.jsp"><img src="img/ist_semester.gif" width="80" height="80" /></a> <!--popup image-->
<a href="#"><img src="img/2nd_semester.gif" width="80" height="80" /></a> <!--popup image-->
<a href="#"><img src="img/3rd_semester.gif" width="80" height="80" /></a> <!--popup image-->
<a href="#"><img src="img/4th_semester.gif" width="80" height="80" /></a> <!--popup image-->
<a href="#"><img src="img/5th_semester.gif" width="80" height="80" /></a> <!--popup image-->
<a href="#"><img src="img/6th_semester.gif" width="80" height="80" /></a> <!--popup image-->
<a href="#"><img src="img/7th_semester.gif" width="80" height="80" /></a> <!--popup image-->
<a href="#"><img src="img/8th_semester.gif" width="80" height="80" /></a> <!--popup image-->
<br /><!--caption appears under the popup image-->
</span>
</li>
<!--Second Image-->
<li>
<a href="#"><p style="box-shadow:0px 5px 15px #00F ;"><img src="img/images (1).jpg" width="50" height="50" /></p></a> <!--thumbnail image-->
<span> <!--span contains the popup image-->
<a href="#"><img src="img/images (1).jpg" width="280" height="280" /></a> <!--popup image-->
<br /> <!--caption appears under the popup image-->
</span>
</li>
<!--Third Image-->
<li>
<a href="result.jsp"><p style="box-shadow:0px 5px 15px #00F ;"><img src="img/images (2).jpg" width="50" height="50" /></p></a> <!--thumbnail image-->
<span> <!--span contains the popup image-->
<a href="result.jsp"><img src="img/images (2).jpg" width="280" height="280" /></a> <!--popup image-->
<a href="result.jsp"><img src="img/ist_semester.gif" width="80" height="80" /></a> <!--popup image-->
<a href="#"><img src="img/2nd_semester.gif" width="80" height="80" /></a> <!--popup image-->
<a href="#"><img src="img/3rd_semester.gif" width="80" height="80" /></a> <!--popup image-->
<a href="#"><img src="img/4th_semester.gif" width="80" height="80" /></a> <!--popup image-->
<a href="#"><img src="img/5th_semester.gif" width="80" height="80" /></a> <!--popup image-->
<a href="#"><img src="img/6th_semester.gif" width="80" height="80" /></a> <!--popup image-->
<a href="#"><img src="img/7th_semester.gif" width="80" height="80" /></a> <!--popup image-->
<a href="#"><img src="img/8th_semester.gif" width="80" height="80" /></a> <!--popup image-->
<br /><!--caption appears under the popup image-->
</span>
</li>
<!--4th Image-->
<li>
<a href="registration.jsp"><p style="box-shadow:0px 5px 15px #00F ;"><img src="img/download (7).jpg" width="50" height="50" /></p></a> <!--thumbnail image-->
<span> <!--span contains the popup image-->
<a href="registration.jsp"><img src="img/download (7).jpg" width="280" height="280" /></a> <!--popup image-->
<br /> <!--caption appears under the popup image-->
</span>
</li>
<!--5th Image-->
<li>
<a href="transcript.jsp"><p style="box-shadow:0px 5px 15px #00F ;"><img src="img/images (3).jpg" width="50" height="50" /></p></a> <!--thumbnail image-->
<span> <!--span contains the popup image-->
<a href="transcript.jsp"><img src="img/images (3).jpg" width="280" height="280"/></a> <!--popup image-->
<br /> <!--caption appears under the popup image-->
</span>
</li>
<!--6th Image-->
<li>
<a href="#"><p style="box-shadow:0px 5px 15px #00F ;"><img src="img/download.png" width="50" height="50" /></p></a> <!--thumbnail image-->
<span> <!--span contains the popup image-->
<a href="#"><img src="img/download.png" width="280" height="280" /></a> <!--popup image-->
<br /> <!--caption appears under the popup image-->
</span>
</li>

<!--7th Image-->

<li>
<a href="#"><p style="box-shadow:0px 5px 15px #00F ;"><img src="img/images (1).jpg" width="50" height="50" /></p></a> <!--thumbnail image-->
<span> <!--span contains the popup image-->
<a href="#"><img src="img/images (1).jpg" width="280" height="280" /></a> <!--popup image-->
<br /> <!--caption appears under the popup image-->
</span>
</li>
<!--8th Image-->
<li>
<a href="index.jsp"><p style="box-shadow:0px 5px 15px #00F ;"><img src="img/images (4).jpg" width="50" height="50" /></p></a> <!--thumbnail image-->
<span> <!--span contains the popup image-->
<a href="index.jsp"><img src="img/images (4).jpg" width="280" height="280" /></a> <!--popup image-->
<br /> <!--caption appears under the popup image-->
</span>
</li>
<!--9th Image-->
<li>
<a href="#"><p style="box-shadow:0px 5px 15px #00F ;"><img src="img/download (3).jpg" width="50" height="50" /></p></a> <!--thumbnail image-->
<span> <!--span contains the popup image-->
<a href="#"><img src="img/download (3).jpg" width="280" height="280" /></a> <!--popup image-->
<br /> <!--caption appears under the popup image-->
</span>
</li>
<!--10th Image-->
<li>
<a href="#"><p style="box-shadow:0px 5px 15px #00F ;"><img src="img/download (2).jpg" width="50" height="50" /></p></a> <!--thumbnail image-->
<span> <!--span contains the popup image-->
<a href="#"><img src="img/download (2).jpg" width="280" height="280" /></a> <!--popup image-->
<br /> <!--caption appears under the popup image-->
</span>
</li>
<!--11th Image-->
<li>
<a href="graph.jsp"><p style="box-shadow:0px 5px 15px #00F ;"><img src="img/images (10).jpg" width="50" height="50" /></p></a> <!--thumbnail image-->
<span> <!--span contains the popup image-->
<a href="graph.jsp"><img src="img/images (10).jpg" width="280" height="280" /></a> <!--popup image-->
<br /> <!--caption appears under the popup image-->
</span>
</li>
</ul>	
          </td>
            </tr>
            </table>
           	
            <table align="center" width="780" height="180">
           
            <tr> <td height="10"> <font color="#000099"><b>MISCELLNEOUS</b></td></tr>
            <tr>
            <td>
             <!--THE IMAGES ARE PLACED IN AN UNORDERED LIST-->
<ul class="enlarge"> <!--We give the list a class so that we can style it seperately from other unordered lists-->
<!--First Image-->
<li>
<a href="#"><p style="box-shadow:0px 5px 15px #00F ;"><img src="img/images (7).jpg" width="50" height="50" /></p></a> <!--thumbnail image-->
<span> <!--span contains the popup image-->
<a href="#"><img src="img/images (7).jpg" width="280" height="280" /></a> <!--popup image-->
<br /><!--caption appears under the popup image-->
</span>
</li>
<!--Second Image-->
<li>
<a href="#"><p style="box-shadow:0px 5px 15px #00F ;"><img src="img/download12.jpg" width="50" height="50" /></p></a> <!--thumbnail image-->
<span> <!--span contains the popup image-->
<a href="#"><img src="img/download12.jpg" width="280" height="280" /></a> <!--popup image-->
<br /> <!--caption appears under the popup image-->
</span>
</li>
</ul>

          </td>
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
                        <li><a href="#">Examples</a></li>
                        
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
                        <li><a href="#">IMTIAZ ALI WASSAN</a></li>
                        <li><a href="#">ABDUL QAYYUM LAGHARI</a></li>
                        <li><a href="#"> MAHAM MOBIN </a></li>
                        <li><a href="#">SYEDA BANIN ZEHRA </a></li>
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
                <li><a href="#">Laghari</a></li>
                <li><a href="#">Laghari</a></li>
                
            </ul>
            
            <ul>
            	<li><h4> WASSAN</h4></li>
                <li><a href="#">wassan</a></li>
                <li><a href="#">wassan</a></li>
                <li><a href="#">wassan</a></li>
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