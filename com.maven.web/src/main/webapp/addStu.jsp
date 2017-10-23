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
	<h2>添加学生</h2>
	<s:if test="#parameters.msg[0]==1">
		<p style="color:green">添加学生成功!</p>
	</s:if>
	<s:elseif test="#parameters.msg[0]==-1">
		<p style="color:red">添加学生失败!</p>
	</s:elseif>
	<s:form method="post" action="stuAction_toAddStu">
		学生姓名:<s:textfield name="stu.sname"/><br/>
		学生年龄:<s:textfield name="stu.sage"/><br/>
		<s:submit value="添加学生"/>
	</s:form>
	<a href="stuAction_findStuList">学生信息列表</a>
</body>
</html>