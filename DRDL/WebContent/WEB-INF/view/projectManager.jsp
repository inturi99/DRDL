<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Empoyee</title>
<link href="<c:url value="/resources/css/bootstrap.css" />"
	rel="stylesheet" type="text/css" />
<style>
.error {
	color: #ee0d25;
}
</style>

</head>
<body>
	<form:form method="post" action="addProjectManager"
		commandName="projectManager" class="form-horizontal">
		<div class="container">
			<div class="row">
				<div class="col-md-4 col-md-offset-4">
					<div class="login-panel panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">New Sign In</h3>
						</div>
						<div class="panel-body">
							<fieldset>
								<div class="form-group">
									<form:label class="col-lg-4 control-label" path="name">
										<spring:message code="label.name" />
									</form:label>
									<div class="col-sm-6">
										<form:input path="name" placeholder="name"
											cssClass="form-control" />
									</div>
									<form:errors path="name" cssClass="error" />
								</div>

								<div class="form-group">
									<form:label class="col-lg-4 control-label" path="password">
										<spring:message code="label.password" />
									</form:label>
									<div class="col-sm-6">
										<form:input path="password" type="password"
											placeholder="password" cssClass="form-control" />
									</div>
									<form:errors path="password" cssClass="error" />
								</div>
								<div class="form-group">
									<form:label class="col-lg-4 control-label" path="designation">
										<spring:message code="label.designation" />
									</form:label>
									<div class="col-sm-6">
										<form:input path="designation" placeholder="designation"
											cssClass="form-control" />
									</div>
									<form:errors path="designation" cssClass="error" />
								</div>
								<div class="form-group">
									<form:label class="col-lg-4 control-label" path="email">
										<spring:message code="label.email" />
									</form:label>
									<div class="col-md-6">
										<form:input path="email" placeholder="email"
											cssClass="form-control" />
									</div>
									<form:errors path="email" cssClass="error" />
								</div>
								<div class="form-group">
									<form:label class="col-lg-4 control-label" path="phoneNumber">
										<spring:message code="label.phoneNumber" />
									</form:label>
									<div class="col-lg-6">
										<form:input path="phoneNumber" placeholder="phoneNumber"
											cssClass="form-control" />
									</div>
									<form:errors path="phoneNumber" cssClass="error" />
								</div>
								<div class="form-group">
									<form:label class="col-lg-4 control-label" path="project">
										<spring:message code="label.project" />
									</form:label>
									<div class="col-lg-6">
										<form:input path="project" placeholder="project"
											cssClass="form-control" />
									</div>
									<form:errors path="project" cssClass="error" />
								</div>
							</fieldset>
							<div class="form-group">
								<div class="col-lg-offset-2 col-lg-10">
									<button type="submit" class="btn btn-primary">
										<spring:message code="label.addProjectManager" />
									</button>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</form:form>

</body>
</html>
