<%@ include file="pageCashing.jsp"%>
<html>
<head>
<title>Job Contract</title>
<script type="text/javascript">
            // When the document is ready
            $(document).ready(function () {
                $('#pdate').datepicker({
                    format: "dd/mm/yyyy",
                    showMeridian: true,
                    autoclose: true,
                }); 
                $('#jcdate').datepicker({
                    format: "dd/mm/yyyy",
                    showMeridian: true,
                    autoclose: true,
                }); 
            
            });
        </script>
    <script type="text/javascript">
        $(document).ready(function () {
            $(".pmode").hide();
            $("#paymode1").click(function () {
                $(".pmode").show();
            });
            $("#paymode2").click(function () {
                $(".pmode").hide();
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
					<h4 class=" panel-title text-center">Add Job Contract Employee</h4>
				</div>
				<div class="panel-body">
					<form:form method="post" action="addJobContract"
						commandName="jobContractDto" cssClass="form-horizontal">
						<div class="form-group">
							<label for="jcpropcd" class="col-sm-2 control-label">Requisition
								Code</label>
							<div class="col-sm-4">
								<form:input path="jcpropcd" id="jcpropcd" placeholder="jcpropcd"
									cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="employeeId" class="col-sm-2 control-label">Demanding
								Officer </label>
							<div class="col-sm-4">
								<form:select path="projectManagerId" cssClass="form-control">
									<form:option label="-- Select ProjectManager Code --"
										value="-1" />
									<form:options items="${pmlist}" itemLabel="pmcode"
										itemValue="id" />
								</form:select>
							</div>
							<label for="pdate" class="col-sm-2 control-label">Requisition
								Date </label>
							<div class="col-sm-4">
								<div class="input-group">
									<form:input path="pdate" id="pdate" placeholder="Date of Birth"
										cssClass="date-picker form-control" />
									<label for="pdate" class="input-group-addon btn"><span
										class="glyphicon glyphicon-calendar"></span> </label>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="job" class="col-sm-2 control-label">Job</label>
							<div class="col-sm-10">
								<form:input path="job" id="job" placeholder="job"
									cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="amt" class="col-sm-2 control-label">Amount</label>
							<div class="col-sm-4">
								<form:input path="amt" id="amt" placeholder="Amount"
									cssClass="form-control" />
							</div>
							<label for="employeeId" class="col-sm-2 control-label">Contractor/Job
								Executor </label>
							<div class="col-sm-4">
								<form:select path="employeeId" cssClass="form-control">
									<form:option label="-- Select Employee Id --" value="-1" />
									<form:options items="${list}" itemLabel="employeeNumber"
										itemValue="id" />
								</form:select>
							</div>
						</div>

						<div class="form-group">
							<label for="receipt" class="col-sm-2 control-label">Receipt
								No</label>
							<div class="col-sm-4">
								<form:input path="receipt" id="receipt" placeholder="receipt"
									cssClass="form-control" />
							</div>
							<label for="jcdate" class="col-sm-2 control-label">Date
								of Job Completion </label>
							<div class="col-sm-4">
								<div class="input-group">
									<form:input path="jcdate" id="jcdate"
										placeholder="Date of Job Completion"
										cssClass="date-picker form-control" />
									<label for="jcdate" class="input-group-addon btn"><span
										class="glyphicon glyphicon-calendar"></span> </label>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="paymode" class="col-sm-5 control-label">Payment
								Mode</label>
							<div class="col-sm-5">
								Cash:
								<form:radiobutton path="paymode" value="cash" id="paymode1" />
								Cheque:
								<form:radiobutton path="paymode" value="cheque" id="paymode2" />
							</div>
						</div>
						<div class="pmode">
							<div class="form-group">
								<label for="paymode" class="col-sm-2 control-label">Employee</label>
								<div class="col-sm-5">
									<form:input path="receipt" id="receipt" placeholder="receipt"
										cssClass="form-control" />
								</div>
							</div>
						</div>
						<div class="form-group">
							<div class="col-lg-offset-2 col-lg-10">
								<button type="submit" class="btn btn-primary">
									<spring:message code="label.addJobContract" />
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
