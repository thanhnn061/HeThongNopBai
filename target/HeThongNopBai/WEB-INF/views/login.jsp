<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Đăng Nhập</title>
<!-- Bootstrap -->
<link
	href="${pageContext.request.contextPath}/template/admin/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" media="screen">
<link
	href="${pageContext.request.contextPath}/template/admin/bootstrap/css/bootstrap-responsive.min.css"
	rel="stylesheet" media="screen">
<link
	href="${pageContext.request.contextPath}/template/admin/assets/styles.css"
	rel="stylesheet" media="screen">
<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
<script src="js/vendor/modernizr-2.6.2-respond-1.1.0.min.js"></script>
</head>
<body id="login">
	<div class="container">

		<form class="form-signin"
			action="${pageContext.request.contextPath}/login" method="post">
			<h2 class="form-signin-heading">Vui lòng nhập đăng nhập</h2>

			<input name="userName" type="text" class="input-block-level"
				placeholder="Tên Đăng Nhập"> <input name="passWord"
				type="password" class="input-block-level" placeholder="Mật Khẩu">
			<a href="${pageContext.request.contextPath}"><button
					class="btn btn-large btn-primary" type="submit">Đăng Nhập</button></a>
		</form>
		<c:forEach items="${loadmh }" var="m">
							${m.tenMH }
		</c:forEach>
	</div>
	<!-- /container -->
	<script
		src="${pageContext.request.contextPath}/template/admin/vendors/jquery-1.9.1.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/template/admin/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>