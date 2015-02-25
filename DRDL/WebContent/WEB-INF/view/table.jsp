<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<core:set var="baseURL" value="${pageContext.servletContext.contextPath}" />  


<link href="<core:url value="/resources/css/style.css" />" rel="stylesheet"
	type="text/css" />
	   
<script src="./resources/js/jquery-1.9.1.min.js" type="text/javascript"></script>
 <script language="javascript" type="text/javascript">
 $(document).ready(function() {
		$('#search').keyup(function(e) {
			var filter = $('#search').val();
			if (filter.length > 0) {
				loadTable(filter);
			} else {

				$('tr[id*="tr_"]').remove();
			}
		});
	});

	function loadTable(filter) {
		var url = "/DRDL/load/" + filter;
		$('#tbody').load(url, function(response, status, xhr) {
			if (status == "error") {
				var msg = "Sorry but there was an error : ";
				$("#info").html(msg + xhr.status + " " + xhr.statusText);
			}
		});
		return false;
	}

</script>
 
</head>
<body>
	<div id="container">
		<h2>Find Contact By Name</h2>
		<label for="search">Search</label>
		<input type="text" id="search" name="search">
		<div id="info"></div>
		<table id="loadTable" class="table tr">
			<thead>
				<tr>
					<th>Id</th>
					<th>First Name</th>
					
				</tr>
			</thead>
		<tbody id="tbody">
		<jsp:include page="search.jsp"/>
		</tbody>
		</table>
		</div>
</body>
</html>