<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: allen
  Date: 2017/5/5
  Time: 9:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>保存商品</h1>
<s:form action="product_save.action" method="POST" >
    <table border="1">
        <tr>
            <td>商品名称
            <s:textfield name="pname" /></td>
        </tr>
        <tr>
            <td>商品价格
            <s:textfield name="price"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="添加"/></td>
        </tr>
    </table>
</s:form>
</body>
</html>
