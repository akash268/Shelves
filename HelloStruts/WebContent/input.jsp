<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Input Page</title>
</head>
<body>
	<form action="output.do">
		 <html:errors/>
		to: <html:text property="to" value="${outputForm.to}"/>&nbsp;&nbsp;&nbsp; 
		from: <html:text property="from" value="${outputForm.from}"/>&nbsp;&nbsp;&nbsp; 
		req: <html:text property="req" value="${outputForm.req}"/><br>
		<br> <input type="submit" value="Place Order">
	</form>
</body>
</html>