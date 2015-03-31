<%@ include file="pageCashing.jsp"%>
<head>
<title>table1</title>
<script language="javascript" type="text/javascript">
	$(document).ready(function() {
		$('#button').click(function() {
			var employeeId = $('#employeeId').val();
			$.ajax({
				type : 'GET',
				url : "/DRDL/fetch/" + "/" + employeeId,
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
					<form:form method="get" action="fetch" commandName="employeeDto"
						cssClass="form-horizontal">
						<div class="form-group">
							<label for="employeeId" class="col-sm-2 control-label">Employee
								Id </label>
							<div class="col-sm-3">
								<form:select path="id" id="employeeId"
									cssClass="form-control">
									<form:option label="-- Select Employee Id --" value="-1" />
									<form:options items="${list}" itemLabel="id"
										itemValue="id" />
								</form:select>
							</div>
							<%-- <label for="employeeId" class="col-sm-2 control-label">Employee
								Name</label>
							<div class="col-sm-3">
								<form:select path="id" id="name"
									cssClass="form-control">
									<form:option label="-- Select Employee Name--" value="-1" />
									<form:options items="${list}" itemLabel="name"
										itemValue="name" />
								</form:select>
							</div>
							 --%>
							 <button type="button" class="btn btn-primary" id="button">Search</button>
						</div>
						<div id="info"></div>
						<table id="loadTable" class="table table-striped table-bordered">
							<thead>
								<tr>
								    <th class="text-center">Employee Id </th>
								     <th class="text-center">Employee Name </th>
									<th class="text-center">Month</th>
									<th class="text-center">Prasent</th>
									<th class="text-center">Absent</th>
									<th class="text-center">Late</th>
									<th></th>
									<th></th>
									<th></th>
								</tr>
							</thead>
							<tbody id="tbody">
								<jsp:include page="fetch.jsp" />
							</tbody>
						</table>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>