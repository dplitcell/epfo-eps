<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Application Status</title>
</head>
<body>


<table width="81%" border="1">
      <tr>
        <td height="43" colspan="2"><div align="center"><span class="style1"></span><span class="style2">Application Status </span></div>      
      </tr>
      <tr>
        <td width="39%"><span class="style4">Application Status:
        </span>
        <td width="61%"><c:out value="${status}" /></td>
      </tr>
</body>
</html>