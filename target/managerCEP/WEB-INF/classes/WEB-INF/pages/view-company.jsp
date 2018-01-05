<%@ include file="header.jsp"%>
<script  type="text/javascript">
jQuery(document).ready(function($) {

	if (window.history && window.history.pushState) {

	window.history.pushState('forward', null, null);

	$(window).on('popstate', function() {
	window.location.href = "/managerCEP/company/list.html";
	});

	}
	});
</script>
<div class="main">
<p>Session utilisateur <b>${pageContext.request.userPrincipal.name}</b></p>
	<h4>Détails Entreprise Sélectionnée</h4>
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
						<td class="col-md-6"><p class="h6">${company.id_company}</p></td>
					</tr>
					<tr class="success">
						<td class="col-md-2"><p class="h6">
								<strong>Catégorie</strong>
							</p></td>
						<c:forEach items="${companiesListCategoriesList}" var="category">
							<c:if test="${company.companyCategory==category.key}">
							<c:if test="${category.value=='Club-Entreprises'}">
								<td class="col-md-6"><p class="h6"><font color="red">${category.value}</font></p></td>
							</c:if>
							<c:if test="${category.value!='Club-Entreprises'}">
								<td class="col-md-6"><p class="h6"><font color="blue">${category.value}</font></p></td>
							</c:if>
							</c:if>
						</c:forEach>
					</tr>
					<tr class="success">
						<td class="col-md-2"><p class="h6">
								<strong>Nom Entreprise</strong>
							</p></td>
						<td class="col-md-6"><p class="h6">${company.companyName} &nbsp;&nbsp; <img src="${logoB64}" style="max-width: 50px; max-height: 50px;"/></p></td>
					</tr>
					<tr class="success">
						<td class="col-md-2"><p class="h6">
								<strong>Adresse</strong>
							</p></td>
						<td class="col-md-6"><p class="h6">${company.companyStreet}</p></td>
					</tr>
					<tr class="success">
						<td class="col-md-2"><p class="h6">
								<strong>CP</strong>
							</p></td>
						<td class="col-md-6"><p class="h6">${company.companyPostCode}</p></td>
					</tr>
					<tr class="success">
						<td class="col-md-2"><p class="h6">
								<strong>Localité</strong>
							</p></td>
						<td class="col-md-6"><p class="h6">${company.companyCity}</p></td>
					</tr>
					<tr class="success">
						<td class="col-md-2"><p class="h6">
								<strong>Téléphone</strong>
							</p></td>
						<td class="col-md-6"><p class="h6">${company.companyPhoneNumber}</p></td>
					</tr>
					<tr class="success">
						<td class="col-md-2"><p class="h6">
								<strong>Téléphone 2</strong>
							</p></td>
						<td class="col-md-6"><p class="h6">${company.companyMobileNumber}</p></td>
					</tr>
					<tr class="success">
						<td class="col-md-2"><p class="h6">
								<strong>Email</strong>
							</p></td>
						<td class="col-md-6"><p class="h6">${company.companyEmail}</p></td>
					</tr>
					<tr class="success">
						<td class="col-md-2"><p class="h6">
								<strong>Email 2</strong>
							</p></td>
						<td class="col-md-6"><p class="h6">${company.companyEmail2}</p></td>
					</tr>
					<tr class="success">
						<td class="col-md-2"><p class="h6">
								<strong>Site web</strong>
							</p></td>
						<td class="col-md-6"><p class="h6"><a href="${company.companyWebsite}" target="_blank">${company.companyWebsite}</a></p></td>
					</tr>
					<tr class="success">
						<td class="col-md-2"><p class="h6">
								<strong>Commentaires</strong>
							</p></td>
						<td class="col-md-6"><p class="h6">${company.companyComments}</p></td>
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
							<fmt:formatDate value="${company.companyInsertionTimestamp}"
								var="formattedInsertionDate" type="date"
								pattern="dd.MM.yyyy - HH:mm:ss" />${formattedInsertionDate}</p></td>
				</tr>
				<c:if test="${company.companyModificationTimestamp!=null}">
					<tr class="warning">
						<td class="col-md-2"><p class="h6">
								<strong>Date Dernière Modification&nbsp;&nbsp;</strong>
							</p></td>
						<td class="col-md-6"><p class="h6">
								<fmt:formatDate value="${company.companyModificationTimestamp}"
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
							<a href="<c:url value='/company/list'/>" class="btn btn-success custom-width">Retour</a>
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