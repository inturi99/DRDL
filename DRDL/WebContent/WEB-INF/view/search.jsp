<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>
<core:forEach items="${employees}" var="employeeDto">
					<tr>
						 <td align="center">${employeeDto.emptype} </td>
                <td align="center">${employeeDto.employeeNumber} </td>
                <td align="center">${employeeDto.name} </td>
                <td align="center">${employeeDto.email}</td>
                 <%--  <td align="center">${employeeDto.dob}</td> --%>
                   <td align="center"> <fmt:formatDate value="${employeeDto.dob}" pattern="dd/MM/yyyy"/></td>
            
                     <td align="center">${employeeDto.qual} </td>
					  <td align="center"><a href="edit?id=${employeeDto.id}"><span class="glyphicon glyphicon-edit"></span></a></td>
                <td align="center"><a href="delete/${employeeDto.id}"><span class="glyphicon glyphicon-remove"></span></a></td>
          	  <td align="center"><a href="dowanload/${employeeDto.id}"><span class="glyphicon glyphicon-download"></span></a></td>
					</tr>
				</core:forEach>

