<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<html>
<head>
<title>ProjectManger List</title>
<script src="./resources/js/jquery-1.9.1.min.js" type="text/javascript"></script>
<script src="./resources/js/jquery-ui-1.10.2.smoothness.min.js"
	type="text/javascript"></script>
<script src="./resources/js/jquery-validate.min.js"
	type="text/javascript"></script>

<script src="./resources/js/bootstrap-submenu.js" type="text/javascript"></script>
<script src="./resources/js/bootstrap-submenu.min.js"
	type="text/javascript"></script>

<link href="<c:url value="/resources/css/bootstrap.css" />"
	rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/css/fileinput.min.css" />"
	rel="stylesheet" type="text/css" />

<link href="<c:url value="/resources/css/bootstrap-submenu.css" />"
	rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/css/bootstrap-submenu.min.css" />"
	rel="stylesheet" type="text/css" />
	

<script src="./resources/js/fileinput.min.js" type="text/javascript"></script>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet" type="text/css" />
<script src="./resources/js/bootstrap.min.js" type="text/javascript"></script>
</head>
<body>
	<div class="page-header" style="margin-top: 0px">
		<h1  align="center" style="font-family: serif; color:#357ebd;">Defence Research and Development Organization
		</h1>
		</div>
		<ul class="nav nav-tabs" style="margin-top: -25px">
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">MASTERS <span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li class="dropdown-submenu"><a href="pmList" class="dropdown-toggle" data-toggle="dropdown">Project Manager </a>
						<ul class="dropdown-menu">
							<li><a href="#">Submenu1</a></li>
							<li><a href="#">Submenu2</a></li>
						</ul>
					</li>
					<li><a href="#">Page 1-2</a></li>
					<li><a href="#">Page 1-3</a></li>
				</ul>
			</li>
			<li><a href="#">TRANSACTIONS</a></li>
			<li><a href="#">DECISION</a></li>
			<li><a href="#">QUERY FORMS</a></li>
			<li><a href="#">REPORTS</a></li>
			<li><a href="#">EXIT</a></li>
			<li><a href="list">EMPLOYEE</a></li>
		</ul>
		<div style="padding: 25px">
			<a href="addProjectManager" class="btn btn-primary"> <span
				class="glyphicon glyphicon-plus"></span> ProjectManager
			</a>
			<div class="table-responsive">
				<c:if test="${!empty pmList}">
					<table class="table table-striped table-bordered">
						<thead class="table-head">
							<tr>
								<th class="text-center">Code</th>
								<th class="text-center">Name</th>
								<th class="text-center">Grade</th>
								<th class="text-center">Designation</th>
								<th class="text-center">Phone Number</th>
								<th class="text-center">E-mail</th>
								<th class="text-center">Date Of Birth</th>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<c:forEach items="${pmList}" var="projectManagerDto">
							<tr>
								<td align="center">${projectManagerDto.pmcode}</td>
								<td align="center">${projectManagerDto.name}</td>
								<td align="center">${projectManagerDto.grade}</td>
								<td align="center">${projectManagerDto.designation}</td>
								<td align="center">${projectManagerDto.phoneNumber}</td>
								<td align="center">${projectManagerDto.email}</td>
								<%-- <td align="center">${projectManagerDto.dob}</td> --%>
								<td align="center"><fmt:formatDate
										value="${projectManagerDto.dob}" pattern="dd/MM/yyyy" /></td>
								<td align="center"><a
									href="editProjectManager?id=${projectManagerDto.id}"><span
										class="glyphicon glyphicon-edit"></span></a></td>
								<td align="center"><a
									href="deleteProjectManager/${projectManagerDto.id}"><span
										class="glyphicon glyphicon-remove"></span></a></td>
							</tr>
						</c:forEach>
					</table>
				</c:if>
			</div>
		</div>
	</div>
</body>
</html>
