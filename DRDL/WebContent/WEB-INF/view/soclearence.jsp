<%@ include file="pageCashing.jsp"%>
<html>
<head>
<title>So Clearence</title>
<script type="text/javascript">
            // When the document is ready
            $(document).ready(function () {
                $('#date').datepicker({
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
	<jsp:include page="header.jsp" />
	<jsp:include page="menu.jsp" />
	<div class="container">
		<div class="col-sm-offset-1 col-sm-10">
			<div class="panel panel-primary ">
				<div class="panel-heading">
					<h4 class=" panel-title text-center">Add</h4>
				</div>
				<div class="panel-body">
					<form:form method="post" action="addSoClearence"
						commandName="soClearenceDto" cssClass="form-horizontal">
						<div class="form-group">
							<label for="propcode" class="col-sm-2 control-label">Prop
								Code</label>
							<div class="col-sm-4">
								<form:select path="propcode"
										cssClass="form-control" >
										<form:option label="-- Select ProjectManager Code --" value="-1" />
				               <form:options items="${jcList}" itemLabel="jcpropcd"
					                   itemValue="jcpropcd" />
										</form:select>
							</div>
						</div>
						<div class="form-group">
							<label for="demandingofficer" class="col-sm-2 control-label">Demanding
								Officer</label>
							<div class="col-sm-4">
								<form:input path="demandingofficer" 
									placeholder="demandingofficer" cssClass="form-control" />
							</div>
						</div>
				
				<div class="form-group">
					<label for="natureofjob" class="col-sm-2 control-label">Nature
						of Job</label>
					<div class="col-sm-10">
						<form:input path="natureofjob" placeholder="natureofjob"
							cssClass="form-control" />
					</div>
				</div>
				<div class="form-group">
					<label for="amount" class="col-sm-2 control-label">Amount</label>
					<div class="col-sm-4">
						<form:input path="amount" placeholder="Amount"
							cssClass="form-control" />
					</div>

				</div>

				<div class="form-group">
					<label for="date" class="col-sm-2 control-label">DATE</label>
					<div class="col-sm-4">
						<form:input path="date" id="date" placeholder="date"
							cssClass="form-control" />
					</div>

				</div>
				<div class="form-group">
					<label for="sodecision" class="col-sm-2 control-label">Decison
						of Scruiting Officer</label>
						<div class="col-sm-4">
									Yes:<form:radiobutton path="sodecision" value="Yes" id="sodecision"/>
									No:<form:radiobutton path="sodecision" value="No" id="sodecision" />	
								</div>
				</div>
				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<button type="submit" class="btn btn-primary">
							<spring:message code="label.addsoclearence" />
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
