<%@ include file="pageCashing.jsp"%>
<html>
<head>
<title>Working Days</title>
 <script type="text/javascript">
            // When the document is ready
            $(document).ready(function () {
                $('#month').datepicker({
                    format: "mm",
                    showMeridian: true,
                    autoclose: true,
                }); 
                
                $('#year').datepicker({
                	viewMode: 'years',
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
<jsp:include page="header.jsp" />
	<jsp:include page="menu.jsp" />
		<div class="container">
			<div class="col-sm-offset-1 col-sm-10">
				<div class="panel panel-primary ">
					<div class="panel-heading">
						<h4 class=" panel-title text-center">Add Working Days</h4>
					</div>
					<div class="panel-body">
						<form:form method="post" action="addMonthlyworkingdays"
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
