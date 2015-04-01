<%@ include file="pageCashing.jsp"%>
<html>
<head>
    <title>SoClearence List</title>	
</head>
<body>
<jsp:include page="header.jsp"/>
<jsp:include page="menu.jsp"/>
<div style="padding: 25px">
    <a href="addSoClearence" class="btn btn-primary">
    <span class="glyphicon glyphicon-plus"></span>
    Clearence</a>
<div class="table-responsive">
<c:if test="${!empty soList}">
    <table class="table table-striped table-bordered">
        <thead class="table-head">
        <tr>
            <th class="text-center">Prop Code</th>
            <th class="text-center">Demanding Officer</th>
                        <th class="text-center">Nature of Job</th>
                                    <th class="text-center">Amount</th>
            <th class="text-center">Date</th>
           <th class="text-center">SodecisIon</th>
            
            <th>Edit</th>
        </tr>
        </thead>
        <c:forEach items="${soList}" var="soClearenceDto">
            <tr>
                <td align="center">${soClearenceDto.propcode} </td>
                <td align="center">${soClearenceDto.demandingofficer} </td>
                <td align="center">${soClearenceDto.natureofjob} </td>
                <td align="center">${soClearenceDto.amount}</td>
                  <td align="center"> <fmt:formatDate value="${soClearenceDto.date}" pattern="dd/MM/yyyy"/></td>
            
                 <td align="center">${soClearenceDto.sodecision}</td>
              <td align="center"><a href="editSoClearence?id=${soClearenceDto.id}"><span class="glyphicon glyphicon-edit"></span></a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</div>
</div>
</body>
</html>
