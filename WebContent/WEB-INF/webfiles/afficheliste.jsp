<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Liste des formations</title>
		<style type="text/css"> <%@ include file="bootstrap.min.css" %> </style>
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	</head>
	
	<body>
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<%@ include file="navbar.jsp"%>
			</div>
		</div>

		<div class="row">
			<div class="col-lg-12">
				<h1>La liste des formations présentes dans la base de donnée</h1>
			</div>
		</div>

		<div class="row">
			<div class="col-lg-12">
				<c:forEach items="${listeForm}" var="liste">
					<h5>${liste.id}</h5>
					<h5>${liste.theme}</h5>
				</c:forEach>
			</div>
		</div>
	</div>
</body>
</html>