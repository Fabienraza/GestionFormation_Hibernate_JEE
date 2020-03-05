<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
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
					<h5 style=text-align:center;color:blue class="display-3">AJOUTER UNE FORMATION DANS LA BASE DE DONNEE ADAMING</h5>
				</div>
			</div>

		<div class="row">
				<div class="col-lg-12">
					<form action="/3-GestionFormation_Hibernate_JEE/ajoutformation" method="post">
						<div class="form-group">
							<label> Thème de la formation </label> 
							<input type="text" name="theme" placeholder="Saisir le thème de la formation"> <br>
							
							<label>Lieu de la formation </label>
							<select name="lieuFormation">
								<c:forEach items="${listeLieu}" var="liste">
									<option value="${liste.idLieu}">${liste.ville}</option>
								</c:forEach>
							</select> <br>
	
							<button type="submit" class="btn btn-warning">Valider</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</body>
</html>