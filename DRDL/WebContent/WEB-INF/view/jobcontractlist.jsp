<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>
<html>
<head>
    <title>Job Contract List</title>
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
<jsp:include page="header.jsp"/>
<jsp:include page="menu.jsp"/>
<div style="padding: 25px">
    <a href="addJobContract" class="btn btn-primary">
    <span class="glyphicon glyphicon-plus"></span>
    Job Contract Employee</a>
<div class="table-responsive">
<c:if test="${!empty jcList}">
    <table class="table table-striped table-bordered">
        <thead class="table-head">
        <tr>
            <th class="text-center">REQUISITION CODE</th>
            <th class="text-center">REQUISITION DATE</th>
            <th class="text-center">DATE OF JOB COMPLETION</th>
            <th class="text-center">AMOUNT</th>
           <th class="text-center">RECIPT NO</th>
            <th class="text-center">PAYMENT MODE</th>
            
            <th></th>
            <th></th>
        </tr>
        </thead>
        <c:forEach items="${jcList}" var="jobContractDto">
            <tr>
                <td align="center">${jobContractDto.jcpropcd} </td>
                <td align="center"> <fmt:formatDate value="${jobContractDto.pdate}" pattern="dd/MM/yyyy"/></td>
                 <td align="center"> <fmt:formatDate value="${jobContractDto.jcdate}" pattern="dd/MM/yyyy"/></td>
                <td align="center">${jobContractDto.amt} </td>
                <td align="center">${jobContractDto.receipt}</td>
               <td align="center">${jobContractDto.paymode} </td>
                 <td align="center"><a href="editjobcontract?id=${jobContractDto.id}"><span class="glyphicon glyphicon-edit"></span></a></td>
                <td align="center"><a href="deletejobcontract/${jobContractDto.id}"><span class="glyphicon glyphicon-remove"></span></a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</div>
</div>
</body>
</html>
