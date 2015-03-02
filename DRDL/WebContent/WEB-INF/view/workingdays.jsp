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
                $('#month').datepicker({
                    format: "MM",
                    showMeridian: true,
                    autoclose: true,
                }); 
                
                $('#year').datepicker({
                    format: "yyyy",
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
					<li><a href="pmList">PROJECT MANAGER DETAILS </a></li>
					<li><a href="#">VENDOR DETAILS</a></li>
					<li><a href="#">CONT EMPLOYES DETAILS</a></li>
					<li><a href="#">ADD ON.OF DAYS PER MONTH </a></li>					
				</ul></li>
				<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">TRANSACTIONS <span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="pmList">JOB CONTRACT PROPOSALS </a></li>									
				</ul></li>
			
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">DECISION <span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="pmList">JOB CONTRACT </a></li>
					<li><a href="#">SALARY</a></li>										
				</ul></li>
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">QUERY FORMS <span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="pmList">JOB CONTRACT </a></li>
					<li><a href="#">DECISION MAKING</a></li>										
				</ul></li>
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">REPORTS<span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="pmList">JOB CONTRACT </a></li>
					<li><a href="#">STATUS REPORT</a></li>
					<li><a href="#">SELECT PROJECT</a></li>
					<li><a href="#">SALARY FULL LIST </a></li>					
				</ul></li>
   <li><a href="#">EXIT</a></li>
    <li><a href="list">EMPLOYEE</a></li>
   </ul>
		<div class="container">
			<div class="col-sm-offset-1 col-sm-10">
				<div class="panel panel-primary ">
					<div class="panel-heading">
						<h4 class=" panel-title text-center">Add Working Days</h4>
					</div>
					<div class="panel-body">
						<form:form method="post" action="addMonthlyworkigdays"
							commandName="monthlyWorkingDaysDto" cssClass="form-horizontal">
							<div class="form-group" >
								<label for="month" class="col-sm-2 control-label">Month
									</label>
								<div class="col-sm-4">
								  <div class="input-group">
									<form:input path="month"  id="month" placeholder="Month"
										cssClass="date-picker form-control" />
										 <label for="month" class="input-group-addon btn"><span class="glyphicon glyphicon-calendar"></span>
                                      </label>
								</div>
								</div>
							</div>
							<div class="form-group">
								<label for="workingdays" class="col-sm-2 control-label">workingdays</label>
								<div class="col-sm-4">
									<form:input path="workingdays" placeholder="workingdays"
										cssClass="form-control" />
								</div>
							</div>
                             <div class="form-group" >
								<label for="year" class="col-sm-2 control-label">Year
									</label>
								<div class="col-sm-4">
								  <div class="input-group">
									<form:input path="year"  id="year" placeholder="Year"
										cssClass="date-picker form-control" />
										 <label for="year" class="input-group-addon btn"><span class="glyphicon glyphicon-calendar"></span>
                                      </label>
								</div>
								</div>
							</div>
                             
							<div class="form-group">
								<div class="col-lg-offset-2 col-lg-10">
									<button type="submit" class="btn btn-primary">
										<spring:message code="label.addworkingdays" />
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
