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
				url : "/DRDL/loadSalaryType/" + "/" + employeeNumber + "/" + name,
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
					<form:form method="get" action="loadSalaryType" commandName="salaryTypeDto"
						cssClass="form-horizontal">
						<div class="form-group">
							<label for="employeeId" class="col-sm-2 control-label">Employee
								Id </label>
							<div class="col-sm-3">
								<form:select path="employeeNumber" id="employeeNumber"
									cssClass="form-control">
									<form:option label="-- Select Employee Id --" value="-1" />
									<form:options items="${list}" itemLabel="employeeNumber"
										itemValue="employeeNumber" />
								</form:select>
							</div>
							<label for="employeeId" class="col-sm-2 control-label">Employee
								Name</label>
							<div class="col-sm-3">
								<form:select path="name" id="name"
									cssClass="form-control">
									<form:option label="-- Select Employee Name--" value="-1" />
									<form:options items="${list}" itemLabel="name"
										itemValue="name" />
								</form:select>
							</div>
							<button type="button" class="btn btn-primary" id="button">Search</button>
						</div>
						<div id="info"></div>
						<table id="loadTable" class="table table-striped table-bordered">
							<thead>
								<tr>
									<th class="text-center">Emp NO</th>
									<th class="text-center">Name</th>
									<th class="text-center">Increments Date </th>
									<th class="text-center">Increments </th>
									<th></th>
									<th></th>
									<th></th>
								</tr>
							</thead>
							<tbody id="tbody">
								<jsp:include page="salarytypesearch.jsp" />
							</tbody>
						</table>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>