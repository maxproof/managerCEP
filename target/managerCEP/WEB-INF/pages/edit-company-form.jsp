<%@ include file="header.jsp"%>
<script type="text/javascript">
	jQuery(document).ready(function($) {

		if (window.history && window.history.pushState) {

			window.history.pushState('forward', null, null);

			$(window).on('popstate', function() {
				window.location.href = "/managerCEP/company/list.html";
			});
		}
	});
</script>
<script type="text/javascript">
   	window.onload = function() {
   	var buttonSubmit = document.getElementById('submit'); 
   	var buttonCancel = document.getElementById('cancel');
   	function setGlobal() {
		window.onbeforeunload = null;
    }
    $(buttonSubmit).click(setGlobal);
    $(buttonCancel).click(setGlobal);
    //$('a').click(function() {
        //window.onbeforeunload = null;
    //});
    window.onbeforeunload = function() {
    	return 'Etes-vous sûr de vouloir quitter cette page?';
    };             
    };   
 </script>
<script type="text/javascript">
	function checkFormLogo(form) {
		var select = document.getElementById('categorySelect');
		var selectedCategory = select.options[select.selectedIndex].innerText;
		if (selectedCategory == "Club-Entreprises") {
			if (document.getElementById('displayValueWrapper').value == '') {
				alert("Uploader un logo!");
				form.logoInput.focus();
				return false;
			}
			if (document.getElementById('displayValueWrapper').value != '') {
			}
		}
		return true;
	}
</script>
<script type="text/javascript">
	function maxlength_textarea(id, crid, max) {
		var txtarea = document.getElementById(id);
		document.getElementById(crid).innerHTML = max - txtarea.value.length;
		txtarea.onkeypress = function() {
			eval('v_maxlength("' + id + '","' + crid + '",' + max + ');')
		};
		txtarea.onblur = function() {
			eval('v_maxlength("' + id + '","' + crid + '",' + max + ');')
		};
		txtarea.onkeyup = function() {
			eval('v_maxlength("' + id + '","' + crid + '",' + max + ');')
		};
		txtarea.onkeydown = function() {
			eval('v_maxlength("' + id + '","' + crid + '",' + max + ');')
		};
	}
	function v_maxlength(id, crid, max) {
		var txtarea = document.getElementById(id);
		var crreste = document.getElementById(crid);
		var len = txtarea.value.length;
		if (len > max) {
			txtarea.value = txtarea.value.substr(0, max);
		}
		len = txtarea.value.length;
		crreste.innerHTML = max - len;
	}
</script>
<div class="main">
	<script type="text/javascript">
		function deleteLogoClick() {
			document.getElementById('logoInput').value = '';
			document.getElementById('logoPreview').src = '';
			document.getElementById('logoPreviewWrapper').style.display = 'none';
			document.getElementById('logoStatus').value = "deleted";
		}

		function logoSelected(event) {
			document.getElementById('logoPreviewWrapper').style.display = 'inline';
			document.getElementById('logoStatus').value = "new";

			var reader = new FileReader();
			reader.onload = function() {
				document.getElementById('logoPreview').src = reader.result;
			};
			reader.readAsDataURL(event.target.files[0]);
		}

		function categoryChange() {
			var select = document.getElementById('categorySelect');
			var selectedCategory = select.options[select.selectedIndex].innerText;

			switch (selectedCategory) {
			case "Club-Entreprises":
				document.getElementById('logoTableRow').style.display = '';
				break;

			default:
				document.getElementById('logoTableRow').style.display = 'none';
			}
		}
	</script>
	<p>
		Session utilisateur <b>${pageContext.request.userPrincipal.name}</b>
	</p>
	<h4>Edition Entreprise Sélectionnée</h4>
	<br />
	<p>${message}</p>
	<form:form method="POST" commandName="company"
		enctype="multipart/form-data"
		action="${pageContext.request.contextPath}/company/edit/${company.id_company}.html"
		onsubmit="return checkFormLogo(this);">
		<div class="row">
			<div class="col-md-5">
				<table>
					<tbody>
						<tr>
							<td><p class="h6">
									<strong>Catégorie *</strong>
								</p></td>
							<td><spring:bind path="companyCategory">
									<p class="h6 ${status.error ? 'has-error' : ''}">
										<form:select id="categorySelect" path="companyCategory"
											class="form-control" onchange="categoryChange();">
											<form:option value="" label="--- Selectionner ---" />
											<form:options items="${companyCategoriesList}" />
										</form:select>
									</p>
									<form:errors path="companyCategory" style='color:red;' />
								</spring:bind></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Nom Entreprise *</strong>
								</p></td>
							<td><spring:bind path="companyName">
									<p class="h6 ${status.error ? 'has-error' : ''}">
										<form:input path="companyName" class="form-control"
											maxlength="50" />
									</p>
									<form:errors path="companyName" style='color:red;' />
								</spring:bind></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Adresse *</strong>
								</p></td>
							<td><spring:bind path="companyStreet">
									<p class="h6 ${status.error ? 'has-error' : ''}">
										<form:input path="companyStreet" class="form-control"
											maxlength="50" />
									</p>
									<form:errors path="companyStreet" style='color:red;' />
								</spring:bind></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>CP *</strong>
								</p></td>
							<td><spring:bind path="companyPostCode">
									<p class="h6 ${status.error ? 'has-error' : ''}">
										<form:input path="companyPostCode" class="form-control"
											maxlength="4" type="text"
											oninput="this.value = this.value.replace(/[^0-9.]/g, ''); this.value = this.value.replace(/(\..*)\./g, '$1');" />
									</p>
									<form:errors path="companyPostCode" style='color:red;' />
								</spring:bind></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Localité *</strong>
								</p></td>
							<td><spring:bind path="companyCity">
									<p class="h6 ${status.error ? 'has-error' : ''}">
										<form:input path="companyCity" class="form-control"
											maxlength="50" />
									</p>
									<form:errors path="companyCity" style='color:red;' />
								</spring:bind></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Téléphone *</strong>
								</p></td>
							<td><spring:bind path="companyPhoneNumber">
									<p class="h6 ${status.error ? 'has-error' : ''}">
										<form:input path="companyPhoneNumber" class="form-control"
											maxlength="10" type="text"
											oninput="this.value = this.value.replace(/[^0-9.]/g, ''); this.value = this.value.replace(/(\..*)\./g, '$1');" />
									</p>
									<form:errors path="companyPhoneNumber" style='color:red;' />
								</spring:bind></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Téléphone 2</strong>
								</p></td>
							<td><spring:bind path="companyMobileNumber">
									<p class="h6 ${status.error ? 'has-error' : ''}">
										<form:input path="companyMobileNumber" class="form-control"
											maxlength="10" pattern=".{10,10}" type="text" pattern=".{10,10}"
											oninput="this.value = this.value.replace(/[^0-9.]/g, ''); this.value = this.value.replace(/(\..*)\./g, '$1');" />
									</p>
									<form:errors path="companyMobileNumber" style='color:red;' />
								</spring:bind></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Email *</strong>
								</p></td>
							<td><spring:bind path="companyEmail">
									<p class="h6 ${status.error ? 'has-error' : ''}">
										<form:input path="companyEmail"
											placeholder="email@domaine.com" name="companyEmail"
											class="form-control" maxlength="50" />
									</p>
									<form:errors path="companyEmail" style='color:red;' />
								</spring:bind></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Email 2</strong>
								</p></td>
							<td><spring:bind path="companyEmail2">
									<p class="h6 ${status.error ? 'has-error' : ''}">
										<form:input path="companyEmail2"
											placeholder="email@domaine.com" name="companyEmail"
											class="form-control" maxlength="50" type="email"/>
									</p>
									<form:errors path="companyEmail2" style='color:red;' />
								</spring:bind></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Site web</strong>
								</p></td>
							<td><spring:bind path="companyWebsite">
									<p class="h6 ${status.error ? 'has-error' : ''}">
										<form:input path="companyWebsite" class="form-control"
											maxlength="50" placeholder="http://... ou https://..." type="url" pattern="https?://.+"/>
									</p>
									<form:errors path="companyWebsite" style='color:red;' />
								</spring:bind></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Commentaires&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</strong>
								</p></td>
							<td><p class="h6">
									<form:textarea path="companyComments" class="form-control"
										id="textarea" />
									<br /> Il vous reste <span id="carac_reste_textarea"></span>
									caractères.
									<script type="text/javascript">
										maxlength_textarea('textarea',
												'carac_reste_textarea', 250);
									</script>
								</p></td>
						</tr>
						<c:if test="${companyCategoryNoLogo == true}">
							<c:set value="none" var="displayValueRow"></c:set>
						</c:if>
						<tr id="logoTableRow" style="display: ${displayValueRow};">
							<td><p class="h6">
									<strong>Logo *&nbsp;&nbsp;&nbsp;&nbsp;</strong>
								</p></td>
							<td><c:if test="${logoB64 == ''}">
									<c:set value="none" var="displayValueWrapper"></c:set>
								</c:if>
								<div id="logoPreviewWrapper"
									style="display: ${displayValueWrapper};">
									<img id="logoPreview" src="${logoB64}"
										style="max-width: 50px; max-height: 50px;" /> <input
										type="button" value="Supprimer image"
										onclick="deleteLogoClick();" />
								</div>
								<p class="h6">
									<input id="logoInput" name="logo" class="form-control"
										type="file" onchange="logoSelected(event);" /> <input
										id="logoStatus" name="logoStatus" type="hidden" value="kept" />
								</p></td>
						</tr>
						<tr>
							<td><p class="h6">
									<input type="submit" value="Editer" class="btn btn-success" id="submit"/>
								</p></td>
							<td><p class="h6">
									<a href="<c:url value='/company/list'/>" id="cancel"
										class="btn btn-danger custom-width" onclick="return confirm('Etes-vous sûr de vouloir quitter cette page?')">Annuler</a>
								</p></td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</form:form>
	<!--div class="row">
		<div class="col-md-5">
			<table>
				<tr>
					<td><p class="h6">
							<a href="<c:url value='/'/>" class="btn btn-info custom-width">Home</a>
						</p></td>
				</tr>
			</table>
		</div>
	</div-->
</div>
<%@ include file="footer.jsp"%>