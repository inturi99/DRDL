<%@ include file="pageCashing.jsp"%>
<head>
<title>ProposalSanction</title>
<script language="javascript" type="text/javascript">
	$(document).ready(function() {
		$('#button').click(function() {
			var propcode = $('#propcode').val();
			$.ajax({
				type : 'GET',
				url : "/DRDL/pdsanction/"+"/"+propcode,
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
					<form:form method="get" action="pdsanction"
						commandName="pdSanctionDto" cssClass="form-horizontal">
						<div class="form-group">
							<label for="propcode" class="col-sm-2 control-label">Prop
								Code </label>
							<div class="col-sm-3">
								<form:select path="propcode" id="propcode"
									cssClass="form-control">
									<form:option label="-- Select Employee Id --" value="-1" />
									<form:options items="${pdlist}" itemLabel="propcode"
										itemValue="propcode" />
								</form:select>
							</div>

							<button type="button" class="btn btn-primary" id="button">Search</button>
						</div>
						<div id="info"></div>
						<table id="loadTable" class="table table-striped table-bordered">
							<thead>
								<tr>
									<th class="text-center">propcode</th>
									<th class="text-center">natureofjob</th>
									<th class="text-center">amount</th>
									<th class="text-center">demandingofficer</th>
									<th class="text-center">Date</th>
									<th class="text-center">pddecision</th>
									<th></th>
								</tr>
							</thead>
							<tbody id="tbody">
								<jsp:include page="fetchpdsanction.jsp" />
							</tbody>
						</table>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>