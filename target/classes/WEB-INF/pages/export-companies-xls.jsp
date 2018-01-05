<%@ page language="java" contentType="text/html; charset=ISO-8859-15/EURO"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-15/EURO">
<title>Entreprises XLS Export</title>
</head>
<body>
	<form:form action="exportCompaniesXLS" method="post">
		<h3>Entreprises XLS Export</h3>
		<input type="submit" value="Entreprises XLS Report">
	</form:form>
</body>
</html>