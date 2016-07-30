<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="css/main.css" />
<title>SIS</title>

</head>

<body>
 
    
<div id="megabg_container">
<div id="bg_container">
<div id="container">
	<div id="header">
		<img src="img/top_img.jpg.png" width="780" height="230" />
		
	</div>
    
   
	<div id="menu_sword">
		<div id="tabs" class="noprint">
		<h3 class="noscreen">Navigation</h3>
            <ul>
                <li><a href="index.jsp" class="sword_menu"><span class="shadow">&nbsp;PROFILE&nbsp;</span><span class="text">&nbsp;PROFILE&nbsp;</span><span class="tab-l"></span><span class="tab-r"></span></a></li>
                <li><a href="result.jsp" class="sword_menu"><span class="shadow">&nbsp;RESULT&nbsp;</span><span class="text">&nbsp;RESULT&nbsp;</span><span class="tab-l"></span><span class="tab-r"></span></a></li>
                <li><a href="attendance.jsp" class="sword_menu"><span class="shadow">&nbsp;ATTENDANCE&nbsp;</span><span class="text">&nbsp;ATTENDANCE&nbsp;</span><span class="tab-l"></span><span class="tab-r"></span></a></li>
                <li><a href="library.jsp" class="sword_menu"><span class="shadow">&nbsp;LIBRARY&nbsp;</span><span class="text">&nbsp;LIBRARY&nbsp;</span><span class="tab-l"></span><span class="tab-r"></span></a></li>                                                
           <li><a href="#" class="sword_menu"><span class="shadow">&nbsp;FEES&nbsp;</span><span class="text">&nbsp;FEES&nbsp;</span><span class="tab-l"></span><span class="tab-r"></span></a></li>  
           <li><a href="Logout.jsp" class="sword_menu"><span class="shadow">&nbsp;LOGOUT&nbsp;</span><span class="text">&nbsp;LOGOUT&nbsp;</span><span class="tab-l"></span><span class="tab-r"></span></a></li>
            </ul>
        <hr class="noscreen" />
        </div>
	</div>
           <%
               controller.Education edu = (controller.Education)session.getAttribute("edu");
               controller.PersonalInfo pInfo = (controller.PersonalInfo)session.getAttribute("pInfo");
               controller.OtherInfo otherInfo = (controller.OtherInfo)session.getAttribute("otherInfo");
               
           %>
	<div id="body">
		<div id="body-rightside">
        <table border="4">
<!--        <tr>
         <td><img src="img/4.jpg" width="150" height="187"  /></td>
		</tr>--></table>
         </div>
		<div id="body-leftside">
		<h1>PROFILE </h1>
		<p class="justify">
			<table align="center" width="963" height="20">
           
        <tr>
        
          <tr><td> <br /> <FONT FACE="Times New Roman, Times, serif" SIZE="5"  COLOR="#990000"><b><%=pInfo.getName()%> </b> </FONT></td></tr>
          <tr><td>  <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000"><b><%=pInfo.getId()%></b> </FONT></td></tr>
          <tr> <td> <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000"><b><%=pInfo.getDepart()%></b></FONT></td></tr>
          <tr> <td> <FONT FACE="Times New Roman, Times, serif" SIZE="3"  COLOR="#990000"><b>Dawood University Of Engineering And Technology </b> 
           <br /><br />	
          </FONT></td></tr>
          
       </tr>
       </table>
       
       <div >
            <table border="4" align="center" width="780">
            <tr><td colspan="2" width="395"> <br /> <FONT FACE="Times New Roman, Times, serif" SIZE="5"  COLOR="#990000"><b>PERSONEL INFORMATION</b> </FONT></td></tr>
          <tr>
          <td width="395" >  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000">ID </FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"><%=pInfo.getId()%> </FONT></td>
          </tr>
          <tr>
          <td width="395">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000">FATHER NAME </FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"><%=pInfo.getfName()%> </FONT></td>
          </tr>
          
          <tr>
          <td width="395">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000">CASTE </FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"><%=pInfo.getCaste()%> </FONT></td>
          </tr>
          <tr>
          <td width="395">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000">C NIC </FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"><%=pInfo.getCnic()%></FONT></td>
          </tr>
          <tr>
          <td width="395">  <FONT FACE="Times New Roman, Times, serif" SIZE= "4" COLOR="#990000">ADDRESS </FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"><%=pInfo.getAddress()%> </FONT></td>
          </tr>
          <tr>
          <td width="395">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000">PERMANENT ADDRESS </FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"><%=pInfo.getPermAdd()%> </FONT></td>
          </tr>
          <tr>
          <td width="395">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000">GENDER</FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"><%=pInfo.getGender()%> </FONT></td>
          </tr>
          <tr>
          <td width="395">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000">CONTACT </FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"><%=pInfo.getStContactNum()%></FONT></td>
          </tr>
          <tr>
          <td width="395">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000">FATHER CONTACT </FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"><%=pInfo.getfContactNum()%> </FONT></td>
          </tr>
          <tr>
          <td width="395">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000">E_MAIL</FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"><%=pInfo.getEmail()%></FONT></td>
          </tr>
          </table><br />
          <table border="4" align="center" width="780">
          <tr><td colspan="2" width="395"> <br /> <FONT FACE="Times New Roman, Times, serif" SIZE="5"  COLOR="#990000"><b>EDUCATION</b> </FONT></td></tr>
          <tr>
          <td width="395">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000">matriculation</FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"><%=edu.getMatriculation()%> </FONT></td>
          </tr>
          <tr>
          <td width="395">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000">INTERMEDIATE</FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"><%=edu.getIntermediate()%></FONT></td>
          </tr>
          
          <tr>
          <td width="395">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000">GRADUATION </FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"><%=edu.getGraduation()%> </FONT></td>
          </tr>
          </table><br />
          <table border="4" align="center" width="780">
          <tr><td colspan="2" width="395"> <br /> <FONT FACE="Times New Roman, Times, serif" SIZE="5"  COLOR="#990000"><b>OTHER INFORMATION</b> </FONT></td></tr>
          <tr>
          <td width="395">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000">TECHNICAL SILLS</FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"><%=otherInfo.getTechSkils()%></FONT></td>
          </tr>
          <tr>
          <td width="395">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000">INTERENSHIP</FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"><%=otherInfo.getInternship()%></FONT></td>
          </tr>
          
          <tr>
          <td width="395">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000">PROJECT </FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"><%=otherInfo.getProject()%> </FONT></td>
          </tr>
          <tr>
          <td width="395">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000">ACTIVITIES SPORTS/ELSE</FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"><%=otherInfo.getExtraActivities()%></FONT></td>
          </tr>
          <tr>
          <td width="395">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000">AREA OF INTEREST</FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"><%=otherInfo.getAreaOfIntrest()%></FONT></td>
          </tr>
          
          <tr>
          <td width="395">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000">LANGUAGES</FONT></td>
          <td width="557">  <FONT FACE="Times New Roman, Times, serif" SIZE="4"  COLOR="#990000"><%=otherInfo.getLanguages()%></FONT></td>
          </tr>
          
            </table>
            </div>
     
		</div>
	</div>
      <br />	
	<div id="footer">
		<div class="hr"><hr/></div>
			
			<div class="designedby">
			<br />
          Copyright ©  LAGHARI-WASSAN -- Designed And Developed By Abdul qayyum Laghari - Imtiaz Ali Wassan<br />
           
			</div>
	</div>
</div>
</div>
</div>
</body>

</html>
