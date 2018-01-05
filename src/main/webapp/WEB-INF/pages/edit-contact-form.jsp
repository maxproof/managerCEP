<%@page import="ch.mmi.cep.model.Contact"%>
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
    	return 'Etes-vous s�r de vouloir quitter cette page?';
    };             
    };   
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
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<div class="main">
<p>Session utilisateur <b>${pageContext.request.userPrincipal.name}</b></p>
	<h4>Edition Contact S�lectionn�</h4>
	<br />
	<p>${message}</p>
	<form:form method="POST" commandName="contact"
		action="${pageContext.request.contextPath}/contact/edit/${contact.id_contact}.html">
		<div class="row">
			<div class="col-md-5">
				<table>
					<tbody>
					<!-- With notempty => control but no company in dropbox-->
						<tr>
							<td><p class="h6">
									<strong>Entreprise Associ�e *</strong>
								</p></td>
							<td><spring:bind path="companies">
									<p class="h6 ${status.error ? 'has-error' : ''}">
							<form:select path="companies"
									items="${companies4ContactsList}" itemValue="id_company" itemLabel="companyName" class="form-control input-sm" />
									</p>
									<form:errors path="companies" style='color:red;' />
								</spring:bind></td>
						<tr>
							<td><p class="h6">
									<strong>Nom *</strong>
								</p></td>
							<td><spring:bind path="contactLastName">
									<p class="h6 ${status.error ? 'has-error' : ''}">
										<form:input path="contactLastName" class="form-control" maxlength="50"/>
									</p>
									<form:errors path="contactLastName" style='color:red;' />
								</spring:bind></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Pr�nom *</strong>
								</p></td>
							<td><spring:bind path="contactFirstName">
									<p class="h6 ${status.error ? 'has-error' : ''}">
										<form:input path="contactFirstName" class="form-control" maxlength="50"/>
									</p>
									<form:errors path="contactFirstName" style='color:red;' />
								</spring:bind></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Formule de Politesse *&nbsp;&nbsp;&nbsp;&nbsp;</strong>
								</p></td>
							<td><spring:bind path="salutations">
									<p class="h6 ${status.error ? 'has-error' : ''}">
										<form:select path="salutations" class="form-control">
											<form:option value="NONE" label="--- Selectionner ---" />
											<form:options items="${contactSalutationsList}" />
										</form:select>
									</p>
									<form:errors path="salutations" style='color:red;' />
								</spring:bind></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Adresse *</strong>
								</p></td>
							<td><spring:bind path="contactStreet">
									<p class="h6 ${status.error ? 'has-error' : ''}">
										<form:input path="contactStreet" class="form-control" maxlength="50"/>
									</p>
									<form:errors path="contactStreet" style='color:red;' />
								</spring:bind></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>CP *</strong>
								</p></td>
							<td><spring:bind path="contactPostCode">
									<p class="h6 ${status.error ? 'has-error' : ''}">
										<form:input path="contactPostCode" class="form-control" maxlength="4" type="text" oninput="this.value = this.value.replace(/[^0-9.]/g, ''); this.value = this.value.replace(/(\..*)\./g, '$1');"/>
									</p>
									<form:errors path="contactPostCode" style='color:red;' />
								</spring:bind></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Localit� *</strong>
								</p></td>
							<td><spring:bind path="contactCity">
									<p class="h6 ${status.error ? 'has-error' : ''}">
										<form:input path="contactCity" class="form-control" maxlength="50"/>
									</p>
									<form:errors path="contactCity" style='color:red;' />
								</spring:bind></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>T�l�phone *</strong>
								</p></td>
							<td><spring:bind path="contactPhoneNumber">
									<p class="h6 ${status.error ? 'has-error' : ''}">
										<form:input path="contactPhoneNumber" class="form-control" maxlength="10" type="text" oninput="this.value = this.value.replace(/[^0-9.]/g, ''); this.value = this.value.replace(/(\..*)\./g, '$1');"/>
									</p>
									<form:errors path="contactPhoneNumber" style='color:red;' />
								</spring:bind></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>T�l�phone 2</strong>
								</p></td>
							<td><spring:bind path="contactMobileNumber">
									<p class="h6 ${status.error ? 'has-error' : ''}">
										<form:input path="contactMobileNumber" class="form-control" maxlength="10" minlength="10" type="text" pattern=".{10,10}" oninput="this.value = this.value.replace(/[^0-9.]/g, ''); this.value = this.value.replace(/(\..*)\./g, '$1');"/>
									</p>
									<form:errors path="contactMobileNumber" style='color:red;' />
								</spring:bind></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Email *</strong>
								</p></td>
							<td><spring:bind path="contactEmail">
									<p class="h6 ${status.error ? 'has-error' : ''}">
										<form:input path="contactEmail"
											placeholder="email@domaine.com" class="form-control" maxlength="50"/>
									</p>
									<form:errors path="contactEmail" style='color:red;' />
								</spring:bind></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Email 2</strong>
								</p></td>
							<td><spring:bind path="contactEmail2">
									<p class="h6 ${status.error ? 'has-error' : ''}">
										<form:input path="contactEmail2"
											placeholder="email@domaine.com" class="form-control" maxlength="50" type="email"/>
									</p>
									<form:errors path="contactEmail2" style='color:red;' />
								</spring:bind></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Commentaires</strong>
								</p></td>
							<td><p class="h6">
									<form:textarea path="comments" class="form-control" id="textarea"/>
									<br /> Il vous reste <span id="carac_reste_textarea"></span>
									caract�res.
									<script type="text/javascript">
										maxlength_textarea('textarea',
												'carac_reste_textarea', 250);
									</script>
								</p></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Facturation&nbsp;&nbsp;&nbsp;&nbsp;</strong>
								</p></td>
							<td><p class="h6">
									<form:input path="billing" class="form-control" placeholder="0.00" type="number" min="0" step="0.01"/>
								</p></td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="col-md-3">
				<table>
					<tbody>
						<tr>
							<td><p class="h6">
									<strong>Envoi Revue</strong>
								</p></td>
							<td><p class="h6">
									<form:select path="sendMagazine" class="form-control">
										<form:options items="${contactBooleansList}" />
									</form:select>
								</p></td>
							<td><form:errors path="sendMagazine" cssClass="error" /></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Envois Invitation&nbsp;&nbsp;&nbsp;&nbsp;</strong>
								</p></td>
							<td><p class="h6">
									<form:select path="sendInvitation" class="form-control">
										<form:options items="${contactBooleansList}" />
									</form:select>
								</p></td>
							<td><form:errors path="sendInvitation" cssClass="error" /></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Invitation Club</strong>
								</p></td>
							<td><p class="h6">
									<form:select path="sendClubInvitation" class="form-control">
										<form:options items="${contactBooleansList}" />
									</form:select>
								</p></td>
							<td><form:errors path="sendClubInvitation" cssClass="error" /></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Microtechnique</strong>
								</p></td>
							<td><p class="h6">
									<form:select path="microtechnics" class="form-control">
										<form:options items="${contactBooleansList}" />
									</form:select>
								</p></td>
							<td><form:errors path="microtechnics" cssClass="error" /></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Pub. Revue</strong>
								</p></td>
							<td><p class="h6">
									<form:select path="magazinePublication" class="form-control">
										<form:options items="${contactBooleansList}" />
									</form:select>
								</p></td>
							<td><form:errors path="magazinePublication" cssClass="error" /></td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="col-md-3">
				<table>
					<tbody>
						<tr>
							<td><p class="h6">
									<strong>Conseil de Direction&nbsp;&nbsp;&nbsp;&nbsp;</strong>
								</p></td>
							<td><p class="h6">
									<form:select path="executiveBoard" class="form-control">
										<form:options items="${contactBooleansList}" />
									</form:select>
								</p></td>
							<td><form:errors path="executiveBoard" cssClass="error" /></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Comm. Strat�gie</strong>
								</p></td>
							<td><p class="h6">
									<form:select path="strategyBoard" class="form-control">
										<form:options items="${contactBooleansList}" />
									</form:select>
								</p></td>
							<td><form:errors path="strategyBoard" cssClass="error" /></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Comm. Services</strong>
								</p></td>
							<td><p class="h6">
									<form:select path="servicesBoard" class="form-control">
										<form:options items="${contactBooleansList}" />
									</form:select>
								</p></td>
							<td><form:errors path="servicesBoard" cssClass="error" /></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Comm. Formation</strong>
								</p></td>
							<td><p class="h6">
									<form:select path="trainingBoard" class="form-control">
										<form:options items="${contactBooleansList}" />
									</form:select>
								</p></td>
							<td><form:errors path="trainingBoard" cssClass="error" /></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Comm. Coaching</strong>
								</p></td>
							<td><p class="h6">
									<form:select path="coachingBoard" class="form-control">
										<form:options items="${contactBooleansList}" />
									</form:select>
								</p></td>
							<td><form:errors path="coachingBoard" cssClass="error" /></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Comm. Industrie</strong>
								</p></td>
							<td><p class="h6">
									<form:select path="industryBoard" class="form-control">
										<form:options items="${contactBooleansList}" />
									</form:select>
								</p></td>
							<td><form:errors path="industryBoard" cssClass="error" /></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Comm. Infrastruct.</strong>
								</p></td>
							<td><p class="h6">
									<form:select path="facilitiesBoard" class="form-control">
										<form:options items="${contactBooleansList}" />
									</form:select>
								</p></td>
							<td><form:errors path="facilitiesBoard" cssClass="error" /></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Comm. Club-Entrep.</strong>
								</p></td>
							<td><p class="h6">
									<form:select path="clubCompaniesBoard" class="form-control">
										<form:options items="${contactBooleansList}" />
									</form:select>
								</p></td>
							<td><form:errors path="clubCompaniesBoard" cssClass="error" /></td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		<div class="row">
			<div class="col-md-5">
				<table>
					<tr>
						<td><p class="h6">
								<input type="submit" value="Editer" class="btn btn-success" id="submit"/>
								<!--or <a href="<c:url value='/contact/list' />">Cancel</a>-->
							</p></td>
						<td><p class="h6">&nbsp;&nbsp;&nbsp;&nbsp;</p></td>
						<td><p class="h6">
								<a href="<c:url value='/contact/list'/>" id="cancel"
									class="btn btn-danger custom-width" onclick="return confirm('Etes-vous s�r de vouloir quitter cette page?')">Annuler</a>
							</p></td>
					</tr>
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