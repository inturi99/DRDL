<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Employee List</title>
    <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="page-header">
   <h1 align="center">DRDL   
   </h1>
   <ul class="nav nav-tabs">
   <li><a href="#">MASTERS</a></li>
   <li><a href="#">TRANSACTIONS</a></li>
   <li><a href="#">DECISION</a></li>
   <li><a href="#">QUERY FORMS</a></li>
   <li><a href="#">REPORTS</a></li>
   <li><a href="#">EXIT</a></li>
    <li><a href="list">EMPLOYEE</a></li>
   </ul>
<div style="padding: 25px">
    <a href="addEmployee" class="btn btn-primary">
    <span class="glyphicon glyphicon-plus"></span>
    Employee</a>
<div class="table-responsive">
<c:if test="${!empty employeeList}">
    <table class="table table-striped table-bordered">
        <thead class="table-head">
        <tr>
            <th class="text-center">Name</th>
            <th class="text-center">Email</th>
          <th class="text-center">Date Of Birth</th>
            <th class="text-center">Qualififaction</th>
            <th class="text-center">lab</th>
            <th></th>
            <th></th>
        </tr>
        </thead>
        <c:forEach items="${employeeList}" var="employee">
            <tr>
                <td align="center">${employee.name} </td>
                <td align="center">${employee.email}</td>
                  <td align="center">${employee.dob}</td>
               <td align="center">${employee.qual} </td>
                <td align="center">${employee.lab}</td>
               
              
                 <td align="center"><a href="edit?id=${employee.id}"><span class="glyphicon glyphicon-edit"></span></a></td>
                <td align="center"><a href="delete/${employee.id}"><span class="glyphicon glyphicon-remove"></span></a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</div>
</div>
</div>
</body>
</html>
