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
<s:iterator value="studentList">
	
	<s:property value="name"/>
	<s:property value="address.street"/><br/>

</s:iterator>
</body>
</html>