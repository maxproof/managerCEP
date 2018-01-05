<%@ include file="header.jsp"%>
<script  type="text/javascript">
jQuery(document).ready(function($) {

	if (window.history && window.history.pushState) {

	window.history.pushState('forward', null, null);

	$(window).on('popstate', function() {
	window.location.href = "/managerCEP/membermob/list.html";
	});

	}
	});
</script>
<div class="main">
<p>Session utilisateur <b>${pageContext.request.userPrincipal.name}</b></p>
	<h4>Détails Membre Mobile Sélectionné</h4>
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
						<td class="col-md-6"><p class="h6">${memberMob.id_memberMob}</p></td>
					</tr>
					<tr class="success">
						<td class="col-md-2"><p class="h6">
								<strong>Nom</strong>
							</p></td>
						<td class="col-md-6"><p class="h6">${memberMob.memberMobLastName}</p></td>
					</tr>
					<tr class="success">
						<td class="col-md-2"><p class="h6">
								<strong>Prénom</strong>
							</p></td>
						<td class="col-md-6"><p class="h6">${memberMob.memberMobFirstName}</p></td>
					</tr>
					<tr class="success">
						<td class="col-md-2"><p class="h6">
								<strong>Entreprise</strong>
							</p></td>
						<td class="col-md-6"><p class="h6">${memberMob.memberMobCompany}</p></td>
					</tr>
					<tr class="success">
						<td class="col-md-2"><p class="h6">
								<strong>Email</strong>
							</p></td>
						<td class="col-md-6"><p class="h6">${memberMob.memberMobEmail}</p></td>
					</tr>
					<tr class="success">
						<td class="col-md-2"><p class="h6">
								<strong>Password</strong>
							</p></td>
						<td class="col-md-6"><p class="h6">${memberMob.memberMobPassword}</p></td>
					</tr>
					<tr class="success">
						<td class="col-md-2"><p class="h6">
								<strong>Identifiant</strong>
							</p></td>
						<td class="col-md-6"><p class="h6">${memberMob.memberMobIdentifier}</p></td>
					</tr>
					<tr class="success">
						<td class="col-md-2"><p class="h6">
								<strong>Commentaires</strong>
							</p></td>
						<td class="col-md-6"><p class="h6">${memberMob.memberMobComments}</p></td>
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
					<td class="col-md-6"><p class="h6"><fmt:formatDate value="${memberMob.dateMemberMobIdentification}"
											var="formattedIdentificationDate" type="date"
											pattern="dd.MM.yyyy - HH:mm:ss" />${formattedIdentificationDate}</p></td>
				</tr>
				<c:if test="${memberMob.dateMemberMobModification!=null}">
					<tr class="warning">
						<td class="col-md-2"><p class="h6">
								<strong>Date Dernière Modification&nbsp;&nbsp;</strong>
							</p></td>
						<td class="col-md-6"><p class="h6"><fmt:formatDate value="${memberMob.dateMemberMobModification}"
										var="formattedModificationDate" type="date"
										pattern="dd.MM.yyyy - HH:mm:ss" />${formattedModificationDate}</p></td>
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
							<a href="<c:url value='/membermob/list'/>" class="btn btn-success custom-width">Retour</a>
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