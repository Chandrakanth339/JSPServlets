<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<strong>Context-Initialized Parameters</strong> ${initParam}<br>
	<strong>Header params with Array Index</strong>${header["User-Agent"]}<br>
	<strong>Full Header Param</strong>${header}<br>
	<strong>Application Scope Parameters</strong>${cookie}
	<strong>Session Attribute</strong>${sessionScope.sa.strField}<br>
	<strong>Session Attribute</strong>${requestScope.initParam}
	<strong></strong>
</body>
</html>