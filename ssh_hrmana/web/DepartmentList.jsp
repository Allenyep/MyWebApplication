<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: allen
  Date: 2017/5/9
  Time: 22:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <thead>
            <tr>
                <td>部门名称</td>
                <td>编辑</td>
            </tr>
        </thead>
        <tbody>
            <s:iterator value="list" var="d">
                <tr>
                    <td><s:property value="#d.dname"/></td>
                    <td></td>
                </tr>
            </s:iterator>
        </tbody>
    </table>
    <br>
<span>第<s:property value="currPage"/>/<s:property value="totalPage"/>页 </span><br>
<span>总记录数:<s:property value="totalCount"/> 每页显示:<s:property value="pageSize"/> </span><br>
<span>
    <s:if test="currPage!=1">
        <a href="${pageContext.request.contextPath}/department_findAll.action?currPgae=1">首页</a>
        <a href="${pageContext.request.contextPath}/department_findAll.action?currPgae=<s:property value="currPage-1"/>">上一页</a>
    </s:if>
    <s:if test="currPage!=totalPage">
        <a href="${pageContext.request.contextPath}/department_findAll.action?currPgae=<s:property value="currPage+1"/>">下一页</a>
        <a href="${pageContext.request.contextPath}/department_findAll.action?currPgae=<s:property value="totalPage"/>">末页</a>
    </s:if>
</span>
</body>
</html>
