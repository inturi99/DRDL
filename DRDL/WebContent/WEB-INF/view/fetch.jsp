<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<core:forEach items="${employees}" var="employeeDto">
	<tr>
		<td align="center"><span>Employee Id :</span>${employeeDto.id}</td>
		<td align="center"><span>Employee Name :</span>${employeeDto.name}</td>
	</tr>
</core:forEach>
<td align="center">Month</td>
<td align="center">Days Present</td>
<td align="center">Salary</td>
<core:forEach items="${attendence}" var="attendenctDto">
	<tr>
		<td align="center"><fmt:formatDate value="${attendenctDto.date}"
				pattern="MMM/yyyy" /></td>
		<td align="center">${attendenctDto.prasent}</td>
		<td align="center">${attendenctDto.salary}</td>
		<td align="center"><fmt:formatDate value="${attendenctDto.dateIncr}"
				pattern="dd/MM/yyyy" /></td>
		<td align="center">${attendenctDto.increment}</td>
		</tr>
</core:forEach>
<td align="center">Employee</td>
<core:forEach items="${increments}" var="incrementsDto">
	<tr>
		<td align="center"><fmt:formatDate value="${incrementsDto.dateIncr}"
				pattern="dd/MM/yyyy" /></td>
		<td align="center">${incrementsDto.increment}</td>
		</tr>
</core:forEach>

