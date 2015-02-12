<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
</head>
<body>
<div class="page-header">
   <h1 align="center">Defence Research and Development Organisation   
   </h1>
   <ul class="nav nav-tabs">
   <li class="dropdown" >
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">MASTERS
          <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="pmList">Project Manager </a></li>
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
    <a href="addProjectManager" class="btn btn-primary">
    <span class="glyphicon glyphicon-plus"></span>
    ProjectManager</a>
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
        <c:forEach items="${pmList}" var="projectManager">
            <tr>
                <td align="center">${projectManager.pmcode} </td>
                <td align="center">${projectManager.name}</td>
                  <td align="center">${projectManager.grade}</td>
               <td align="center">${projectManager.designation} </td>
               <td align="center">${projectManager.phoneNumber}</td>
                <td align="center">${projectManager.email}</td>
                <td align="center">${projectManager.dob}</td>
               
              
              
                 <td align="center"><a href="editProjectManager?id=${projectManager.id}"><span class="glyphicon glyphicon-edit"></span></a></td>
                <td align="center"><a href="deleteProjectManager/${projectManager.id}"><span class="glyphicon glyphicon-remove"></span></a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</div>
</div>
</div>
</body>
</html>
