<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>doLogin</title>
	</head>
	<body>
	  <c:if test="${session_flag == 'success' }">
	      <script type="text/javascript">
	        alert("로그인 성공");
	        location.href="../index.jsp";
	      </script>
	  </c:if>
	  <c:if test="${session_flag != 'success' }">
	      <script type="text/javascript">
	        alert("아이디와 패스워드가 일치하지 않습니다. ");
	        location.href="./login.do";
	      </script>
	  </c:if>
	
	</body>
</html>