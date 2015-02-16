<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
		<script src="<%= request.getContextPath() %>/public/lib/jquery/dist/jquery.js"></script>
	</head> 
	<body>
		<form method="POST" id="sendForm">
			<input id="deviceWidthId" name="deviceWidth" type="hidden"/>
			<input id="deviceHeightId" name="deviceHeight" type="hidden"/>
			<input id="deviceRatioId" name="deviceRatio" type="hidden"/>
		</form>
	</body>
	<script type="text/javascript">

		<%-- document.cookie = "deviceWidth=" + window.screen.width + "; path=<%=request.getContextPath() %> ;expires=" + expire.toGMTString() + ";" ;
		document.cookie = "deviceHeight=" + window.screen.height + "; path=<%=request.getContextPath() %> ;expires=" + expire.toGMTString() + ";" ;
		document.cookie = "deviceRatio=" + window.devicePixelRatio + "; path=<%=request.getContextPath() %> ;expires=" + expire.toGMTString() + ";" ;
		 --%>
		$('#deviceWidthId').val(window.screen.width);
		$('#deviceHeightId').val(window.screen.height);
		$('#deviceRatioId').val(window.devicePixelRatio);
		$('#sendForm').submit();
	</script>
</html>
