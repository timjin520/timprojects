<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="https://unpkg.com/react@17/umd/react.development.js"
	crossorigin></script>
<script
	src="https://unpkg.com/react-dom@17/umd/react-dom.development.js"
	crossorigin></script>
<script src="https://unpkg.com/@babel/standalone/babel.min.js"></script>

<meta charset="ISO-8859-1">
<title>List of Employees</title>
</head>

<body>

<h1>Edit Employee Page</h1>


<form:form  modelAttribute="registerCmd">
            
            
            <a href="addNewEmployee.html">Go Back</a>
<table border='1' style='border-collapse:collapse'>
	<tr>
		<th>Select</th>
		<th>Name</th>
		<th>Date</th>
		<th>Full/Part Time</th>
		<th>Is Manager</th>
	</tr>
	<!-- the items='..' should be the same name as trom the modelAndView in controller. Var employee is what use in the td -->
	<c:forEach items="${registerCmd.allEmployees}" var="employee">
   <tr>
   
    <td><form:radiobutton path="employee.id" value="${employee.id}" name="selectEmployee" /></td>
   	<td>${employee.name}</td> 
   	<td>${employee.date}</td> 
   	<td>${employee.time}</td> 
   	<td>${employee.manager} </td>
   </tr>
   
</c:forEach>
</table>

 <input type="submit" value="Delete" />
</form:form>

<script type="text/javascript" src="/js/empApp.js">
    </script>
</body>
</html>



