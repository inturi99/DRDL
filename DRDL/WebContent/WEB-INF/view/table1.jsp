<%@ include file="pageCashing.jsp"%>
<head>
<title>table1</title>
<script language="javascript" type="text/javascript">
	$(document).ready(function() {
		$('#button').click(function() {
			var employeeNumber = $('#employeeNumber').val();
			var name = $('#name').val();
			$.ajax({
				type : 'GET',
				url : "/DRDL/load/" + "/" + employeeNumber + "/" + name,
				success : function loadTable(response) {
					$("#tbody").html(response);

				},

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
					<form:form method="get" action="load" commandName="employeeDto"
						cssClass="form-horizontal">
						<div class="form-group">
							<label for="employeeId" class="col-sm-2 control-label">Employee
								Id </label>
							<div class="col-sm-3">
								<form:select path="id" id="employeeNumber"
									cssClass="form-control">
									<form:option label="-- Select Employee Id --" value="-1" />
									<form:options items="${list}" itemLabel="employeeNumber"
										itemValue="employeeNumber" />
								</form:select>
							</div>
							<label class="col-sm-2 control-label" for="name">Name</label>
							<div class="col-sm-3">
								<input type="text" name="name" id="name" />
							</div>
							<button type="button" class="btn btn-primary" id="button">Search</button>
						</div>
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
					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>