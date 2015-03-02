<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>
<html>
<head>
    <title>Employee List</title>
 <!-- <script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
  -->
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
   <h1  align="center" style="font-family: serif; color:#357ebd;">Defence Research and Development Organization
		</h1>  
  
   </div>
   <div>
   <ul class="nav nav-tabs" style="margin-top: -25px">
    <li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">MASTERS <span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="pmList">PROJECT MANAGER DETAILS </a></li>
					<li><a href="venList">VENDOR DETAILS</a></li>
					<li><a href="#">CONT EMPLOYES DETAILS</a></li>
					<li><a href="#">ADD ON.OF DAYS PER MONTH </a></li>					
				</ul></li>
				<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">TRANSACTIONS <span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="pmList">JOB CONTRACT PROPOSALS </a></li>	
					<li><a href="addAttendance">Monthly Employee Attendance  </a></li>								
				</ul></li>
			
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">DECISION <span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="pmList">JOB CONTRACT </a></li>
					<li><a href="#">SALARY</a></li>										
				</ul></li>
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">QUERY FORMS <span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="pmList">JOB CONTRACT </a></li>
					<li><a href="#">DECISION MAKING</a></li>										
				</ul></li>
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">REPORTS<span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="pmList">JOB CONTRACT </a></li>
					<li><a href="#">STATUS REPORT</a></li>
					<li><a href="#">SELECT PROJECT</a></li>
					<li><a href="#">SALARY FULL LIST </a></li>					
				</ul></li>
   <li><a href="#">EXIT</a></li>
    <li><a href="list">EMPLOYEE</a></li>
   </ul>
<div style="padding: 25px">
    <a href="addEmployee" class="btn btn-primary">
    <span class="glyphicon glyphicon-plus"></span>
    Employee</a>
<div class="table-responsive">
<c:if test="${!empty contrList}">
    <table class="table table-striped table-bordered">
        <thead class="table-head">
        <tr>
             <th class="text-center">Employee Type</th>
            <th class="text-center">Name</th>
            <th class="text-center">Email</th>
          <th class="text-center">Date Of Birth</th>
            <th class="text-center">Qualification</th>
            <th></th>
            <th></th>
        </tr>
        </thead>
        <c:forEach items="${contrList}" var="employeeDto">
            <tr>
                <td align="center">${employeeDto.emptype} </td>
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
</div>
</body>
</html>
