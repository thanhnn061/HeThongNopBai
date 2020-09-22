<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="dec"%>
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
						<div class="block-content collapse in">
							<div class="navbar navbar-inner block-header">
								<div class="muted pull-left"></div>
							</div>
							<div class="block-content collapse in">
								<div class="span12">
									<form:form modelAttribute="monHocInfo" method="POST"
										action="${pageContext.request.contextPath}/admin/themmh/add/"
										enctype="multipart/form-data" onsubmit="return myFunction()">
										<fieldset>
											<legend>Thêm Môn Học</legend>
											<div class="control-group">

												<label class="control-label" for="typeahead">Mã Môn
													Học </label>
												<div class="controls">
													<form:input path="maMH" type="text" class="span6" id="maMH" />
												</div>
											</div>
											<div class="control-group">
												<label class="control-label" for="typeahead">Tên Môn
													Học </label>
												<div class="controls">
													<form:input path="tenMH" type="text" class="span6"
														id="tenMH" />
												</div>
											</div>
											<div class="form-actions">
												<button type="submit" class="btn btn-primary">Thêm
													Môn Học</button>
												<button type="reset" class="btn">Hủy</button>
											</div>
										</fieldset>
									</form:form>

								</div>
							</div>

							<!-- /block -->
						</div>
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