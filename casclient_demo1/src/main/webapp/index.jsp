<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<html>
<body>
<%--remote远程--%>

<h2><%=request.getRemoteUser()%>欢迎访问--品优购!</h2>
<a href="http://localhost:9100/cas/logout?service=http://www.baidu.com">单点退出</a>
</body>
</html>
