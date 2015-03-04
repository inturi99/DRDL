<%@ include file="pageCashing.jsp"%>
<html>
<head>
    <title>Employee List</title>	
</head>
<body>
<jsp:include page="header.jsp"/>
<jsp:include page="menu.jsp"/>
<div style="padding: 25px">
    <a href="addEmployee" class="btn btn-primary">
    <span class="glyphicon glyphicon-plus"></span>
    Employee</a>
<div class="table-responsive">
<c:if test="${!empty employeeList}">
    <table class="table table-striped table-bordered">
        <thead class="table-head">
        <tr>
            <th class="text-center">Employee Type</th>
            <th class="text-center">Emp NO</th>
            <th class="text-center">Name</th>
            <th class="text-center">Email</th>
           <th class="text-center">Date Of Birth</th>
            <th class="text-center">Qualififaction</th>
            
            <th></th>
            <th></th>
        </tr>
        </thead>
        <c:forEach items="${employeeList}" var="employeeDto">
            <tr>
                <td align="center">${employeeDto.emptype} </td>
                <td align="center">${employeeDto.employeeNumber} </td>
                <td align="center">${employeeDto.name} </td>
                <td align="center">${employeeDto.email}</td>
                 <%--  <td align="center">${employeeDto.dob}</td> --%>
                   <td align="center"> <fmt:formatDate value="${employeeDto.dob}" pattern="dd/MM/yyyy"/></td>
            
               <td align="center">${employeeDto.qual} </td>
               
               
              
                 <td align="center"><a href="edit?id=${employeeDto.id}"><span class="glyphicon glyphicon-edit"></span></a></td>
                <td align="center"><a href="delete/${employeeDto.id}"><span class="glyphicon glyphicon-remove"></span></a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</div>
</div>
</body>
</html>
