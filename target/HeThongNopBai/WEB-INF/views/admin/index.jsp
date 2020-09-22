<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Nộp bài</title>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <link href="${pageContext.request.contextPath}/template/client/css/style1.css" rel="stylesheet" media="screen">
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
	<h2>QUẢN LÝ MÔN HỌC GIẢNG VIÊN</h2>
	<div class="upload-form">
	 <form class="form-horizontal" action="/action_page.php">
	    <div class="form-group">
	      <label class="control-label col-sm-2" for="namhoc">Năm học:</label>
	      <div class="col-sm-10">
	        <select class="select" id="select-namhoc">
		        <option>2019-2020</option>
		        <option>2020-2021</option>
		        <option>2021-2022</option>
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
	        <select class="select" id="select-monhoc">
		        <option>Công nghệ Java</option>
		        <option>SQL server</option>
		      </select>
	      </div>
	    </div>
	     <div class="form-group">
	      <label class="control-label col-sm-2" for="giangvien">Giảng viên:</label>
	      <div class="col-sm-10">
	        <select class="select" id="select-giangvien">
		        <option>Nguyễn Thanh Bình</option>
		        <option>Vũ Sơn Lâm</option>
		      </select>
	      </div>
	    </div>
	     <div class="form-group">
	      <label class="control-label col-sm-2" for="lophocphan">Lớp học phần:</label>
	      <div class="col-sm-10">
	        <select class="select" id="select-lophocphan">
		        <option>CNTT 39A</option>
		        <option>CNTT 39B</option>
		        <option>CNTT 39C</option>
		      </select>
	      </div>
	    </div>
	    <div class="form-group">
	    	<label class="control-label col-sm-2" for="upfile">Chọn File bài nạp:</label>
	    	<div class="col-sm-10">
		    	<input type="file" id="myFile" name="filename">
		    </div>
	  	</div>
	    <div class="form-group"> 
	           
	      <div class="col-sm-offset-2 col-sm-10">
	        <button type="submit" class="btn btn-default">Nộp bài</button>
	      </div>
	    </div>
  </form>
  <div class="masv">
  	<a href="#">3951050022</a>
  	<button type="submit" class="btn btn-logout">Đăng xuất</button>
  </div>
  </div>
</body>
</html>