<%--
  Created by IntelliJ IDEA.
  User: Павел
  Date: 11.11.2015
  Time: 23:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Log in page!</title>
</head>
<body>
<div>
  <form action="Login" method="post">
    <input type="text" name="email">
    <input type="password" name="pass">
    <input type="submit"> ${error}
  </form>
</div>
</body>
</html>
