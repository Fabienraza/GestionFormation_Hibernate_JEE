<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<style type="text/css"> <%@ include file="bootstrap.min.css" %> </style>
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
					<h1>Ajouter une formation dans la base de donnée </h1>
				</div>
			</div>

		<div class="row">
				<div class="col-lg-12">
					<form action="/3-GestionFormation_Hibernate_JEE/ajout" method="post">
						<label> Thème de la formation </label> <input type="text"
							name="theme" placeholder="Saisir le thème de la formation">
	
						<input type="submit" value="Ajouter">
					</form>
				</div>
			</div>
		</div>
	</body>
</html>