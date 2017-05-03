<%--
  Created by IntelliJ IDEA.
  User: allen
  Date: 2017/5/3
  Time: 19:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="<%=request.getContextPath()%>/students/Students_query.action">学生列表</a>

<table>
    <thead>
    <tr>
        <td>ID</td>
        <td>姓名</td>
        <td>性别</td>
        <td>生日</td>
        <td>地址</td>
    </tr>
    </thead>
    <tbody>
    <s:iterator value="#session.students_list" var="stu">
        <tr>
            <td><s:property value="#stu.sid"/></td>
            <td><a href="<%=request.getContextPath()%>/students/Students_modify.action?sid=<s:property value="#stu.sid"/>">
                <s:property value="#stu.sname"/></a></td>
            <td><s:property value="#stu.gender"/></td>
            <td><s:date name="#stu.birthday" format="yyyy:MM:dd"/></td>
            <td><s:property value="#stu.address"/></td>
            <td><a href="<%=request.getContextPath()%>/students/Students_delete.action?sid=<s:property value="#stu.sid"/>"
                   onclick="javascript:return confirm('是否删除?');">删除</a> </td>
        </tr>
    </s:iterator>
    </tbody>
</table>
</body>
</html>
