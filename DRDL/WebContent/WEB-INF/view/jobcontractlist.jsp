<%@ include file="pageCashing.jsp"%>
<html>
<head>
    <title>Job Contract List</title>
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
