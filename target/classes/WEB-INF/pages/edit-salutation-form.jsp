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
	<p>
		Session utilisateur <b>${pageContext.request.userPrincipal.name}</b>
	</p>
	<h4>Edition Formule de Politesse Sélectionnée pour les Contacts</h4>
	<br />
	<p>${message}</p>
	<form:form method="POST" commandName="salutation"
		action="${pageContext.request.contextPath}/salutation/edit/${salutation.id_salutation}.html">
		<div class="row">
			<div class="col-md-5">
				<table>
					<tbody>
						<tr>
							<td><p class="h6">
									<strong>Dénomination *</strong>
								</p></td>
							<td><spring:bind path="salutationName">
									<p class="h6 ${status.error ? 'has-error' : ''}">
										<form:input path="salutationName" class="form-control"
											maxlength="50" />
									</p>
									<form:errors path="salutationName" style='color:red;' />
								</spring:bind></td>
						</tr>
						<tr>
							<td><p class="h6">
									<strong>Commentaires&nbsp;&nbsp;&nbsp;&nbsp;</strong>
								</p></td>
							<td><p class="h6">
									<form:textarea path="salutationComments" class="form-control"
										id="textarea" />
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
									<a href="<c:url value='/salutation/list'/>" id="cancel"
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