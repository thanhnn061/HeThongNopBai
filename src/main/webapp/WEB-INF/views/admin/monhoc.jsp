<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="dec"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html class="no-js">

<head>
<title>Admin Home Page</title>
<!-- Bootstrap -->
<link
	href="${pageContext.request.contextPath}/template/admin/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" media="screen">
<link
	href="${pageContext.request.contextPath}/template/admin/bootstrap/css/bootstrap-responsive.min.css"
	rel="stylesheet" media="screen">
<link
	href="${pageContext.request.contextPath}/template/admin/vendors/easypiechart/jquery.easy-pie-chart.css"
	rel="stylesheet" media="screen">
<link
	href="${pageContext.request.contextPath}/template/admin/assets/styles.css"
	rel="stylesheet" media="screen">
<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->
<script
	src="${pageContext.request.contextPath}/template/admin/vendors/modernizr-2.6.2-respond-1.1.0.min.js"></script>
</head>

<body>
	<div class="navbar navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container-fluid">
				<a class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse"> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
				</a> <a class="brand" href="${pageContext.request.contextPath}/">HTNB</a>
				<div class="nav-collapse collapse">
					<ul class="nav pull-right">
						<li class="dropdown"><a href="#" role="button"
							class="dropdown-toggle" data-toggle="dropdown"> <i
								class="icon-user"></i> ${sessionScope.checkUser.user } <i class="caret"></i>

						</a>
							<ul class="dropdown-menu">
								<li><a tabindex="-1" href="">Profile</a></li>
								<li class="divider"></li>
								<li><a tabindex="-1" href="${pageContext.request.contextPath}/logout">Logout</a></li>
							</ul></li>
					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
		</div>
	</div>
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span3" id="sidebar">
				<ul class="nav nav-list bs-docs-sidenav nav-collapse collapse">
					<li class="active"><a href="index.html"><i
							class="icon-chevron-right"></i> Danh Mục</a></li>
					<li><a href="${pageContext.request.contextPath}/admin"><i
							class="icon-chevron-right"></i> Quản Lý Giảng Viên</a></li>
					<li><a href="${pageContext.request.contextPath}/admin/qlsv"><i
							class="icon-chevron-right"></i> Quản Lý Sinh Viên</a></li>
					<li><a href="${pageContext.request.contextPath}/admin/mh"><i
							class="icon-chevron-right"></i> Quản Lý Môn Học</a></li>
					<li><a href="${pageContext.request.contextPath}/admin/qltk"><i
							class="icon-chevron-right"></i> Quản Lý Tài Khoản</a></li>
				</ul>
			</div>
			<div class="row-fluid">

				<div class="span9">
					<!-- block -->
					<div class="block">
						<div class="navbar navbar-inner block-header">
							<div class="muted pull-left">Invoices</div>
							<div class="pull-right">
						<a
												href="${pageContext.request.contextPath}/admin/themmh">
													<button class="btn btn-primary btn-mini">Thêm
													Môn Học</button>
											</a>

							</div>
						</div>
						<div class="block-content collapse in">
							<table class="table table-striped">
								<thead>
									<tr>

										<th>Mã Môn Học</th>
										<th>Tên Môn Học</th>
										<th>Sự Kiện</th>
									</tr>
								</thead>
								<tbody>
								
									<c:forEach items="${loadmh}" var="m">
										<tr>
											<td>${m.maMH }</td>
											<td>${m.tenMH }</td>
											<td>						
												 <a
												href="${pageContext.request.contextPath}/admin/xoamonhoc?maMH=${m.maMH }"
												return confirm('Bạn có chắc chắn muốn xóa mặt hàng nàykhông? ')">
													<button class="btn btn-primary btn-mini">Xóa</button>
											</a>
												<a
												href="${pageContext.request.contextPath}/admin/suamh/${m.maMH }"><button
														class="btn btn-primary btn-mini">Sửa</button></a> <a
												href="${pageContext.request.contextPath}/admin/xembai?mamh=${m.maMH }">												<button class="btn btn-primary btn-mini">Lấy Bài</button></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
					<!-- /block -->
				</div>
			</div>

			<hr>
			
		</div>
		<!--/.fluid-container-->
		<script
			src="${pageContext.request.contextPath}/template/admin/vendors/jquery-1.9.1.min.js"></script>
		<script
			src="${pageContext.request.contextPath}/template/admin/bootstrap/js/bootstrap.min.js"></script>
		<script
			src="${pageContext.request.contextPath}/template/admin/vendors/easypiechart/jquery.easy-pie-chart.js"></script>
		<script
			src="${pageContext.request.contextPath}/template/admin/assets/scripts.js"></script>
		<script>
			$(function() {
				// Easy pie charts
				$('.chart').easyPieChart({
					animate : 1000
				});
			});
		</script>
</body>

</html>