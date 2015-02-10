<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Login</title>
<link href="<c:url value="/resources/css/bootstrap.css" />"
	rel="stylesheet" type="text/css" />
<style>
.error {
	color: #ee0d25;
}
</style>

</head>
<body>
	<form:form method="post" action="login" commandName="projectManager"
		class="form-horizontal">
		<div class="container">
			<div class="panel panel-primary modal-dialog ">
				<div class="panel-heading">
					<h3 class="text-center">Sign In</h3>
				</div>
				<div class="panel-body">

					<div class="form-group">
						<form:label class="col-md-12" path="name">
							<spring:message code="label.name" />
						</form:label>
						<div class="input-group col-sm-10">
							<span class="input-group-addon glyphicon  glyphicon-user"></span>
							<form:input path="name" placeholder="name" autofocus="autofocus"
								cssClass="form-control" />
						</div>

					</div>
					<div class="form-group">
						<form:label class="col-md-12" path="password">
							<spring:message code="label.password" />
						</form:label>
						<div class="input-group col-sm-10">
							<span class="input-group-addon glyphicon  glyphicon-lock"></span>
							<form:input path="password" type="password"
								placeholder="password" autofocus="autofocus"
								cssClass="form-control" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-lg-offset-2 col-lg-10">
							<a href="addProjectManager" class="btn btn-primary">New Sign
								In</a>
							<button type="submit" class="btn btn-primary">
								<spring:message code="label.projectManagerLogin" />
							</button>
						</div>

						<form:errors path="name" cssClass="error" />
						<form:errors path="password" cssClass="error" />

					</div>
				</div>
			</div>
		</div>
	</form:form>

</body>
</html>
