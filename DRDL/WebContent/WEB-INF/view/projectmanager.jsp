<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Project Manager</title>
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
<link href="<c:url value="/resources/css/datepicker.css" />"
	rel="stylesheet" type="text/css" />
<script src="./resources/js/bootstrap-datepicker.js" type="text/javascript"></script>
 <script type="text/javascript">
            // When the document is ready
            $(document).ready(function () {
                $('#dobdatepicker').datepicker({
                    format: "dd/mm/yyyy",
                    showMeridian: true,
                    autoclose: true,
                });  
            
            });
        </script>
<style>
.error {
	color: #ee0d25;
}
</style>

</head>
<body>
	<div class="page-header">
		<h1 align="center">Defence Research and Development Organisation
		</h1>
		<ul class="nav nav-tabs">
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">MASTERS <span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="pmList">ProjectManager</a></li>
					<li><a href="#">Page 1-2</a></li>
					<li><a href="#">Page 1-3</a></li>
				</ul></li>
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
						<h4 class=" panel-title text-center">Add ProjectManager</h4>
					</div>
					<div class="panel-body">
						<form:form method="post" action="addProjectManager"
							commandName="projectManagerDto" cssClass="form-horizontal">
							<div class="form-group">
								<label for="pmcode" class="col-sm-2 control-label">Project
									Manager Code</label>
								<div class="col-sm-4">
									<form:input path="pmcode" placeholder="ProjectManager Code"
										cssClass="form-control" />
								</div>
							</div>
							<div class="form-group">
								<label for="name" class="col-sm-2 control-label">Name </label>
								<div class="col-sm-4">
									<form:input path="name" placeholder="name"
										cssClass="form-control" />
								</div>
							</div>
							<div class="form-group">
								<label for="grade" class="col-sm-2 control-label">Grade
								</label>
								<div class="col-sm-4">
									<form:input path="grade" placeholder="grade"
										cssClass="form-control" />
								</div>
							</div>
							<div class="form-group">
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
							</div>
							<div class="form-group">
								<label for="phoneNumber" class="col-sm-2 control-label">Phone
									Number</label>
								<div class="col-sm-4">
									<form:input path="phoneNumber" placeholder="phoneNumber"
										cssClass="form-control" />
								</div>
							</div>
                             <div class="form-group" >
								<label for="dob" class="col-sm-2 control-label">Date of Birth
									</label>
								<div class="col-sm-4">
								  <div class="input-group">
									<form:input path="dob"  id="dobdatepicker" placeholder="Date of Birth"
										cssClass="date-picker form-control" />
										 <label for="dobdatepicker" class="input-group-addon btn"><span class="glyphicon glyphicon-calendar"></span>
                                      </label>
								</div>
								</div>
							</div>
                             
							<div class="form-group">
								<div class="col-lg-offset-2 col-lg-10">
									<button type="submit" class="btn btn-primary">
										<spring:message code="label.addProjectManager" />
									</button>
								</div>
							</div>
						</form:form>
					</div>
				</div>
			</div>
		</div>
</body>
</html>
