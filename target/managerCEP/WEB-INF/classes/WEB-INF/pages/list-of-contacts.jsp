<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
 <%
response.setHeader("Cache-Control", "no-cache");
response.setHeader("Cache-Control", "no-store");
response.setHeader("Pragma", "no-cache");
response.setDateHeader("Expires", 0);
 %>
<html>
<head>
<meta charset="utf-8" />
<link rel="shortcut icon" type="image/ico"
	href="<c:url value='/resources/img/cep.ico' />" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport"
	content="width=device-width, shrink-to-fit=no, initial-scale=1" />
<meta name="description" content="" />
<meta name="author" content="" />
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="//ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<link rel="stylesheet"
	href="//cdn.datatables.net/1.10.2/css/jquery.dataTables.min.css">
<script type="text/javascript"
	src="//cdn.datatables.net/1.10.2/js/jquery.dataTables.min.js"></script>
<script type="text/javascript"
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<link href="<c:url value='/resources/css/prettysidebar.css' />"
	rel="stylesheet" />
<link href="resources/fonts/bootstrap-glyphicons.css" rel="stylesheet" />
<link
	href="//cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/2.3.2/css/bootstrap-responsive.min.css"
	rel="stylesheet" />
<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" />
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css" />
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!-- [if lt IE 9] -->
<!-- script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script -->
<!-- script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script -->
<!-- ![endif]-- -->
<!-- Begin ISSUE -->
<script type="text/javascript"
	src="//code.jquery.com/jquery-1.10.2.js"></script>
<!-- End Issue -->
<script>
	jQuery.noConflict();
</script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.12.2/js/bootstrap-select.min.js"></script>
<script  type="text/javascript">
jQuery(document).ready(function($) {

	if (window.history && window.history.pushState) {

	window.history.pushState('forward', null, null);

	$(window).on('popstate', function() {
	window.location.href = "/managerCEP/contact/list.html";
	});

	}
	});
</script>
<script type="text/javascript">
function htmlbodyHeightUpdate() {
	var height3 = $(window).height()
	var height1 = $('.nav').height() + 50
	height2 = $('.main').height()
	if (height2 > height3) {
		$('html').height(Math.max(height1, height3, height2) + 10);
		$('body').height(Math.max(height1, height3, height2) + 10);
	} else {
		$('html').height(Math.max(height1, height3, height2));
		$('body').height(Math.max(height1, height3, height2));
	}

}
$(document).ready(function() {
	htmlbodyHeightUpdate()
	$(window).resize(function() {
		htmlbodyHeightUpdate()
	});
	$(window).scroll(function() {
		height2 = $('.main').height()
		htmlbodyHeightUpdate()
	});
});
</script>
<script type="text/javascript">
$(document).ready(function(){
    $('#data td.category4company').each(function(){
        if ($(this).text() == 'Club-Entreprises') {
            $(this).css('color','red');
        }
    });
});
</script>
<style>
table#data {
	border: 1px solid #c3c3c3;
	border-radius: 5px;
	border-spacing: 0px;
	border-collapse: separate;
}

table th {
	font-weight: 600;
	font-size: 1.1em;
	text-align: left;
	background: #00bfff; /*#d8d8d8*/
}

table td {
	background: transparent;
}
</style>
<style>
table#view {
	border: 1px solid #c3c3c3;
	border-radius: 5px;
	border-spacing: 0px;
	border-collapse: separate;
}
</style>
<style>
body, html {
	height: 100%;
}
/* remove outer padding */
.main .row {
	padding: 0px;
	margin: 0px;
}
/*Remove rounded coners*/
nav.sidebar.navbar {
	border-radius: 0px;
}

nav.sidebar, .main {
	-webkit-transition: margin 200ms ease-out;
	-moz-transition: margin 200ms ease-out;
	-o-transition: margin 200ms ease-out;
	transition: margin 200ms ease-out;
}
/* Add gap to nav and right windows.*/
.main {
	padding: 10px 10px 0 10px;
}
/* .....NavBar: Icon only with coloring/layout.....*/
/*small/medium side display*/
@media ( min-width : 768px) {
	/*Allow main to be next to Nav*/
	.main {
		position: absolute;
		width: calc(100% - 40px); /*keeps 100% minus nav size*/
		margin-left: 40px;
		float: right;
	}
	/*lets nav bar to be showed on mouseover*/
	nav.sidebar:hover+.main {
		margin-left: 200px;
	}
	/*Center Brand*/
	nav.sidebar.navbar.sidebar>.container .navbar-brand, .navbar>.container-fluid .navbar-brand
		{
		margin-left: 0px;
	}
	/*Center Brand*/
	nav.sidebar .navbar-brand, nav.sidebar .navbar-header {
		text-align: center;
		width: 100%;
		margin-left: 0px;
	}
	/*Center Icons*/
	nav.sidebar a {
		padding-right: 13px;
	}
	/*adds border top to first nav box */
	nav.sidebar .navbar-nav>li:first-child {
		border-top: 1px #e5e5e5 solid;
	}
	/*adds border to bottom nav boxes*/
	nav.sidebar .navbar-nav>li {
		border-bottom: 1px #e5e5e5 solid;
	}
	/* Colors/style dropdown box*/
	nav.sidebar .navbar-nav .open .dropdown-menu {
		position: static; /*absolute*/
		float: none;
		width: auto;
		margin-top: 0;
		background-color: transparent;
		border: 0;
		-webkit-box-shadow: none;
		box-shadow: none;
	}
	/*allows nav box to use 100% width*/
	nav.sidebar .navbar-collapse, nav.sidebar .container-fluid {
		padding: 0 0px 0 0px;
	}
	/*colors dropdown box text */
	.navbar-inverse .navbar-nav .open .dropdown-menu>li>a {
		color: #FDFEFE;
	}
	/*gives sidebar width/height*/
	nav.sidebar {
		width: 200px;
		height: 100%;
		margin-left: -160px;
		float: left;
		z-index: 8000;
		margin-bottom: 0px;
	}
	/*give sidebar 100% width;*/
	nav.sidebar li {
		width: 100%;
	}
	/* Move nav to full on mouse over*/
	nav.sidebar:hover {
		margin-left: 0px;
	}
	/*for hiden things when navbar hidden*/
	.forAnimate {
		opacity: 0;
	}
}
/* .....NavBar: Fully showing nav bar..... */
@media ( min-width : 1330px) {
	/*Allow main to be next to Nav*/
	.main {
		width: calc(100% - 200px); /*keeps 100% minus nav size*/
		margin-left: 200px;
	}
	/*Show all nav*/
	nav.sidebar {
		margin-left: 0px;
		float: left;
	}
	/*Show hidden items on nav*/
	nav.sidebar .forAnimate {
		opacity: 1;
	}
}

nav.sidebar .navbar-nav .open .dropdown-menu>li>a:hover, nav.sidebar .navbar-nav .open .dropdown-menu>li>a:focus
	{
	color: #CCC;
	background-color: transparent;
}

nav:hover .forAnimate {
	opacity: 1;
}

section {
	padding-left: 15px;

</style>
</head>
<body>
	<nav class="navbar navbar-inverse sidebar" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
								<a class="navbar-brand" href="http://www.cep.ch" target=blank><img
									src="<c:url value='/resources/img/cep.png' />"
									class="img-rounded" alt="CEP" width="30" height="30"></a>
			</div>
			<div class="collapse navbar-collapse"
				id="bs-sidebar-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li class="active"><a href="/managerCEP/">Home<span
							style="font-size: 16px;"
							class="pull-right hidden-xs showopacity glyphicon glyphicon-home"></span></a></li>
					<li><a href="/managerCEP/company/list.html">Entreprises<span
							style="font-size: 16px;"
							class="pull-right hidden-xs showopacity glyphicon glyphicon-tower"></span></a></li>
					<li><a href="/managerCEP/contact/list.html">Contacts<span
							style="font-size: 16px;"
							class="pull-right hidden-xs showopacity glyphicon glyphicon-user"></span></a></li>

					<li><a href="https://apps.cep.ch/share" target=blank>
							Revues Alfresco<span style="font-size: 16px;"
							class="pull-right hidden-xs showopacity glyphicon glyphicon-book"></span>
					</a></li>
					<li><a href="https://apps.cep.ch/share" target=blank>
							Evénements Alfresco<span style="font-size: 16px;"
							class="pull-right hidden-xs showopacity glyphicon glyphicon-globe"></span>
					</a></li>
					<!--li><a href="/managerCEP/membermob/list.html"> Membres
							Mobile<span style="font-size: 16px;"
							class="pull-right hidden-xs showopacity glyphicon glyphicon-phone"></span>
					</a></li-->
					<li><a href="https://apps.cep.ch/cep/membres.php" target=blank> Membres
							Mobile<span style="font-size: 16px;"
							class="pull-right hidden-xs showopacity glyphicon glyphicon-phone"></span>
					</a></li>
					<li><a href="https://apps.cep.ch/cep/entreprises.php" target=blank>Club-Entreprises Mobile<span
							style="font-size: 16px;"
							class="pull-right hidden-xs showopacity glyphicon glyphicon-heart"></span></a></li>
					<li><a href="https://apps.cep.ch/cep/notif.php" target=blank>
							Notifications Mobile<span style="font-size: 16px;"
							class="pull-right hidden-xs showopacity glyphicon glyphicon-cloud-upload"></span>
					</a></li>
					<li><a href="/managerCEP/usercep/list.html"> Utilisateurs<span
							style="font-size: 16px;"
							class="pull-right hidden-xs showopacity glyphicon glyphicon-cog"></span>
					</a></li>
					<li><a href="/managerCEP/category/list.html"> Catégories<span
							style="font-size: 16px;"
							class="pull-right hidden-xs showopacity glyphicon glyphicon-cog"></span>
					</a></li>
					<li><a href="/managerCEP/salutation/list.html"> Politesses<span
							style="font-size: 16px;"
							class="pull-right hidden-xs showopacity glyphicon glyphicon-cog"></span>
					</a></li>
					<!--li class="disabled"><a href="#">Logs<span
							style="font-size: 16px;"
							class="pull-right hidden-xs showopacity glyphicon glyphicon glyphicon-eye-open"></span></a></li-->
					<!--li><a href="http://www.azlyrics.com/lyrics/beatles/help.html"
						target=_blank>Help<span style="font-size: 16px;"
							class="pull-right hidden-xs showopacity glyphicon glyphicon glyphicon-exclamation-sign"></span></a></li-->
					<li><a href="<c:url value="/logout" />">Logout<span
							style="font-size: 16px;"
							class="pull-right hidden-xs showopacity glyphicon glyphicon-log-out"></span></a></li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="main">
	<p>Session utilisateur <b>${pageContext.request.userPrincipal.name}</b></p>
		<h4>Liste des Contacts</h4>
		<br />
		<c:if test="${not empty message}">
			<div class="alert alert-success">${message}</div>
		</c:if>
		<!--Add Contact + Export to Excel (XSLX)-->
		<div>
			<p class="h6, col-md-9">
			<a href="<c:url value='/'/>" class="btn btn-info custom-width">Home</a>
				<a href="${pageContext.request.contextPath}/contact/add.html"><strong>+
						Contact</strong></a>
			</p>
			<p align="right">
			<a href="<c:url value='/export-contacts-xls'/>" class="btn btn-warning">Excel</a>
			</p>
		</div>
		<!--Contact List-->
		<table id="data" class="table table-striped table-hover">
			<thead class="thead-inverse">
				<!--tr class="info"-->
				<tr bgcolor="#00bfff">
					<th><p class="h6">
							<strong>Nom</strong>
						</p></th>
					<th><p class="h6">
							<strong>Prénom</strong>
						</p></th>
					<th><p class="h6">
							<strong>Entreprise Associée</strong>
						</p></th>
					<th><p class="h6">
							<strong>Adresse</strong>
						</p></th>
					<th><p class="h6">
							<strong>CP</strong>
						</p></th>
					<th><p class="h6">
							<strong>Localité</strong>
						</p></th>
					<th><p class="h6">
							<strong>Téléphone</strong>
						</p></th>
					<th><p class="h6">
							<strong>Email</strong>
						</p></th>
					<th><p class="h6">
							<strong>Date enregistrement</strong>
						</p></th>
					<th><p class="h6" align="center">
							<strong>Actions</strong>
						</p></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="contact" items="${contacts}">
					<c:if test="${contact.contactIsActive==true}">
						<tr>
							<!--tr class="info"-->
							<td><p class="h6">${contact.contactLastName}</p></td>
							<td><p class="h6">${contact.contactFirstName}</p></td>
							<c:forEach items="${categories4ContactsList}" var="category">
								<c:if test="${contact.contactCompanyName==category.key && category.value=='Club-Entreprises'}">
									<td><p class="h6"><font color="red">${contact.contactCompanyName}</font></p></td>
								</c:if>
								<c:if test="${contact.contactCompanyName==category.key && category.value!='Club-Entreprises'}">
									<td><p class="h6"><font color="blue">${contact.contactCompanyName}</font></p></td>
								</c:if>
							</c:forEach>
							<!--td><p class="h6">${contact.contactCompanyName}</p></td-->
							<td><p class="h6">${contact.contactStreet}</p></td>
							<td><p class="h6">${contact.contactPostCode}</p></td>
							<td><p class="h6">${contact.contactCity}</p></td>
							<td><p class="h6">${contact.contactPhoneNumber}</p></td>
							<td><p class="h6">${contact.contactEmail}</p></td>
							<td><p class="h6">
									<fmt:formatDate value="${contact.contactInsertionTimestamp}"
										var="formattedInsertionDate" type="date"
										pattern="dd.MM.yyyy - HH:mm:ss" />${formattedInsertionDate}</p></td>							
							<td><p class="h6" align="center">
								<table>
									<tr>
										<td><p class="h6, col-md-3, info">
												<a
													href="${pageContext.request.contextPath}/contact/view/${contact.id_contact}.html"
													data-toggle="tooltip" title="Détail"
													class="glyphicon glyphicon-eye-open"></a>
											</p></td>
										<td><p class="h6, col-md-3, info">
												<a
													href="${pageContext.request.contextPath}/contact/edit/${contact.id_contact}.html"
													title="Edition" class="glyphicon glyphicon-edit"></a>
											</p></td>
										<td><p class="h6, col-md-3, info">
												<a
													href="${pageContext.request.contextPath}/contact/delete/${contact.id_contact}.html"
													title="Suppression" class="glyphicon glyphicon-trash" onclick="return confirm('Etes-vous sûr de vouloir désactiver/effacer ce contact?')"></a>
											</p></td>
									</tr>
								</table>
						</tr>
					</c:if>
				</c:forEach>
			</tbody>
		</table>
		<table>
			<tr>
				<td><p class="h6">
						<a href="<c:url value='/'/>" class="btn btn-info custom-width">Home</a>
					</p></td>
			</tr>
		</table>
	</div>
</body>
<script>
	$(document).ready(function() {
		$('#data').dataTable();
	});
</script>
</html>