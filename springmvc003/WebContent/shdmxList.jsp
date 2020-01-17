<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<c:set value="${pageContext.request.contextPath }" var="path"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单添加</title>
<script type="text/javascript" src="${path }/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
	function fun1(j) {
		var a=$(j).parent().parent().find("input:eq(2)").val();
		var b=$(j).val();
		var c=$(j).parent().parent().find("td:eq(4)").text();
		if (parseInt(a)+parseInt(b)>parseInt(c)) {
			alert("实收数量加或损数量不能大于计划数量");
		}
	}
</script>
</head>
<body>
	<form action="${path }/shdxx/add" method="post">
		<table border="1" width="100%">
			<tr>
				<td>明细ID</td>
				<td>收货仓库</td>
				<td>货物名称</td>
				<td>货物类型</td>
				<td>计划数量</td>
				<td>实收数量</td>
				<td>或损数量</td>
				<td>收货登记</td>  
			</tr>
			<c:forEach items="${shdmxs }" var="shdmx">
				<tr>
					<td><input type="hidden" name="mxid" value="${shdmx.mxid }">${shdmx.mxid }</td>
					<td><input type="hidden" name="shdxx.reptid" value="${shdmx.shdxx.reptid }">${shdmx.shdxx.whname }</td>
					<td>${shdmx.pname }</td>
					<td>${shdmx.ptype }</td>
					<td>${shdmx.plannum }</td>
					<td><input type="text" name="incount"></td>
					<td><input type="text" name="destorycount" onblur="fun1(this);"></td>
					<td><input type="submit" value="收货登记"></td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>