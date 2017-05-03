<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: allen
  Date: 2017/5/3
  Time: 22:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form name="modifyForm" action="<%=request.getContextPath()%>/students/Students_save.action">
        <table>
            <tr>
                <td>学号</td>
                <td><input type="text" name="sid"  value='<s:property value="#session.modify_student.sid"/>'></td>
            </tr>
            <tr>
                <td>姓名</td>
                <td><input type="text" name="sname" value='<s:property value="#session.modify_student.sname"/>'></td>
            </tr>
            <tr>
                <td>性别</td>
                <td>
                    <s:if test='%{#session.modify_student.gender=="male"}'>
                        <input type="radio" name="gender" value="male" checked="checked">男
                        <input type="radio" name="gender" value="female" >女
                    </s:if>
                    <s:else>
                        <input type="radio" name="gender" value="male" >男
                        <input type="radio" name="gender" value="female" checked="checked" >女
                    </s:else>
                </td>
            </tr>
            <tr>
                <td>生日</td>
                <td><input type="text" name="birthday" value='<s:date name="#session.modify_student.birthday" format="yyyy-MM-dd"/>'></td>
            </tr>
            <tr>
                <td>地址</td>
                <td><input type="text" name="address" value='<s:property value="#session.modify_student.address"/>'></td>
            </tr>
        </table>
     <input type="submit" value="submit" >
    </form>
</body>
</html>
