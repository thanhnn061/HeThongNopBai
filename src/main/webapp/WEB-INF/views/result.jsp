<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<title>index</title>
</head>
<body>
  <h3 th:text="${message}"></h3>
  <p>File Description:  <span th:text="${description}"></span></p>
</body>
</html></html>