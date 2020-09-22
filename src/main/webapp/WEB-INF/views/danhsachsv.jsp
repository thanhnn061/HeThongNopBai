
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="dec"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

	<div class="main-content">
		<form>

			<div class="main-content-inner">
				<div class="breadcrumbs ace-save-state" id="breadcrumbs">
					<ul class="breadcrumb">
						<li><i class="ace-icon fa fa-home home-icon"></i> <a href="#">Trang
								chủ</a></li>
					</ul>
					<!-- /.breadcrumb -->
				</div>
				<div class="page-content">
					<div class="row">
						<div class="col-xs-12">
							<div class="widget-box table-filter">
								<div class="table-btn-controls">
									<div class="pull-right tableTools-container">
										<div class="dt-buttons btn-overlap btn-group">
											<a flag="info"
												class="dt-button buttons-colvis btn btn-white btn-primary btn-bold"
												data-toggle="tooltip" title='' href='#'> <span> <i
													class="fa fa-plus-circle bigger-110 purple"></i>
											</span>
											</a>


										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-xs-12">
									<div class="table-responsive">
										<table class="table table-bordered">
											<thead>
												<tr>
													<th>Stt</th>
													<th>Msv</th>
													<th>Mon hoc</th>

													<th>Giao vien</th>


													<th>Hoc ki</th>
													<th>Nam hoc</th>

												</tr>
											</thead>
											<tbody>
												
													<tr>
														<td></td>
														<td></td>
														<td></td>
														<td></td>


														<td><a class="btn btn-sm btn-primary btn-edit"
															data-toggle="tooltip" title="Cập nhật danh sach" href="#">
																<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
														</a> <a
															class="dt-button buttons-html5 btn btn-white btn-primary btn-bold"
															data-toggle="tooltip" title='Xóa hóa đơn' href="#"> <span>
																	<i class="fa fa-trash-o bigger-110 pink"></i>
															</span>
														</a></td>

													</tr>
												
											</tbody>
										</table>
										<div class="col col-xs-6 ">
											<ul class="pagination pull-right">
												<li><a href="#"><span
														class="glyphicon glyphicon-chevron-left"></span></a></li>
												
												<li><a href="#"><span
														class="glyphicon glyphicon-chevron-right"></span></a></li>
											</ul>
										</div>

									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</form>
	</div>


</body>
</html>