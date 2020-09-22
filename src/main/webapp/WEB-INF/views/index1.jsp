
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<title>Getting Started: Serving Web Content</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
	<h2>Demo Spring Boot Upload File</h2>
	<form:form method="POST" action="upfile/uploadFile" enctype="multipart/form-data" modelAttribute="myFile">
    File: <input type="file" name="multipartFile" /> <br /> <br/>
    Description: <form:input path="description"/> <br />
    <input type="submit" value="Submit" />
  </form:form>
	
</body>
</html>