<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
<div style="text-align: center;">
	<h1>User list</h1>
	<table class="table table-bordered">
		<thead>
		<tr>
			<th colspan="4"></th>
		</tr>
		<tr>
			<th>序号</th>
			<th>姓名</th>
			<th>年龄</th>
			<th>密码</th>
		</tr>
		</thead>
		<tbody id="userlist"></tbody>
	</table>
</div>
</body>

<script type="text/javascript" src="../skins/js/common/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/skins/js/userlist.js"></script>
<script type="text/javascript">
	var path = '${pageContext.request.contextPath}';
</script>
</html>