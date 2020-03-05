<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>
	<head>
		<meta charset="utf-8">
		<title>Liste des formations</title>
		<style type="text/css"> <%@ include file="bootstrap.min.css" %> </style>
	</head>
	
	<body>
	<form action="/3-GestionFormation_Hibernate_JEE/liste" method="post">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<%@ include file="navbar.jsp"%>
			</div>
		</div>

		<div class="row">
			<div class="col-lg-12">
				<h1 class="display-4" style=text-align:center>La liste des formations présentes dans la base de donnée</h1>
			</div>
		</div>

		<div class="row">
			<div class="col-lg-12">
				<h6>Trier par ville </h6> 		
			</div>
		</div>
		
		<div class="row">
			<div class="col-lg-12">
				<select name="lieuF">
					<c:forEach items="${listeLieu}" var="listeL">
						<option value="${listeL.idLieu}">${listeL.ville}</option>
					</c:forEach>
				</select> 
			</div>
		</div>
		
		<div class="row">
			<div class="col-lg-12">
				<input type="submit" value="TRIER"> <br>
			</div>
		</div>

		<div class="row">
						<div class="col-lg-6">
							<table class="table" style=text-align:center>
								<thead class="thead-dark">
									<tr>
										<th scope="col"><h4>ID FORMATION</h4></th>
										<th scope="col"><h4>THEME</h4></th>
										<th scope="col"><h4>LIEU DE FORMATION</h4></th>
									</tr>
								</thead>
							</table>
						</div>
					</div>
					
		<div class="row">
			<div class="col-lg-6">
				<table class="table" style="text-align: right">
					<c:forEach items="${listeForm}" var="liste">
						<tr>
							<td><h6>${liste.id}</h6></td>
							<td><h6>${liste.theme}</h6></td>
							<td><h6>${liste.lieu.ville}</h6></td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
</form>
</body>
</html>