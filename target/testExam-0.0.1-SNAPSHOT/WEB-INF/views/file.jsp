<!DOCTYPE jsp>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@ page session="false" pageEncoding="UTF-8"%>
<html>
<head>
<title>Computer Database</title>

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="utf-8">



</head>
<body>
	<header class="navbar navbar-inverse navbar-fixed-top">
		<div id="logout" class="navbar-right">
		MADA
		</div>
	</header>
	<div class="container">

	<!-- Browse attribute computers -->
	<p> LIST OF STUDIENT WITH SERVICE</p>
				<c:forEach items="${students}" var="student">
					<tbody id="results">
						<tr>
							<td><p>${student.id}</p></td>
							<td><p>${student.name}</p></td>
						</tr>
					</tbody>
				</c:forEach>
	<p>image</p>

	<img id="flag" src="${image1}"/>
	<img id="flag2" src="${image2}"/>

	<!-- Browse attribute computers -->
	<p> LIST OF STUDIENT WITH CLIENT SERVICE</p>
				<c:forEach items="${clientStudents}" var="student">
					<tbody id="results">
						<tr>
							<td><p>${student.id}</p></td>
							<td><p>${student.name}</p></td>
						</tr>
					</tbody>
				</c:forEach>
							
  
	I want to put an image
	</div>


</body>
</html>