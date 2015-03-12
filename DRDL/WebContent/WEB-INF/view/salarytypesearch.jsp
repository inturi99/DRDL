<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>
<core:forEach items="${salarytypes}" var="salaryTypeDto">
					<tr>
						  <td align="center">${salaryTypeDto.employeeNumber} </td>
                         <td align="center">${salaryTypeDto.name} </td>
                     <td align="center"> <fmt:formatDate value="${salaryTypeDto.incrementDate}" pattern="dd/MM/yyyy"/></td>
                       <td align="center">${salaryTypeDto.increment} </td>
                     
                 <td align="center"><a href="edit?id=${employeeDto.id}"><span class="glyphicon glyphicon-edit"></span></a></td>
                <td align="center"><a href="delete/${employeeDto.id}"><span class="glyphicon glyphicon-remove"></span></a></td>
          	    <td align="center"><a href="dowanload/${employeeDto.id}"><span class="glyphicon glyphicon-download"></span></a></td>
					</tr>
				</core:forEach>

