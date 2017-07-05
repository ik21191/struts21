<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- Using Struts2 Tags in JSP --%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Register Page</title>
</head>
<body>
<h3>Please fill below details</h3><br/>
<s:form action="save">
    <s:textfield name="firstName" label="Enter Name"/>
    <s:textfield name="email" label="Enter Email"/>
    <s:textfield name="age" label="Enter age"/>
    <s:submit value="Save"></s:submit>
</s:form>
<!-- <br/>Below is HTML form<br/>
<form action="save">
    Enter Name:<input type="text" name="firstName"/><br/>
    Enter Email:<input type="text" name="email"/><br/>
    Enter Mobile: <input type="text" name="mobile"/><br/>
    <input type="submit" value="Save"/>
</form> -->
</body>
</html>