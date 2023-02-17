<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>

input { font-size: 20px; }
table {
  background-color:#DDAF72;
   color:#fff;
   padding:2px 5px;
   border:5px solid #151515;
   -webkit-border-radius: 15px;

}
input[type="text"], textarea {

  background-color:#A4A7AA;
   color:#090909;
   padding:2px 5px;
   border:5px solid #151515;
   -webkit-border-radius: 15px;

}



.style4 {font-size: 20px}
</style>
<title>Insert title here</title>
</head>
<body background="images/bc.jpeg">

<p><br>
  
<p>&nbsp;</p>

<table width="50%" border="1" align="center">
  <tr>
    <th>Employee Number</th>
    <th>Employee Name</th>
    
    
    
   
       
    
    
    
    <c:forEach var="msg" items="${list}">
  <tr>
                   <td><a href="receipt_print.dpl?emp_no=${msg.empNo}">${msg.empNo}</a></td>
                   <td>${msg.empName}</td>
                   
                  
                   
                   
                   
  </tr>
            </c:forEach>  
</table>

</body>
</html>