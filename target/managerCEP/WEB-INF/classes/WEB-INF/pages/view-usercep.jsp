<%@ include file="header.jsp"%>
<script type="text/javascript">
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
	<p>
		Session utilisateur <b>${pageContext.request.userPrincipal.name}</b>
	</p>
	<h4>Détails Utilisateur Sélectionné</h4>
	<p>${message}</p>
	<br />
	<div class="row">
		<div class="col-md-8">
			<table id="view" class="table table-bordered table-hover">
				<tbody>
					<tr class="success">
						<td class="col-md-2"><p class="h6">
								<strong>ID</strong>
							</p></td>
						<td class="col-md-6"><p class="h6">${userCep.userCep_id}</p></td>
					</tr>
					<tr class="success">
						<td class="col-md-2"><p class="h6">
								<strong>Nom</strong>
							</p></td>
						<td class="col-md-6"><p class="h6">${userCep.userCepLastName}</p></td>
					</tr>
					<tr class="success">
						<td class="col-md-2"><p class="h6">
								<strong>Prénom</strong>
							</p></td>
						<td class="col-md-6"><p class="h6">${userCep.userCepFirstName}</p></td>
					</tr>
					<tr class="success">
						<td class="col-md-2"><p class="h6">
								<strong>Rôle</strong>
							</p></td>
						<td class="col-md-6"><p class="h6">ADMIN</p></td>
					</tr>
					<tr class="success">
						<td class="col-md-2"><p class="h6">
								<strong>Login (User Name)</strong>
							</p></td>
						<td class="col-md-6"><p class="h6">${userCep.userCepLogin}</p></td>
					</tr>
					<tr class="success">
						<td class="col-md-2"><p class="h6">
								<strong>Email</strong>
							</p></td>
						<td class="col-md-6"><p class="h6">${userCep.userCepEmail}</p></td>
					</tr>
					<c:if test="${userCep.userCepIsActive==true}">
						<tr class="success">
							<td class="col-md-2"><p class="h6">
									<strong>Password</strong>
								</p></td>
							<td class="col-md-6"><p class="h6">${userCep.userCepPassword}</p></td>
						</tr>
					</c:if>
					<tr class="success">
						<td class="col-md-2"><p class="h6">
								<strong>Commentaires</strong>
							</p></td>
						<td class="col-md-6"><p class="h6">${userCep.userCepComments}</p></td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
	<div class="row">
		<div class="col-md-8">
			<table id="view" class="table table-bordered table-hover">
				<tr class="warning">
					<td class="col-md-2"><p class="h6">
							<strong>Date Enregistrement</strong>
						</p></td>
					<td class="col-md-6"><p class="h6">
							<fmt:formatDate value="${userCep.userCepInsertionTimestamp}"
								var="formattedInsertionDate" type="date"
								pattern="dd.MM.yyyy - HH:mm:ss" />${formattedInsertionDate}</p></td>
				</tr>
				<c:if test="${userCep.userCepModificationTimestamp!=null}">
					<tr class="warning">
						<td class="col-md-2"><p class="h6">
								<strong>Date Dernière Modification&nbsp;&nbsp;</strong>
							</p></td>
						<td class="col-md-6"><p class="h6">
								<fmt:formatDate value="${userCep.userCepModificationTimestamp}"
									var="formattedModificationDate" type="date"
									pattern="dd.MM.yyyy - HH:mm:ss" />${formattedModificationDate}</p></td>
					</tr>
				</c:if>
				<c:if test="${userCep.userCepDeletionTimestamp!=null}">
					<tr class="danger">
						<td class="col-md-2"><p class="h6">
								<strong>Date Désactivation&nbsp;&nbsp;</strong>
							</p></td>
						<td class="col-md-6"><p class="h6">
								<fmt:formatDate value="${userCep.userCepDeletionTimestamp}"
									var="formattedDeletionDate" type="date"
									pattern="dd.MM.yyyy - HH:mm:ss" />${formattedDeletionDate}</p></td>
					</tr>
				</c:if>
				</tbody>
			</table>
		</div>
	</div>
	<div class="row">
		<div class="col-md-8">
			<table>
				<tr>
					<td><p class="h6">
							<a href="<c:url value='/usercep/list'/>"
								class="btn btn-success custom-width">Retour</a>
						</p></td>
					<td>&nbsp;&nbsp;</td>
					<td><p class="h6">
							<a href="<c:url value='/'/>" class="btn btn-info custom-width">Home</a>
						</p></td>
				</tr>
			</table>
		</div>
	</div>
</div>
<%@ include file="footer.jsp"%>