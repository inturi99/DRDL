<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>

<core:forEach items="${employees}" var="employee">
					<tr>
						<td>${employee.id}</td>
						<td>${employee.name}</td>
						
					</tr>
				</core:forEach>

