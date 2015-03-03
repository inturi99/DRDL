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
<jsp:include page="header.jsp"/>
	<jsp:include page="menu.jsp"/>
		<div class="container">
			<div class="col-sm-offset-1 col-sm-10">
				<div class="panel panel-primary ">
					<div class="panel-heading">
						<h4 class=" panel-title text-center">Add Employee Increment</h4>
					</div>
					<div class="panel-body">
						<form:form method="post" action="addIncrement"
							commandName="incrementsDto" cssClass="form-horizontal">
							  <div class="form-group">
								<label for="employeeId" class="col-sm-2 control-label">Employee Id </label>
								<div class="col-sm-4">
									<form:select path="employeeId"
										cssClass="form-control" >
										<form:option label="-- Select Employee Id --" value="-1" />
				               <form:options items="${list}" itemLabel="employeeNumber"
					                   itemValue="id" />
										</form:select>
								</div>
								</div>
							   <div class="form-group" >
								<label for="dateIncr" class="col-sm-2 control-label">Increment Date 
									</label>
								<div class="col-sm-4">
								  <div class="input-group">
									<form:input path="dateIncr"  id="dobdatepicker" placeholder="Increment Date "
										cssClass="date-picker form-control" />
										 <label for="dobdatepicker" class="input-group-addon btn"><span class="glyphicon glyphicon-calendar"></span>
                                      </label>
								</div>
								</div>
							</div>
							
							<div class="form-group">
								<label for="increment" class="col-sm-2 control-label">Increment</label>
								<div class="col-sm-2">
									<form:input path="increment" id="increment" placeholder="Increment"
										cssClass="form-control" />
								</div>
							</div>
							                            					                  
							<div class="form-group">
								<div class="col-lg-offset-2 col-lg-10">
									<button type="submit" class="btn btn-primary">
										<spring:message code="label.addIncrement" />
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
