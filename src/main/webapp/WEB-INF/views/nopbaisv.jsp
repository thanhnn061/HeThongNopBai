
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="dec"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Nộp bài</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link
	href="${pageContext.request.contextPath}/template/client/css/style1.css"
	rel="stylesheet" media="screen">
<style>
.upload-sv .form-horizontal .form-group .col-sm-10 .select {
	font-size: 15px;
	width: 34%;
	height: 36px;
	padding: 8px;
	border-radius: 4px;
}

h2 {
	text-align: center;
}

form {
	margin-top: 20px;
	width: 100%;
	height: auto;
	background-color: #f0efef;
	padding: 40px;
	padding-left: 421px;
}

.btn-default {
	color: #e8e8e8;
	background-color: #4592d4;
	border-color: #ccc;
}

.btn-logout {
	color: #e8e8e8;
	background-color: #ff0000;
	border-color: #ccc;
}

.masv {
	position: absolute;
	z-index: 1;
	top: 19px;
	right: 15px;
}
</style>
</head>
<body class="upload-sv">
	<h2>NỘP BÀI MÔN HỌC</h2>
	<script type="text/javascript">
			alert(${message});
		</script>
	<div class="upload-form">
	
		<form:form class="form-horizontal" method="POST"
			action="${pageContext.request.contextPath}/nopbaisv/uploadFile" enctype="multipart/form-data"
			modelAttribute="nopBai">
			<div class="form-group">
				<label class="control-label col-sm-2" for="namhoc">Năm học:</label>
				<div class="col-sm-10">
					<select class="select" id="select-namhoc">
						<option>2016-2017</option>
						<option>2017-2018</option>
						<option>2018-2019</option>
						<option>2019-2020</option>
					</select>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="hocky">Học kỳ:</label>
				<div class="col-sm-10">
					<select class="select" id="select-hocky">
						<option>Học kỳ 1</option>
						<option>Học kỳ 2</option>
						<option>Học kỳ 3</option>
					</select>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="monhoc">Môn học:</label>
				<div class="col-sm-10">
					<form:select path="maMH" class="select" id="select-monhoc">
						<form:options items="${loadmh}" itemLabel="tenMH" itemValue="maMH" />
					</form:select>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="giangvien">Giảng
					viên:</label>
				<div class="col-sm-10">
					<form:select path="maGV" class="select" id="select-giangvien">
						<form:options items="${loadgv}" itemLabel="tenGV" itemValue="maGV" />
					</form:select>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="lophocphan">Lớp
					học phần:</label>
				<div class="col-sm-10">
				<form:select path="malopHP" class="select" id="select-lopHP">
						<form:options items="${loadlophp}" itemLabel="tenLHP" itemValue="malopHP" />
					</form:select>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="upfile">Chọn
					File bài nạp:</label>
				<div class="col-sm-10">
					<input type="file" name="multipartFile" />
				</div>
			</div>
			<div class="form-group">

				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">Nộp bài</button>
				</div>
			</div>
		</form:form>

		<div class="masv">
			<a href="#">1050022</a> <a
				href="${pageContext.request.contextPath}/logout">
				<button type="submit" class="btn btn-logout">Đăng xuất</button>
			</a>
		</div>
	</div>



</body>
</html>


