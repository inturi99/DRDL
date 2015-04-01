<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>
<core:forEach items="${pdsanction}" var="pdsanctionDto">
					<tr>
						 <td align="center">${pdsanctionDto.propcode} </td>
                <td align="center">${pdsanctionDto.natureofjob} </td>
                <td align="center">${pdsanctionDto.amount} </td>
                <td align="center">${pdsanctionDto.demandingofficer}</td>
                   <td align="center"> <fmt:formatDate value="${pdsanctionDto.date}" pattern="dd/MM/yyyy"/></td>
                     <td align="center">${pdsanctionDto.pddecision} </td>
					  <td align="center"><a href="report/pdsanction/${pdsanctionDto.id}"><span class="glyphicon glyphicon-download"></span></a></td>
					</tr>
				</core:forEach>

