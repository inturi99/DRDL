<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="./resources/js/jquery-1.9.1.min.js" type="text/javascript"></script>
<script src="./resources/js/jquery-ui-1.10.2.smoothness.min.js"
	type="text/javascript"></script>
<script src="./resources/js/jquery-validate.min.js"
	type="text/javascript"></script>

<link href="<c:url value="/resources/css/bootstrap.css" />"
	rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/css/fileinput.min.css" />"
	rel="stylesheet" type="text/css" />
<script src="./resources/js/fileinput.min.js" type="text/javascript"></script>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet" type="text/css" />
<script src="./resources/js/bootstrap.min.js" type="text/javascript"></script>
<script src="./resources/js/bootstrap-submenu.min.js"
	type="text/javascript"></script>
<link href="<c:url value="/resources/css/bootstrap-submenu.min.css" />"
	rel="stylesheet" type="text/css" />
<script src="./resources/js/bootstrap-submenu.js" type="text/javascript"></script>
<script src="./resources/js/submenu.js" type="text/javascript"></script>
<link href="<c:url value="/resources/css/submenu.css" />"
	rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/css/bootstrap-submenu.css" />"
	rel="stylesheet" type="text/css" />


<script language="javascript" type="text/javascript">
$(document).ready(function() {
	$('#button').click(function() {
				var employeeNumber = $('#firstInput').val();
				var name = $('#lastInput').val();
				$.ajax({
					type:'GET',
					url:"/DRDL/load/"+"/"+ employeeNumber + "/" + name,
					success:
						function loadTable(employeeNumber,name) {
						url:"/DRDL/load/"+"/"+ employeeNumber + "/" + name,
						$('#tbody').load(url, function(response, status, xhr) {
							if (status == "error") {
								var msg = "Sorry but there was an error : ";
								$("#info").html(msg + xhr.status + " " + xhr.statusText);
							}
						});
						clearInputs();	
					}
				});
			});
     });
	
</script>

</head>
<body>
	<jsp:include page="header.jsp" />
	<jsp:include page="menu.jsp" />
	<div id="container">
		<div class="col-sm-offset-1 col-sm-10">
			<div class="panel panel-primary ">
				<div class="panel-body">
					<div>
						<label for="firstInput">EmployeeNumber</label> <input type="text"
							name="employeeNumber" id="firstInput" />
					</div>
					<div>
						<label for="lastInput">LastName</label> <input type="text"
							name="name" id="lastInput" />
					</div>
					<button type="button" id="button">Find</button>

					<div id="info"></div>
					<table id="loadTable" class="table table-striped table-bordered">
						<thead>
							<tr>
								<th class="text-center">Employee Type</th>
								<th class="text-center">Emp NO</th>
								<th class="text-center">Name</th>
								<th class="text-center">Email</th>
								<th class="text-center">Date Of Birth</th>
								<th class="text-center">Qualififaction</th>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody id="tbody">
							<jsp:include page="search.jsp" />
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>
</html>