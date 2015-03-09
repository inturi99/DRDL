<%@ include file="pageCashing.jsp"%>
<html>
<head>
<title>Edit Empoyee</title>
<script language="javascript" type="text/javascript">
	$(document).ready(function() {
		$('.date-picker').datepicker({
			format : "dd/mm/yyyy",
			showMeridian : true,
			autoclose : true,
		});
		$(".date-picker").datepicker();
		$(".date-picker").on("change", function() {
			var id = $(this).attr("id");
			var val = $("label[for='" + id + "']").text();
			$("#msg").text(val + " changed");
		});

	});
	$(function() {
		var str = $('#txt-image').val();
		$('#image').attr('src', 'data:image/jpg;base64,' + str);
	});
</script>

<style>
.error {
	color: #ee0d25;
}

.control-label {
	text-align: left !important;
}

body {
	font-family: Arial;
	font-size: 10pt;
}
</style>

</head>

<body>
	<jsp:include page="header.jsp" />
	<jsp:include page="menu.jsp" />
	<div class="container">
		<div class="col-sm-offset-1 col-sm-10">

			<div class="panel panel-primary ">
				<div class="panel-heading">
					<h4 class=" panel-title text-center">Edit Employee</h4>
				</div>
				<div class="panel-body">
					<c:url var="saveUrl" value="edit?id=${employeeDto.id}" />
					<form:form modelAttribute="employeeDto" method="post"
						action="${saveUrl}" cssClass="form-horizontal">
						<div class="form-group">
							<label for="emptype" class="col-sm-2 control-label">Employee
								Type</label>
							<div class="col-sm-4">
								<form:select path="emptype" cssClass="form-control">
									<form:option value="NONE" label="--- Select ---" />
									<form:option value="PermanentEmployee">Permanent Employee</form:option>
									<form:option value="ContractEmployee">Contract Employee</form:option>
								</form:select>
							</div>
							<label for="photo" class="col-sm-2 control-label">Photo</label>
							<div class="col-sm-4">
								<img id=image class="img-responsive" alt="Cinque Terre"
									width="125" height="125">
								<form:input id="txt-image" type="hidden" path="photo"
									placeholder="photo" cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">Name </label>
							<div class="col-sm-4">
								<form:input path="name" placeholder="name"
									cssClass="form-control" />
							</div>
							<label for="designation" class="col-sm-2 control-label">Designation</label>
							<div class="col-sm-4">
								<form:input path="designation" placeholder="designation"
									cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="email" class="col-sm-2 control-label">Email</label>
							<div class="col-sm-4">
								<form:input path="email" placeholder="email"
									cssClass="form-control" />
							</div>

							<label for="dob" class="col-sm-2 control-label">Date of
								Birth</label>
							<div class="col-sm-4">
								<div class="input-group">
									<%-- <form:input path="dob" id="date-picker-1"
											placeholder="Date of Birth"
											cssClass="date-picker form-control" /> --%>
									<input type="text"
										value="<fmt:formatDate value="${employeeDto.dob}" pattern="dd/MM/yyyy"/>"
										name="dob" id="date-picker-1" class="date-picker form-control" />

									<label for="date-picker-1" class="input-group-addon btn"><span
										class="glyphicon glyphicon-calendar"></span> </label>
								</div>
							</div>
						</div>

						<div class="form-group"></div>
						<div class="form-group">
							<label for="idcardno" class="col-sm-2 control-label">IDCARDNO</label>
							<div class="col-sm-4">
								<form:input path="idcardno" placeholder="idcardno"
									cssClass="form-control" />
							</div>
							<label for="qual" class="col-sm-2 control-label">QUALIFICATION</label>
							<div class="col-sm-4">
								<form:input path="qual" placeholder="qual"
									cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="doj" class="col-sm-2 control-label">DATEOFJOINING</label>
							<div class="col-sm-4">
								<div class="input-group">
									<%-- <form:input path="doj" id="date-picker-2"
											placeholder="Date of Joining"
											cssClass="date-picker form-control" />
										 --%>
									<input type="text"
										value="<fmt:formatDate value="${employeeDto.doj}" pattern="dd/MM/yyyy"/>"
										name="doj" id="date-picker-2" class="date-picker form-control" />
									<label for="date-picker-2" class="input-group-addon btn"><span
										class="glyphicon glyphicon-calendar"></span> </label>
								</div>
							</div>

							<label for="dol" class="col-sm-2 control-label">DATEOFLEAVING</label>
							<div class="col-sm-4">
								<div class="input-group">
									<%-- <form:input path="dol" id="date-picker-3"
											placeholder="Date of Leaving"
											cssClass="date-picker form-control" />
										 --%>
									<input type="text"
										value="<fmt:formatDate value="${employeeDto.dol}" pattern="dd/MM/yyyy"/>"
										name="dol" id="date-picker-3" class="date-picker form-control" />
									<label for="date-picker-3" class="input-group-addon btn"><span
										class="glyphicon glyphicon-calendar"></span> </label>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="lab" class="col-sm-2 control-label">LAB</label>
							<div class="col-sm-4">
								<form:input path="lab" placeholder="lab" cssClass="form-control" />
							</div>
							<label for="wkc" class="col-sm-2 control-label">WKC</label>
							<div class="col-sm-4">
								<form:input path="wkc" placeholder="wkc" cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="dept" class="col-sm-2 control-label">DEPARTMENT</label>
							<div class="col-sm-4">
								<form:input path="dept" placeholder="dept"
									cssClass="form-control" />
							</div>
							<label for="pmcode" class="col-sm-2 control-label">PRIMECODE</label>
							<div class="col-sm-4">
								<form:input path="pmcode" placeholder="pmcode"
									cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="iboss" class="col-sm-2 control-label">IBOSS</label>
							<div class="col-sm-4">
								<form:input path="iboss" placeholder="iboss"
									cssClass="form-control" />
							</div>
							<label for="project" class="col-sm-2 control-label">PROJECT </label>
								<div class="col-sm-4">
									<form:select path="project"
										cssClass="form-control" >
										<form:option label="-- Select Project --" value="-1" />
				               <form:options items="${pList}" itemLabel="projectCode"
					                   itemValue="projectCode" />
								</form:select>
								</div>
								</div>
						<div class="form-group">
							<label for="job" class="col-sm-2 control-label">JOB</label>
							<div class="col-sm-4">
								<form:input path="job" placeholder="job" cssClass="form-control" />
							</div>
							<label for="salary" class="col-sm-2 control-label">SALARY</label>
							<div class="col-sm-4">
								<form:input path="salary" placeholder="salary"
									cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="paddress" class="col-sm-2 control-label">PERMANENTADDRESS</label>
							<div class="col-sm-4">
								<form:input path="paddress" placeholder="paddress"
									cssClass="form-control" />
							</div>
							<label for="taddress" class="col-sm-2 control-label">TEMPORARYADDRESS</label>
							<div class="col-sm-4">
								<form:input path="taddress" placeholder="taddress"
									cssClass="form-control" />
							</div>

						</div>
						<div class="form-group">
							<label for="pphone" class="col-sm-2 control-label">PERMANENTPHONENO</label>
							<div class="col-sm-4">
								<form:input path="pphone" placeholder="pphone"
									cssClass="form-control" />
							</div>
							<label for="tphone" class="col-sm-2 control-label">TEMPORARYPHONENO</label>
							<div class="col-sm-4">
								<form:input path="tphone" placeholder="tphone"
									cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="type" class="col-sm-2 control-label">TYPE</label>
							<div class="col-sm-4">
								<form:input path="type" placeholder="type"
									cssClass="form-control" />
							</div>
							<label for="service" class="col-sm-2 control-label">SERVICE</label>
							<div class="col-sm-4">
								<form:input path="service" placeholder="service"
									cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="wkcphone" class="col-sm-2 control-label">WKCPHONE</label>
							<div class="col-sm-4">
								<form:input path="wkcphone" placeholder="wkcphone"
									cssClass="form-control" />
							</div>
                             <label for="resp" class="col-sm-2 control-label">RESP</label>
							<div class="col-sm-4">
								<form:input path="resp" placeholder="resp"
									cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="password" class="col-sm-2 control-label">PASSWORD</label>
							<div class="col-sm-4">
								<form:input path="password" placeholder="password"
									cssClass="form-control" />
							</div>
							<label for="catg" class="col-sm-2 control-label">CATEGORY</label>
							<div class="col-sm-4">
								<form:input path="catg" placeholder="catg"
									cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="start_sal" class="col-sm-2 control-label">STARTSALARY</label>
							<div class="col-sm-4">
								<form:input path="start_sal" placeholder="start_sal"
									cssClass="form-control" />
							</div>
							<label for="board_type" class="col-sm-2 control-label">BOARDTYPE</label>
							<div class="col-sm-4">
								<form:input path="board_type" placeholder="board_type"
									cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="update_on" class="col-sm-2 control-label">UPDATE_ON</label>
							<div class="col-sm-4">
								<div class="input-group">
									<%-- <form:input path="update_on" id="date-picker-6"
											placeholder="update_on" cssClass="date-picker form-control" /> --%>
									<input type="text"
										value="<fmt:formatDate value="${employeeDto.update_on}" pattern="dd/MM/yyyy"/>"
										name="update_on" id="date-picker-4"
										class="date-picker form-control" /> <label for="date-picker-4"
										class="input-group-addon btn"><span
										class="glyphicon glyphicon-calendar"></span> </label>
								</div>
							</div>
							<label for="dot" class="col-sm-2 control-label">DOT</label>
							<div class="col-sm-4">
								<div class="input-group">
									<%-- <form:input path="dot" id="date-picker-7"
											placeholder="conexpon" cssClass="date-picker form-control" /> --%>
									<input type="text"
										value="<fmt:formatDate value="${employeeDto.dot}" pattern="dd/MM/yyyy"/>"
										name="dot" id="date-picker-5" class="date-picker form-control" />

									<label for="date-picker-5" class="input-group-addon btn"><span
										class="glyphicon glyphicon-calendar"></span> </label>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="empid_new" class="col-sm-2 control-label">EMPID_NEW</label>
							<div class="col-sm-4">
								<form:input path="empid_new" placeholder="empid_new"
									cssClass="form-control" />
							</div>
							<label for="mobile" class="col-sm-2 control-label">MOBILE</label>
							<div class="col-sm-4">
								<form:input path="mobile" placeholder="mobile"
									cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="verified" class="col-sm-2 control-label">VERIFIED</label>
							<div class="col-sm-4">
								<form:input path="verified" placeholder="verified"
									cssClass="form-control" />
							</div>
							<label for="punch" class="col-sm-2 control-label">PUNCH</label>
							<div class="col-sm-4">
								<form:input path="punch" placeholder="punch"
									cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<div class="col-lg-offset-2 col-lg-10">
								<button type="submit" class="btn btn-primary">
									<spring:message code="label.updateEmployee" />
								</button>
							</div>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
	</div>
</body>
</html>
