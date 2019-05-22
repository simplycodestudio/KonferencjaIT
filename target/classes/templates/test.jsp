<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org" lang="en">
<head>
	<meta charset="UTF-8">
	<title>Contact List - Spring Boot Web Application Example</title>

</head>
<body>
<h1 align="center">Konferencja it - thymeleaf</h1>
<br/>
<table border="1" cellpadding="10" align="center">
	<tr>
		<th>Java</th>
		<th>Web</th>
		<th>FrontEnd</th>
	</tr>
	<tr>

	<tr th:each="agenda : ${agendas}">
		<td th:text="${agenda.java}">java</td>
		<td th:text="${agenda.web}">web</td>
		<td th:text="${agenda.frontend}">frontend</td>
		<input href="/profil_uzytkownika" type ="submit" value="zaloguj si?">
	</tr>

	</tr>


</table>
</body>
</html>