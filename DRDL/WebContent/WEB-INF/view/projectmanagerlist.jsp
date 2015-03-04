<%@ include file="pageCashing.jsp"%>
<html>
<head>
<title>ProjectManger List</title>	
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
