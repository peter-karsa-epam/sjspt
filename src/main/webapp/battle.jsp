<%@ page isELIgnored="false"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<link rel="stylesheet" type="text/css" href="mystyle.css">
<title>Star Wars Battle</title>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script type="text/javascript">

	$(document).ready(function() {
		$("#battleShow").click(function() {
			$.getJSON("details.json", function(data) {
				$.each(data, function(index, value) {
					$("#bdetails").html(value);
					$('html, body').scrollTop($(document).height());
				});
			});
		});
	});
	
</script>
</head>
<body>
	<script src="main.js"></script>
	<%@ taglib prefix="mine" uri="myTag"%>
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
			<h2>JSP</h2>
		</div>
		<button onclick="showHideDiv('battleId')">Show battle details</button>
	</div>

	<div class="contentType">
		<div class="contentTitle">
			<h2>Star Wars Battle</h2>
			<h4>Battlefield name:${theBigBattle.battleField.name}</h4>
		</div>
		<div class="battle" id="battleId" style="display: none;">

			<c:forEach var="army" items="${theBigBattle.battleField.armies}">

				<table id="armyTable">
					<caption>Battle participants</caption>
					<tr>
						<td><p>Leader: ${army.leader}</p></td>
					</tr>

					<c:forEach var="jedi" items="${army.forceUsers}">
						<tr>
							<td>${jedi.name}</td>
						</tr>
					</c:forEach>

					<c:forEach var="soldierList" items="${army.soldierList}">
						<tr>
							<td>${soldierList.name}</td>
						</tr>
					</c:forEach>

				</table>

			</c:forEach>
		</div>
		<%-- 						<mine:date /> --%>
	</div>

	<div class="contentType">
		<div class="contentTitle">
			<h2>Battle moves</h2>
		</div>

		<button id="battleShow">Show the Action</button>

		<p class="details" id="bdetails">

			<%@ taglib prefix="battled" uri="Battle"%>
			<battled:details battle="${theBigBattle}" />

		</p>

	</div>

	<script src="script.js"></script>
</body>
<%-- <footer><%@include file="/WEB-INF/frags/fragfooter.jspf"%></footer> --%>
</html>
