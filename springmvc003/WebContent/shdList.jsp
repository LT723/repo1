<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<c:set value="${pageContext.request.contextPath }" var="path"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${path }/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
function fun1(reptid) {
	document.forms[0].action="${path }/shdxx/toadd?reptid="+reptid;
	document.forms[0].submit();
}
function fun2(reptid) {
	document.forms[0].action="${path }/shdxx/delete?reptid="+reptid;
	document.forms[0].submit();
}
</script>
</head>
<body>
<form action="" method="post">
	<table border="1" width="100%">
		<tr>
			<td>收货单ID</td>
			<td>收货仓库</td>
			<td>预计到货时间</td>
			<td>收货单状态</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${shdxxs }" var="shdxx">
			<tr>
				<td>${shdxx.reptid }</td>
				<td>${shdxx.whname }</td>
				<td><f:formatDate value="${shdxx.plandate }" pattern="yyyy-MM-dd"/></td>
				<td>
					<c:if test="${shdxx.restatus==0 }">新生成</c:if>
					<c:if test="${shdxx.restatus==1 }">未完成</c:if>
					<c:if test="${shdxx.restatus==2 }">已完成</c:if>
				</td>
				<td align="center">
					<c:if test="${shdxx.restatus==0 }">
						<input type="button" value="收货登记" onclick="fun1(${shdxx.reptid });">
						<input type="button" value="删除数据" onclick="fun2(${shdxx.reptid });">
					</c:if>
					<c:if test="${shdxx.restatus==1 }">
						<input type="button" value="收货登记" onclick="fun1(${shdxx.reptid });">
					</c:if>
					<c:if test="${shdxx.restatus==2 }">-</c:if>
				</td>
			</tr>
		</c:forEach>
	</table>
</form>
</body>
</html>