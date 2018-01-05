<%@ include file="header.jsp"%>
<script  type="text/javascript">
jQuery(document).ready(function($) {

	if (window.history && window.history.pushState) {

	window.history.pushState('forward', null, null);

	$(window).on('popstate', function() {
	window.location.href = "/managerCEP/help.html";
	});

	}
	});
</script>
Help to do.
<%@ include file="footer.jsp"%>