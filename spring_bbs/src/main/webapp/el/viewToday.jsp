<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="el.DateUtil" %>    
<%@ taglib prefix="elfunc" uri="/ELFunctions" %>
<% 
    java.util.Date today = new java.util.Date(); 
    request.setAttribute("today", today); 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
오늘은 <b>${elfunc:dateFormat(today) }</b> 입니다. 
오늘은  <b><%=DateUtil.format(today) %></b> 입니다. <br>
</body>
</html>