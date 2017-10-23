<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>学生信息列表</h2>
	<s:if test="#parameters.msg[0]==1">
		<p style="color:green">修改学生成功!</p>
	</s:if>
	<s:elseif test="#parameters.msg[0]==-1">
		<p style="color:red">操作失败!</p>
	</s:elseif>
	<s:elseif test="#parameters.msg[0]==2">
		<p style="color:green">删除学生成功!</p>
	</s:elseif>
	<a href="addStu.jsp">添加学生</a>
	<table border="1" width="600">
	<tr>
	<td>编号</td><td>学生姓名</td>
	<td>年龄</td><td>管理</td>
	</tr>
	<s:iterator value="#request.stuList" var="obj" status="ids">
	<tr>
	<td>${ids.count }</td><td>${obj.sname }</td>
	<td>${obj.sage }</td>
	<td><a href="stuAction_findStuById?stu.sno=${obj.sno }">修改</a>|
	<a href="stuAction_deleteStu?stu.sno=${obj.sno }">删除</a></td>
	</tr>
	</s:iterator>
	</table>
</body>
</html>