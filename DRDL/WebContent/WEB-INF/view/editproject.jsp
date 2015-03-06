<%@ include file="pageCashing.jsp"%>
<html>
<head>
<title>Edit Project  </title>
 

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
<jsp:include page="header.jsp"/>
<jsp:include page="menu.jsp"/>
	<div class="container">
		<div class="col-sm-offset-1 col-sm-10">

			<div class="panel panel-primary ">
				<div class="panel-heading">
					<h4 class=" panel-title text-center">Edit Project</h4>
				</div>
				<div class="panel-body">
					<c:url var="saveUrl" value="editProject?projectId=${projectDto.projectId}" />
					<form:form modelAttribute="projectDto" method="post"
						action="${saveUrl}" cssClass="form-horizontal">
				<div class="form-group">
								<label for="projectCode" class="col-sm-2 control-label">project Code
									</label>
								<div class="col-sm-4">
									<form:input path="projectCode" placeholder="Project Code"
										cssClass="form-control" />
								</div>
							</div>
							<div class="form-group">
								<label for="projectName" class="col-sm-2 control-label">Project Name </label>
								<div class="col-sm-4">
									<form:input path="projectName" placeholder="Project Name"
										cssClass="form-control" />
								</div>
							</div>
							
							<div class="form-group">
								<label for="projectDirector" class="col-sm-2 control-label">Project Director</label>
								<div class="col-sm-4">
									<form:input path="projectDirector" placeholder="Project Director"
										cssClass="form-control" />
								</div>
							</div>
						<div class="form-group">
								<div class="col-lg-offset-2 col-lg-10">
									<button type="submit" class="btn btn-primary">
										<spring:message code="label.updateProject" />
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
