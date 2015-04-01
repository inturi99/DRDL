<%@ include file="pageCashing.jsp"%>
<html>
<head>
    <title>PDsanction List</title>	
</head>
<body>
<jsp:include page="header.jsp"/>
<jsp:include page="menu.jsp"/>
<div style="padding: 25px">
    <a href="addPdSanction" class="btn btn-primary">
    <span class="glyphicon glyphicon-plus"></span>
    pdsanction</a>
<div class="table-responsive">
<c:if test="${!empty pdList}">
    <table class="table table-striped table-bordered">
        <thead class="table-head">
        <tr>
            <th class="text-center">Prop Code</th>
            <th class="text-center">Demanding Officer</th>
                        <th class="text-center">Nature of Job</th>
                                    <th class="text-center">Amount</th>
                                    <th class="text-center">Sanction code</th>
            <th class="text-center">Date</th>
           <th class="text-center">PddecisIon</th>
           <th class="text-center">Remarks</th>
           <th class="text-center">Description</th>
            
            <th>Edit</th>
        </tr>
        </thead>
        <c:forEach items="${pdList}" var="pdSanctionDto">
            <tr>
                <td align="center">${pdSanctionDto.propcode} </td>
                <td align="center">${pdSanctionDto.demandingofficer} </td>
                <td align="center">${pdSanctionDto.natureofjob} </td>
                <td align="center">${pdSanctionDto.amount}</td>
                 <td align="center">${pdSanctionDto.sanctioncode}</td>
                  <td align="center"> <fmt:formatDate value="${pdSanctionDto.date}" pattern="dd/MM/yyyy"/></td>
            
                 <td align="center">${pdSanctionDto.pddecision}</td>
                                  <td align="center">${pdSanctionDto.remarks}</td>
                                  <td align="center">${pdSanctionDto.description}</td>
                 
              <td align="center"><a href="editPdSanction?id=${pdSanctionDto.id}"><span class="glyphicon glyphicon-edit"></span></a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</div>
</div>
</body>
</html>
