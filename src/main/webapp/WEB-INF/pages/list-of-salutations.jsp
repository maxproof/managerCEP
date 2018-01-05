<%@ include file="header.jsp"%>
<script type="text/javascript">
	jQuery(document).ready(function($) {

		if (window.history && window.history.pushState) {

			window.history.pushState('forward', null, null);

			$(window).on('popstate', function() {
				window.location.href = "/managerCEP/salutation/list.html";
			});

		}
	});
</script>
<div class="main">
	<p>
		Session utilisateur <b>${pageContext.request.userPrincipal.name}</b>
	</p>
	<h4>Liste des Formules de Politesse pour les Contacts</h4>
	<br />
	<c:if test="${not empty message}">
		<div class="alert alert-success">${message}</div>
	</c:if>
	<!--Add Salutation-->
	<div class="row">
		<div class="col-md-9">
			<div>
				<p class="h6, col-md-6">
					<a href="<c:url value='/'/>" class="btn btn-info custom-width">Home</a>
					<a href="${pageContext.request.contextPath}/salutation/add.html"><strong>+
							Formule de Politesse</strong></a>
				</p>
			</div>
			<!--Salutations List-->
			<table id="data" class="table table-striped table-hover">
				<thead>
					<tr>
						<th><p class="h6">
								<strong>Dénomination</strong>
							</p></th>
						<th><p class="h6">
								<strong>Commentaires</strong>
							</p></th>
						<th><p class="h6">
								<strong>Date Enregistrement</strong>
							</p></th>
						<th><p class="h6">
								<strong>Date Dernière Modification</strong>
							</p></th>
						<th><p class="h6" align="center">
								<strong>Action</strong>
							</p></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="salutation" items="${salutations}">
						<c:if test="${salutation.salutationIsActive==true}">
							<tr class="info">
								<td><p class="h6">${salutation.salutationName}</p></td>
								<td><p class="h6">${salutation.salutationComments}</p></td>
								<td><p class="h6">
										<fmt:formatDate
											value="${salutation.salutationInsertionTimestamp}"
											var="formattedInsertionDate" type="date"
											pattern="dd.MM.yyyy - HH:mm" />${formattedInsertionDate}</p></td>
								<td><p class="h6">
										<fmt:formatDate
											value="${salutation.salutationModificationTimestamp}"
											var="formattedModificationDate" type="date"
											pattern="dd.MM.yyyy - HH:mm" />${formattedModificationDate}</p></td>
								<td><p class="h6" align="center">
									<table>
										<tr>
											<td><p class="h6, col-md-3">
													<!--a
														href="${pageContext.request.contextPath}/salutation/view/${salutation.id_salutation}.html"
														title="Détail" class="glyphicon glyphicon-eye-open"></a-->
												</p></td>
											<td><p class="h6, col-md-3">
													<a
														href="${pageContext.request.contextPath}/salutation/edit/${salutation.id_salutation}.html"
														title="Edition" class="glyphicon glyphicon-edit"></a>
												</p></td>
											<td><p class="h6, col-md-3">
													<c:if
														test="${pageContext.request.userPrincipal.name=='superadmin2m'}">
														<a
															href="${pageContext.request.contextPath}/salutation/delete/${salutation.id_salutation}.html"
															title="Suppression" class="glyphicon glyphicon-trash"
															onclick="return confirm('Etes-vous sûr de vouloir effacer cette formule de politesse?')"></a>
													</c:if>
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
	</div>
</div>
<script>
	function myFunction() {
		confirm("Désirez-vous réellement supprimer cette formule de politesse?");
	}
</script>
<%@ include file="footer.jsp"%>