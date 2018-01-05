<%@ include file="header.jsp"%>
<script  type="text/javascript">
jQuery(document).ready(function($) {

	if (window.history && window.history.pushState) {

	window.history.pushState('forward', null, null);

	$(window).on('popstate', function() {
	window.location.href = "/managerCEP/usercep/list.html";
	});

	}
	});
</script>
<div class="main">
<p>Session utilisateur <b>${pageContext.request.userPrincipal.name}</b></p>
	<h4>Liste des Utilisateurs</h4>
	<br />
	<c:if test="${not empty message}">
		<div class="alert alert-success">${message}</div>
	</c:if>
	<!--Add User-->
	<div class="row">
		<div class="col-md-12">
			<div>
				<p class="h6, col-md-9">
					<a href="<c:url value='/'/>" class="btn btn-info custom-width">Home</a>
					<a href="${pageContext.request.contextPath}/usercep/add.html"><strong>+
							Utilisateur</strong></a>
				</p>
			</div>
			<!--Users List-->
			<table id="data" class="table table-striped table-hover">
				<thead>
					<tr>
						<th><p class="h6">
								<strong>Prénom</strong>
							</p></th>
						<th><p class="h6">
								<strong>Nom</strong>
							</p></th>
						<th><p class="h6">
								<strong>Login <br/>(User Name)</strong>
							</p></th>
						<th><p class="h6">
								<strong>Email</strong>
							</p></th>
						<th><p class="h6">
								<strong>Rôle</strong>
							</p></th>
						<!--th><p class="h6">
								<strong>Commentaires</strong>
							</p></th-->
						<th><p class="h6">
								<strong>Date Enregistrement</strong>
							</p></th>
						<th><p class="h6">
								<strong>Dernière Modification</strong>
							</p></th>
						<th><p class="h6">
								<strong>Date Désactivation</strong>
							</p></th>
						<th><p class="h6" align="center">
								<strong>Actions</strong>
							</p></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="userCep" items="${usersCep}">
						<c:if test="${userCep.userCepLogin!='superadmin2m'}">
							<tr class="info">
								<td><p class="h6">${userCep.userCepFirstName}</p></td>
								<td><p class="h6">${userCep.userCepLastName}</p></td>
								<td><p class="h6">${userCep.userCepLogin}</p></td>
								<td><p class="h6">${userCep.userCepEmail}</p></td>
								<td><p class="h6">ADMIN</p></td>
								<!--td><p class="h6">${userCep.userCepComments}</p></td-->
								<td><p class="h6">
										<fmt:formatDate value="${userCep.userCepInsertionTimestamp}"
											var="formattedInsertionDate" type="date"
											pattern="dd.MM.yyyy - HH:mm" />${formattedInsertionDate}</p></td>
								<td><p class="h6">
										<fmt:formatDate
											value="${userCep.userCepModificationTimestamp}"
											var="formattedModificationDate" type="date"
											pattern="dd.MM.yyyy - HH:mm" />${formattedModificationDate}</p></td>
								<c:if test="${userCep.userCepIsActive==true}">
									<td><p class="h6">
											<fmt:formatDate value="${userCep.userCepDeletionTimestamp}"
												var="formattedModificationDate" type="date"
												pattern="dd.MM.yyyy - HH:mm" />${formattedModificationDate}</p></td>
								</c:if>
								<c:if test="${userCep.userCepIsActive==false}">
									<td class="danger"><p class="h6">
											<fmt:formatDate value="${userCep.userCepDeletionTimestamp}"
												var="formattedDeletionDate" type="date"
												pattern="dd.MM.yyyy - HH:mm" />${formattedDeletionDate}</p></td>
								</c:if>
								<td><p class="h6" align="center">
									<table>
										<tr>
											<td><p class="h6, col-md-3">
													<a
														href="${pageContext.request.contextPath}/usercep/view/${userCep.userCep_id}.html"
														data-toggle="tooltip" title="Détail"
														class="glyphicon glyphicon-eye-open"></a>
												</p></td>
											<c:if test="${userCep.userCepIsActive==true}">
												<td><p class="h6, col-md-3">
														<a
															href="${pageContext.request.contextPath}/usercep/edit/${userCep.userCep_id}.html"
															title="Edition" class="glyphicon glyphicon-edit"></a>
													</p></td>
											</c:if>
											<c:if test="${userCep.userCepIsActive==false}">
												<td><p class="h6, col-md-3">
														<span class="glyphicon glyphicon-remove"
															style="color: #4680b9"></span>
													</p></td>
											</c:if>
											<c:if test="${userCep.userCepIsActive==true}">
											<td><p class="h6, col-md-3">
													<a
														href="${pageContext.request.contextPath}/usercep/delete/${userCep.userCep_id}.html"
														title="Suppression" class="glyphicon glyphicon-trash" onclick="return confirm('Etes-vous sûr de vouloir désactiver/effacer cet utilisateur?')"></a>
												</p></td>
											</c:if>
											<c:if test="${userCep.userCepIsActive==false}">
												<td><p class="h6, col-md-3">
														<span class="glyphicon glyphicon-remove"
															style="color: #4680b9"></span>
													</p></td>
											</c:if>
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
	</div>
</div>
<script>
	function myFunction() {
		confirm("Désirez-vous réellement supprimer cet utilisateur?");
	}
</script>
<%@ include file="footer.jsp"%>