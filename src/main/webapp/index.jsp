<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="mystyle.css">
<title>Star Wars Battle</title>
</head>
<body>
	<script src="main.js"></script>
	<%@ page errorPage="error.jsp"%>
	<div class="main">
		<h1>STAR WARS</h1>
		<p id="timeP"></p>
		<div class="menu">
			<table>
				<tr>
					<td><a href="/sjspt/" target="_self">Main</a></td>
					<td><a href="/sjspt/Battle" target="_self">Battle</a></td>
					<td><a href="/sjspt/message.jsp" target="_self">Message</a></td>
					<td><a href="/sjspt/about.jsp" target="_self">About</a></td>
				</tr>
			</table>
		</div>
	</div>
	<div class="contentType">
		<div class="contentTitle">
			<h2>Long time ago...</h2>
		</div>
		<p>Long time ago...</p>
	</div>
</body>
</html>




<!-- <html> -->
<!-- <head> -->
<!-- <title>Servlet whatever</title> -->
<!-- </head> -->
<!-- <body> -->
<!-- 	<h2>Hello World! >:3</h2> -->
<!-- 	<p> -->
<!-- 		OLDTIME: -->
<%-- 		<%=request.getAttribute("oldTime")%> --%>
<!-- 	</p> -->
<!-- 	<p> -->
<!-- 		NEWTIME: -->
<%-- 		<%=request.getAttribute("newTime")%> --%>
<!-- 	</p> -->
<!-- 	<p> -->
<!-- 		Init param: -->
<%-- 		<%=getServletConfig().getInitParameter("jspInitParam")%> --%>
<!-- 	</p> -->
<!-- 	<p> -->
<!-- 		Admin e-mail: -->
<%-- 		<%=request.getServletContext() --%>
<%-- 					.getInitParameter("adminEmail")%> --%>
<!-- 	</p> -->
<!-- 	<p> -->
<!-- 		PDF: -->
<%-- 		<%=request.getAttribute("pdf")%> --%>
<!-- 	</p> -->
<!-- </body> -->
<!-- </html> -->
