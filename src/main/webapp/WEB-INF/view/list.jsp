<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="/resource/css/bootstrap.min.css">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/resource/js/page.js"></script>
<title>method</title>
</head>
<body>
	<table>
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>价格</td>
			<td>权重百分比</td>
		</tr>
		<c:forEach items="${list }" var="a">
			<tr>
			<td>${a.id }</td>
			<td>${a.name }</td>
			<td>${a.pricfe }</td>
			<td>${a.baifen }</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="4">${fenye }</td>
		</tr>
	</table>
</body>
</html>