<%--
  Created by IntelliJ IDEA.
  User: xiaosiwei
  Date: 15/7/27
  Time: 下午9:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>测试表单!</title>
</head>
<body>
  <form method="post" action="<c:url value="/jsp/testform"/>">
    First name: <input type="text" name="first_name"/>
    <br/>
    Last name:<input type="text" name="last_name"/>
    <input type="submit" value="提交"/>
  </form>
</body>
</html>
