<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Manager CEP</title>
<link rel="shortcut icon" type="image/ico"
	href="<c:url value='/resources/img/cep.ico' />" />
<link href="<c:url value='/resources/css/bootstrap.min.css' />"
	rel="stylesheet"></link>
<link href="<c:url value='/resources/css/app.css' />" rel="stylesheet"></link>
<link rel="stylesheet" type="text/css"
	href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.css" />
<meta http-equiv="max-age" content="0" />
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Expires" content="0" />
<meta http-equiv="refresh" content="40;URL=login">
</head>
<body>
	<div id="mainWrapper">
		<div class="login-container">
			<div class="login-card">
				<div class="login-form">
					<div align="center" class="text-primary">
						<h2>
							<b>Manager CEP</b> <a href="http://www.cep.ch" target=blank><img
									src="<c:url value='/resources/img/cep.png' />"
									class="img-rounded" alt="CEP" width="30" height="30"></a>
						</h2>
					</div>
					<c:url var="loginUrl" value="/login" />
					<form action="/managerCEP/login" method="post"
						class="form-horizontal">
						<c:if test="${param.error != null}">
							<div class="alert alert-danger">
								<!--p>Invalid username and password.</p-->
								<p style="color: red;">
									<b>Password et/ou login non valide(s)!</b>
								</p>
							</div>
						</c:if>
						<c:if test="${param.logout != null}">
							<div class="alert alert-success">
								<!--p>You have been logged out successfully.</p-->
								<p style="color: green;">
									<b>Logout effectué avec succès!</b>
								</p>
							</div>
						</c:if>
						<div class="input-group input-sm">
							<label class="input-group-addon" for="username"><i
								class="fa fa-user"></i></label> <input type="text" class="form-control"
								id="username" name="username" placeholder="Login (User Name)"
								required>
						</div>
						<div class="input-group input-sm">
							<label class="input-group-addon" for="password"><i
								class="fa fa-lock"></i></label> <input type="password"
								class="form-control" id="password" name="password"
								placeholder="Password" required>
						</div>
						<input type="hidden" name="${_csrf.parameterName}"
							value="${_csrf.token}" />
						<div class="form-actions">
							<input type="submit"
								class="btn btn-block btn-primary btn-default" value="Log in">
						</div>
					</form>
						<div align="center">
		<img src="resources/img/cep.jpg" class="img-rounded" alt="CEP"
			width="250" height="220">
	</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>