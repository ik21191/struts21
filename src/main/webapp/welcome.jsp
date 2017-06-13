<%@page import="mypack.constants.Constants"%>
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
<s:if test="hasActionMessages()">
   
      <s:actionmessage/>
   
</s:if>
<br/>
<s:if test="hasActionErrors()">
      <s:actionerror/>
</s:if>
<s:set var="varTest"> <%= Constants.appName %> </s:set>
<br/>
Display Scriptlet tag value way 1: <s:property value="%{#varTest}"/> <br/>
Display Scriptlet tag value way 2: <s:property value="%{varTest}"/> <br/>
Display Scriptlet tag value way 3: <s:property value="#varTest"/> <br/>
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
	
	<s:hidden name="updatedStudentList[%{#count.index}].name" value="%{name}" />
	<s:hidden name="updatedStudentList[%{#count.index}].address.street" value="%{address.street}" />
	<input type="text" value='<s:property value="name"/>'/><br/>
	<input type="text" value='<s:property value="%{name}"/>'/>
</s:iterator>
<input type="text" />
	<s:submit value="Submit"/>
</s:form>

<s:if test="%{studentList.isEmpty()}">


</s:if>
<s:else>
dkjdj ll djl dl j

</s:else>
<br/>Display List<br/>
<s:form action="list1">
<s:iterator value="studentList" status="count">
	
	<s:checkbox name="aa" fieldValue="%{name}"/>

</s:iterator>
<s:submit/>
</s:form>
<br/><br/>

Display images.<br/>


<img height="20%" width="20%" alt title="This is test" src="http://localhost:5555/images/banner/i1.png"/><br/>
<img height="20%" width="20%" alt title="This is test" src="http://localhost:5555/images/products/i1.png"/><br/>


</body>
</html>