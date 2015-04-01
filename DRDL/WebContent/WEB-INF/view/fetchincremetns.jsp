<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<core:forEach items="${employees}" var="employeeDto">
	<tr>
		<td align="center"><span>Employee Number :</span>${employeeDto.employeeNumber}</td>
		<td align="center"><span>Employee Name :</span>${employeeDto.name}</td>
	</tr>
</core:forEach>
<td align="center">Date</td>
<td align="center">Increments</td>
<core:forEach items="${increments}" var="incrementsDto">
 <tr>
		 <td align="center"><fmt:formatDate value="${incrementsDto.dateIncr}"
				pattern="dd/MM/yyyy" /></td>
		<td align="center">${incrementsDto.increment}</td>
	 </tr>
</core:forEach>
