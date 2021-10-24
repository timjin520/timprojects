<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>

</head>
<body>
    <h1>Add new employee</h1>
        
    <form:form modelAttribute="form">
        <form:errors path="" element="div" />
        <div>
            <form:label path="name">Name: </form:label>
            <form:input path="name" />
            <form:errors path="name" />
            <br/>
            
             <form:label path="date">Date (MM/DD/YYYY): </form:label>
            <form:input path="date" />
            <form:errors path="date" />
            <br/>
            <form:label path="time">Part-Time or Full-Time: </form:label>
          	<form:select path="time"> 
	            <form:option value="Part-Time" label="Part-Time"/>  
	            <form:option value="Full-Time" label="Full-Time"/>  
             </form:select>
            <form:errors path="time" />
            
            <br/>
              <form:label path="manager">Manager Role: </form:label>
             <form:select path="manager"> 
	            <form:option value="true" label="true"/>  
	            <form:option value="false" label="false"/>  
             </form:select> 
            <form:errors path="manager" /> 
        </div>
        </br>
        <div>
            <input type="submit" /> 
        </div>
    </form:form>
    
    
    <br/>
    
    <%-- <form:form modelAttribute="deleteform">
    	<input type="submit">Delete all</input>
    </form:form> --%>
    
    
</body>
</html>
