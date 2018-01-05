<%@ include file="header.jsp"%>
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
<div class="main">
<p>Session utilisateur <b>${pageContext.request.userPrincipal.name}</b></p>
	<h4>Détails Contact Sélectionné</h4>
	<p>${message}</p>
	<br />
	<form:form method="POST" commandName="contact"
		action="${pageContext.request.contextPath}/contact/view/${contact.id_contact}.html">
		<div class="row">
			<div class="col-md-4">
				<table id="view" class="table table-bordered table-hover">
					<tbody>
						<tr class="success">
							<td><p class="h6">
									<strong>ID</strong>
								</p></td>
							<td><p class="h6">${contact.id_contact}</p></td>
						</tr>
						<tr class="success">
							<td><p class="h6">
									<strong>Entreprise Associée</strong>
								</p></td>
							<td><p class="h6">${contact.contactCompanyName}</p></td>
						</tr>
						<tr class="success">
							<td><p class="h6">
									<strong>Nom</strong>
								</p></td>
							<td><p class="h6">${contact.contactLastName}</p></td>
						</tr>
						<tr class="success">
							<td><p class="h6">
									<strong>Prénom</strong>
								</p></td>
							<td><p class="h6">${contact.contactFirstName}</p></td>
						</tr>
						<tr class="success">
							<td><p class="h6">
									<strong>Formule de Politesse</strong>
								</p></td>
							<c:forEach items="${contactSalutationsList}" var="salutation">
								<c:if test="${contact.salutations==salutation.key}">
									<td><p class="h6">${salutation.value}</p></td>
								</c:if>
							</c:forEach>
						</tr>
						<tr class="success">
							<td><p class="h6">
									<strong>Adresse</strong>
								</p></td>
							<td><p class="h6">${contact.contactStreet}</p></td>
						</tr>
						<tr class="success">
							<td><p class="h6">
									<strong>CP</strong>
								</p></td>
							<td><p class="h6">${contact.contactPostCode}</p></td>
						</tr>
						<tr class="success">
							<td><p class="h6">
									<strong>Localité</strong>
								</p></td>
							<td><p class="h6">${contact.contactCity}</p></td>
						</tr>
						<tr class="success">
							<td><p class="h6">
									<strong>Téléphone</strong>
								</p></td>
							<td><p class="h6">${contact.contactPhoneNumber}</p></td>
						</tr>
						<tr class="success">
							<td><p class="h6">
									<strong>Téléphone 2</strong>
								</p></td>
							<td><p class="h6">${contact.contactMobileNumber}</p></td>
						</tr>
						<tr class="success">
							<td><p class="h6">
									<strong>Email</strong>
								</p></td>
							<td><p class="h6">${contact.contactEmail}</p></td>
						</tr>
						<tr class="success">
							<td><p class="h6">
									<strong>Email 2</strong>
								</p></td>
							<td><p class="h6">${contact.contactEmail2}</p></td>
						</tr>
						<tr class="success">
							<td><p class="h6">
									<strong>Commentaires</strong>
								</p></td>
							<td><p class="h6">${contact.comments}</p></td>
						</tr>
						<tr class="danger">
							<td><p class="h6">
									<strong>Facturation</strong>
								</p></td>
							<td><p class="h6">${contact.billing}</p></td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="col-md-4 col-md-offset-1">
				<table id="view" class="table table-bordered table-hover">
					<tr class="info">
						<td><p class="h6">
								<strong>Envoi Revue</strong>
							</p></td>
						<td><p class="h6">${contact.sendMagazine}</p></td>
					</tr>
					<tr class="info">
						<td><p class="h6">
								<strong>Envoi Invitations</strong>
							</p></td>
						<td><p class="h6">${contact.sendInvitation}</p></td>
					</tr>
					<tr class="info">
						<td><p class="h6">
								<strong>Invitation Club</strong>
							</p></td>
						<td><p class="h6">${contact.sendClubInvitation}</p></td>
					</tr>
					<tr class="info">
						<td><p class="h6">
								<strong>Microtechnique</strong>
							</p></td>
						<td><p class="h6">${contact.microtechnics}</p></td>
					</tr>
					<tr class="info">
						<td><p class="h6">
								<strong>Pub. Revue</strong>
							</p></td>
						<td><p class="h6">${contact.magazinePublication}</p></td>
					</tr>
					<tr class="info">
						<td><p class="h6">
								<strong>Conseil de Direction</strong>
							</p></td>
						<td><p class="h6">${contact.executiveBoard}</p></td>
					</tr>
					<tr class="info">
						<td><p class="h6">
								<strong>Comm. Strategie</strong>
							</p></td>
						<td><p class="h6">${contact.strategyBoard}</p></td>
					</tr>
					<tr class="info">
						<td><p class="h6">
								<strong>Comm. Services</strong>
							</p></td>
						<td><p class="h6">${contact.servicesBoard}</p></td>
					</tr>
					<tr class="info">
						<td><p class="h6">
								<strong>Comm. Formation</strong>
							</p></td>
						<td><p class="h6">${contact.trainingBoard}</p></td>
					</tr>
					<tr class="info">
						<td><p class="h6">
								<strong>Comm. Coaching</strong>
							</p></td>
						<td><p class="h6">${contact.coachingBoard}</p></td>
					</tr>
					<tr class="info">
						<td><p class="h6">
								<strong>Comm. Industrie</strong>
							</p></td>
						<td><p class="h6">${contact.industryBoard}</p></td>
					</tr>
					<tr class="info">
						<td><p class="h6">
								<strong>Comm. Infrastruct.</strong>
							</p></td>
						<td><p class="h6">${contact.facilitiesBoard}</p></td>
					</tr>
					<tr class="info">
						<td><p class="h6">
								<strong>Comm. Club-Entrep.</strong>
							</p></td>
						<td><p class="h6">${contact.clubCompaniesBoard}</p></td>
					</tr>
					<tbody>
				</table>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4">
				<table id="view" class="table table-bordered table-hover">
					<tbody>
						<tr class="warning">
							<td><p class="h6">
									<strong>Date Enregistrement</strong>
								</p></td>
							<td><p class="h6">
									<fmt:formatDate value="${contact.contactInsertionTimestamp}"
										var="formattedInsertionDate" type="date"
										pattern="dd.MM.yyyy - HH:mm:ss" />${formattedInsertionDate}</p></td>
						</tr>
						<c:if test="${contact.contactModificationTimestamp!=null}">
							<tr class="warning">
								<td><p class="h6">
										<strong>Date Dernière Modification&nbsp;&nbsp;</strong>
									</p></td>
								<td><p class="h6">
										<fmt:formatDate
											value="${contact.contactModificationTimestamp}"
											var="formattedModificationDate" type="date"
											pattern="dd.MM.yyyy - HH:mm:ss" />${formattedModificationDate}</p></td>
							</tr>
						</c:if>
					</tbody>
				</table>
			</div>
		</div>
	</form:form>
	<div class="row">
		<div class="col-md-4">
			<table>
				<tr>
					<td><p class="h6">
							<a href="<c:url value='/contact/list'/>" class="btn btn-success custom-width">Retour</a>
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