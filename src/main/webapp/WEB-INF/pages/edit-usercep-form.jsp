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
	function checkForm(form) {
		if (form.userCepFirstName.value == "") {
			alert("Le prénom doit être renseigné!");
			form.userCepFirstName.focus();
			return false;
		}
		/*var reFN = /^[\w ]+$/;
		if (!reFN.test(form.userCepFirstName.value)) {
			alert("Le prénom contient des caractères invalides!");
			form.userCepFirstName.focus();
			return false;
		}*/
		if (form.userCepLastName.value == "") {
			alert("Le nom doit être renseigné!");
			form.userCepLastName.focus();
			return false;
		}
		/*var reLN = /^[\w ]+$/;
		if (!reLN.test(form.userCepLastName.value)) {
			alert("Le nom contient des caractères invalides!");
			form.userCepLastName.focus();
			return false;
		}*/	
		if (form.userCepLogin.value == "") {
			alert("Le Login (User Name) doit être renseigné!");
			form.userCepLogin.focus();
			return false;
		}	
		if (form.userCepPassword.value == "") {
			alert("La password doit être renseignée!");
			form.userCepPassword.focus();
			return false;
		}		
		if (form.userCepEmail.value == "") {
			alert("L'email doit être renseignée!");
			form.userCepEmail.focus();
			return false;
		}		
		var x = document.forms["editusercep"]["userCepEmail"].value;
		var atpos = x.indexOf("@");
		var dotpos = x.lastIndexOf(".");
		if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length) {
			alert("L'email contient des caractères invalides!");
			form.userCepEmail.focus();
			return false;
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
<p>Session utilisateur <b>${pageContext.request.userPrincipal.name}</b></p>
	<h4>Edition Utilisateur</h4>
	<br />
	<p>${message}</p>
	<form:form method="POST" commandName="userCep" id="editusercep"
		name="editusercep"
		action="${pageContext.request.contextPath}/usercep/edit/${userCep.userCep_id}.html"
		onsubmit="return checkForm(this);">
		<div class="row">
			<div class="col-md-5">
				<table>
					<tbody>
						<tr>
							<td><p class="h6">
									<strong>Prénom *</strong>
								</p></td>
							<td><p class="h6">
									<form:input path="userCepFirstName" class="form-control"
										name="userCepFirstName" required="true"
										data-fv-notempty-message="The username is required" maxlength="50"/>
								</p></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Nom *</strong>
								</p></td>
							<td><p class="h6">
									<form:input path="userCepLastName" class="form-control"
										name="userCepLastName" maxlength="50"/>
								</p></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Rôle *</strong>
								</p></td>
							<td>
								<div class="form-group">
									<p class="h6">
										<select class="form-control" id="">
											<option>ADMIN</option>
										</select>
									</p>
								</div>
							</td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Login (User Name) *</strong>
								</p></td>
							<td><p class="h6">
									<form:input path="userCepLogin" class="form-control"
										name="userCepLogin" maxlength="50"/>
								</p></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Email *</strong>
								</p></td>
							<td><p class="h6">
									<form:input path="userCepEmail" class="form-control"
										name="userCepEmail" maxlength="50"/>
								</p></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Password *</strong>
								</p></td>
							<td><p class="h6">
									<form:input path="userCepPassword" class="form-control"
										name="userCepPassword" maxlength="50"/>
								</p></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Commentaires&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</strong>
								</p></td>
							<td><p class="h6">
									<form:textarea path="userCepComments" class="form-control" id="textarea"/>
									<br /> Il vous reste <span id="carac_reste_textarea"></span>
									caractères.
									<script type="text/javascript">
										maxlength_textarea('textarea',
												'carac_reste_textarea', 250);
									</script>
								</p></td>
						</tr>
						<tr>
							<td><p class="h6">
									<input type="submit" value="Editer" class="btn btn-success" id="submit"/>
								</p></td>
							<td><p class="h6">
									<a href="<c:url value='/usercep/list'/>" id="cancel"
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