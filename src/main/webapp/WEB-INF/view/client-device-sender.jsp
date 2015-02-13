<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
		<script src="<%= request.getContextPath() %>/public/lib/jquery/dist/jquery.min.js"></script>
	</head> 
	<body>
		<form method="POST" id="sendForm">
			<input id="deviceWidthId" name="deviceWidth" type="hidden"/>
			<input id="deviceHeightId" name="deviceHeight" type="hidden"/>
			<input id="deviceRatioId" name="deviceRatio" type="hidden"/>
		</form>
	</body>
	<script type="text/javascript">

		var expire = new Date();
		expire.setDate(expire.getDate() + 7);
		
		var deviceInfo = {
				deviceWidth : window.screen.width,
				deviceHeight : window.screen.height,
				deviceRatio : window.devicePixelRatio
		};
		
		//document.cookie = "deviceInfo=" + JSON.stringify(deviceInfo) + "; path=<%=request.getContextPath() %> ;expires=" + expire.toGMTString() + ";" ;
		document.cookie = "deviceWidth=" + window.screen.width + "; path=<%=request.getContextPath() %> ;expires=" + expire.toGMTString() + ";" ;
		document.cookie = "deviceHeight=" + window.screen.height + "; path=<%=request.getContextPath() %> ;expires=" + expire.toGMTString() + ";" ;
		document.cookie = "deviceRatio=" + window.devicePixelRatio + "; path=<%=request.getContextPath() %> ;expires=" + expire.toGMTString() + ";" ;
		
	</script>
</html>
