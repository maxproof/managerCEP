<%@ include file="header.jsp"%>
<script type="text/javascript">
	jQuery(document).ready(function($) {

		if (window.history && window.history.pushState) {

			window.history.pushState('forward', null, null);

			$(window).on('popstate', function() {
				window.location.href = "/managerCEP/category/list.html";
			});

		}
	});
</script>
<div class="main">
	<p>
		Session utilisateur <b>${pageContext.request.userPrincipal.name}</b>
	</p>
	<h4>Liste des Catégories pour les Entreprises</h4>
	<br />
	<c:if test="${not empty message}">
		<div class="alert alert-success">${message}</div>
	</c:if>
	<!--Add Category-->
	<div class="row">
		<div class="col-md-8">
			<div>
				<p class="h6, col-md-3">
					<a href="<c:url value='/'/>" class="btn btn-info custom-width">Home</a>
					<a href="${pageContext.request.contextPath}/category/add.html"><strong>+
							Catégorie</strong></a>
				</p>
			</div>
			<!--Categories List-->
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
					<c:forEach var="category" items="${categories}">
						<c:if test="${category.categoryIsActive==true}">
							<tr class="info">
								<td><p class="h6">${category.categoryName}</p></td>
								<td><p class="h6">${category.categoryComments}</p></td>
								<td><p class="h6">
										<fmt:formatDate value="${category.categoryInsertionTimestamp}"
											var="formattedInsertionDate" type="date"
											pattern="dd.MM.yyyy - HH:mm" />${formattedInsertionDate}</p></td>
								<td><p class="h6">
										<fmt:formatDate
											value="${category.categoryModificationTimestamp}"
											var="formattedModificationDate" type="date"
											pattern="dd.MM.yyyy - HH:mm" />${formattedModificationDate}</p></td>
								<td><p class="h6" align="center">
									<table>
										<tr>
											<td><p class="h6, col-md-3">
													<!--a
														href="${pageContext.request.contextPath}category/view/${category.id_category}.html"
														title="Détail" class="glyphicon glyphicon-eye-open"></a-->
												</p></td>
											<td><p class="h6, col-md-3">
													<a
														href="${pageContext.request.contextPath}/category/edit/${category.id_category}.html"
														title="Edition" class="glyphicon glyphicon-edit"></a>
												</p></td>
											<td><p class="h6, col-md-3">
													<c:if
														test="${pageContext.request.userPrincipal.name=='superadmin2m'}">
														<a
															href="${pageContext.request.contextPath}/category/delete/${category.id_category}.html"
															title="Suppression" class="glyphicon glyphicon-trash"
															onclick="return confirm('Etes-vous sûr de vouloir effacer cette catégorie?')"></a>
													</c:if>
												</p></td>
										</tr>
									</table>
							</tr>
						</c:if>
					</c:forEach>
				</tbody>
			</table>
			<!--ul class="pager">
				<li><a href="#">Précédents</a></li>
				<li><a href="#">Suivants</a></li>
			</ul-->
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
<%@ include file="footer.jsp"%>