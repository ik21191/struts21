<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- Using Struts2 Tags in JSP --%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Welcome Page</title>
</head>
<body>
Welcome, <b><s:property value="name" /></b><br/>Address Result<br/><br/>
Street,<s:property value="street"/><br/>
City,<s:property value="city"/><br/><br/>

Displaying Student list<br/>
<s:iterator value="studentList" status="count">
	
	<s:property value="name"/>
	<s:property value="address.street"/>  <s:property value = "%{#count.index}" /><br/>

</s:iterator>

<s:form action="updatedList">
<s:iterator value="studentList" status="count">
	
	<s:hidden name="updatedStudentList[%{#count.index}].name" value="name" />
	<s:hidden name="updatedStudentList[%{#count.index}].address.street" value="address.street" />
	<input type="text" />
	
</s:iterator>
</s:form>

<s:if test="%{studentList.isEmpty()}">


</s:if>
<s:else>
dkjdj ll djl dl j

</s:else>
</body>
</html>