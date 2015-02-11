<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Empoyee</title>
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<link href="<c:url value="/resources/css/bootstrap.css" />"
	rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/css/fileinput.min.css" />"
	rel="stylesheet" type="text/css" />
<script src="./resources/js/fileinput.min.js" type="text/javascript"></script>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet" type="text/css" />
<script src="./resources/js/bootstrap.min.js" type="text/javascript"></script>


<script language="javascript" type="text/javascript">
	$(function() {
		$("#input-id").fileinput({
			'showUpload' : false,
			'previewFileType' : 'any'
		});
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
<div class="page-header">
   <h1 align="center">Defence Research and Development Organisation   
   </h1>
   <ul class="nav nav-tabs">
    <li class="dropdown" >
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">MASTERS
          <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Page 1-1</a></li>
            <li><a href="#">Page 1-2</a></li>
            <li><a href="#">Page 1-3</a></li> 
          </ul>
        </li>
   <li><a href="#">TRANSACTIONS</a></li>
   <li><a href="#">DECISION</a></li>
   <li><a href="#">QUERY FORMS</a></li>
   <li><a href="#">REPORTS</a></li>
   <li><a href="#">EXIT</a></li>
    <li><a href="list">EMPLOYEE</a></li>
   </ul>
	<div class="container">
		<div class="col-sm-offset-1 col-sm-10">

			<div class="panel panel-primary ">
				<div class="panel-heading">
					<h4 class=" panel-title text-center">Add Employee</h4>
				</div>
				<div class="panel-body">
					<form:form method="post" action="addEmployee"
						commandName="employee" enctype="multipart/form-data"
						cssClass="form-horizontal">
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
						
							<label for="dob" class="col-sm-2 control-label">Date of Birth</label>
							<div class="col-sm-4">
								<form:input path="dob" placeholder="dob"
									cssClass="form-control" />
							</div>
						</div>

						<div class="form-group">
							<label for="photo" class="col-sm-2 control-label">Photo</label>
							<div class="col-sm-9">
								<form:input id="input-id" class="file" path="photo" type="file"
									data-preview-file-type="text" />

							</div>
						</div>
												
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
								<form:input path="doj" placeholder="doj"
									cssClass="form-control" />
							</div>
							
							<label for="dol" class="col-sm-2 control-label">DATEOFLEAVING</label>
							<div class="col-sm-4">
								<form:input path="dol" placeholder="dol"
									cssClass="form-control" />
							</div>
							</div>
							<div class="form-group">
							<label for="lab" class="col-sm-2 control-label">LAB</label>
							<div class="col-sm-4">
								<form:input path="lab" placeholder="lab"
									cssClass="form-control" />
							</div>
							<label for="wkc" class="col-sm-2 control-label">WKC</label>
							<div class="col-sm-4">
								<form:input path="wkc" placeholder="wkc"
									cssClass="form-control" />
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
								<label for="resp" class="col-sm-2 control-label">RESP</label>
							<div class="col-sm-4">
								<form:input path="resp" placeholder="resp"
									cssClass="form-control" />
							</div>
							</div>
							<div class="form-group">
							<label for="job" class="col-sm-2 control-label">JOB</label>
							<div class="col-sm-4">
								<form:input path="job" placeholder="job"
									cssClass="form-control" />
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
							<label for="consigno" class="col-sm-2 control-label">CONSIGNO</label>
							<div class="col-sm-4">
								<form:input path="consigno" placeholder="consigno"
									cssClass="form-control" />
							</div>
							<label for="conexpon" class="col-sm-2 control-label">CONEXPON</label>
							<div class="col-sm-4">
								<form:input path="conexpon" placeholder="conexpon"
									cssClass="form-control" />
							</div>
							</div>
							
							<div class="form-group">
							<label for="wkcphone" class="col-sm-2 control-label">WKCPHONE</label>
							<div class="col-sm-4">
								<form:input path="wkcphone" placeholder="wkcphone"
									cssClass="form-control" />
							</div>
							<label for="emptype" class="col-sm-2 control-label">EMP TYPE</label>
							<div class="col-sm-4">
								<form:input path="emptype" placeholder="emptype"
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
								<form:input path="update_on" placeholder="update_on"
									cssClass="form-control" />
							</div>
							<label for="dot" class="col-sm-2 control-label">DOT</label>
							<div class="col-sm-4">
								<form:input path="dot" placeholder="dot"
									cssClass="form-control" />
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
									<spring:message code="label.addEmployee" />
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
