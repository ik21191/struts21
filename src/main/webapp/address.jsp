<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- Using Struts2 Tags in JSP --%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Login Page</title>
</head>
<body>
<s:form action="address-action">
<s:textfield name="street" label="Enter Street Number"/><br/>
<s:textfield name="city" label="Enter City"/><br/>
<s:textfield name="xyzName" label="Xyz Name"/><br/>
<s:submit value="Add Address"/>
</s:form>
</body>
</html>