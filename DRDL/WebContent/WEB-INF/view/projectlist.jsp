<%@ include file="pageCashing.jsp"%>
<html>
<head>
<title>ProjectManger List</title>	
</head>
<body>
	<jsp:include page="header.jsp"/>
    <jsp:include page="menu.jsp"/>

		<div style="padding: 25px">
			<a href="addProject" class="btn btn-primary"> <span
				class="glyphicon glyphicon-plus"></span> Project
			</a>
			<div class="table-responsive">
				<c:if test="${!empty pList}">
					<table class="table table-striped table-bordered">
						<thead class="table-head">
							<tr>
								<th class="text-center">Project Code</th>
								<th class="text-center">Project Name</th>
								<th class="text-center">Project Director</th>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<c:forEach items="${pList}" var="projectDto">
							<tr>
								<td align="center">${projectDto.projectCode}</td>
								<td align="center">${projectDto.projectName}</td>
								<td align="center">${projectDto.projectDirector}</td>
								<td align="center"><a
									href="editProject?projectId=${projectDto.projectId}"><span
										class="glyphicon glyphicon-edit"></span></a></td>
								<td align="center"><a
									href="deleteProject/${projectDto.projectId}"><span
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
