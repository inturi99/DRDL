<%@ include file="pageCashing.jsp"%>
<html>
<head>
<title>Vendor List</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<jsp:include page="menu.jsp" />
		<div style="padding: 25px">
			<a href="addVendor" class="btn btn-primary"> <span
				class="glyphicon glyphicon-plus"></span> Vendor
			</a>
			<div class="table-responsive">
				<c:if test="${!empty venList}">
					<table class="table table-striped table-bordered">
						<thead class="table-head">
							<tr>
								<th class="text-center">Vendor Code</th>
								<th class="text-center">Name</th>
								<th class="text-center">Address</th>
								<th class="text-center">Phone Number</th>
								<th class="text-center">Status</th>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<c:forEach items="${venList}" var="vendorDto">
							<tr>
								<td align="center">${vendorDto.vendorCode}</td>
								<td align="center">${vendorDto.vendorName}</td>
								<td align="center">${vendorDto.address}</td>
								<td align="center">${vendorDto.phoneNumber}</td>
								<td align="center">${vendorDto.status}</td>
								<td align="center"><a
									href="editVendor?id=${vendorDto.id}"><span
										class="glyphicon glyphicon-edit"></span></a></td>
								<td align="center"><a
									href="deleteVendor/${vendorDto.id}"><span
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
