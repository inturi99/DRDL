<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Empoyee</title>
<link href="<c:url value="/resources/css/bootstrap.css" />"
	rel="stylesheet" type="text/css" />
<script src="./resources/js/jquery-1.9.1.min.js" type="text/javascript"></script>
 <script src="./resources/js/jquery-ui-1.10.2.smoothness.min.js" type="text/javascript"></script>
 <script src="./resources/js/jquery-validate.min.js" type="text/javascript"></script>

<script type="text/javascript" src="resources/js/b64.js"></script>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet" type="text/css" />
<script src="./resources/js/bootstrap.min.js" type="text/javascript"></script>
<script language="javascript" type="text/javascript">
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
<div class="page-header">
   <h1 align="center">Defence Research and Development Organisation   
   </h1>
   <ul class="nav nav-tabs">
   <li><a href="#">MASTERS</a></li>
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
					<h4 class=" panel-title text-center">Edit ProjectManager</h4>
				</div>
				<div class="panel-body">
					<c:url var="saveUrl" value="editProjectManager?id=${projectManager.id}" />
					<form:form modelAttribute="projectManager" method="post"
						action="${saveUrl}" cssClass="form-horizontal">
				<div class="form-group">
								<label for="pmcode" class="col-sm-2 control-label">Project Manager Code</label>
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
								<label for="grade" class="col-sm-2 control-label">Grade </label>
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
							
						<div class="form-group">
								<div class="col-lg-offset-2 col-lg-10">
									<button type="submit" class="btn btn-primary">
										<spring:message code="label.updateProjectManager" />
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
