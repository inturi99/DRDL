<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<html>
<head>
<title>ProjectManger List</title>
<script src="./resources/js/jquery-1.9.1.min.js" type="text/javascript"></script>
 <script src="./resources/js/jquery-ui-1.10.2.smoothness.min.js" type="text/javascript"></script>
 <script src="./resources/js/jquery-validate.min.js" type="text/javascript"></script>

 <link href="<c:url value="/resources/css/bootstrap.css" />"
	rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/css/fileinput.min.css" />"
	rel="stylesheet" type="text/css" />
<script src="./resources/js/fileinput.min.js" type="text/javascript"></script>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet" type="text/css" />
<script src="./resources/js/bootstrap.min.js" type="text/javascript"></script>
<script src="./resources/js/bootstrap-submenu.min.js"
	type="text/javascript"></script>
	<link href="<c:url value="/resources/css/bootstrap-submenu.min.css" />"
	rel="stylesheet" type="text/css" />
<script src="./resources/js/bootstrap-submenu.js"
	type="text/javascript"></script>
	<script src="./resources/js/submenu.js"
	type="text/javascript"></script>
	<link href="<c:url value="/resources/css/submenu.css" />"
	rel="stylesheet" type="text/css" />
	<link href="<c:url value="/resources/css/bootstrap-submenu.css" />"
	rel="stylesheet" type="text/css" />
	
</head>
<body>
	<jsp:include page="header.jsp"/>
    <jsp:include page="menu.jsp"/>

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
