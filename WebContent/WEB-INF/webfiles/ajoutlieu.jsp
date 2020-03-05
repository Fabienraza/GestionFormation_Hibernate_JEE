<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Ajout d'un lieu de formation </title>
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
					<h1 style=text-align:center;color:blue class="display-4">AJOUTER UN LIEU DANS LA BASE DE DONNEE ADAMING</h1>
				</div>
			</div>
		<form action="/3-GestionFormation_Hibernate_JEE/ajoutlieu" method="post">
			<div class="form-group">
				<label for="exampleFormControlInput1">ADRESSE</label> 
				<input type="text" class="form-control" placeholder="Saisir l'adresse" name="adresse">

				<label for="exampleFormControlInput1">VILLE</label> 
				<input type="text" class="form-control" placeholder="Saisir le nom de la ville" name="ville">

				<button type="submit" class="btn btn-warning">Valider</button>
			</div>
		</form>
		</div>

	</body>
</html>