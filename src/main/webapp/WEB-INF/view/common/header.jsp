<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<c:choose>
			<c:when test="${cookie.useWideViewType.value eq true}">
				<meta name="viewport" content="width=940px"/>
			</c:when>
			<c:otherwise>
				<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0"/>
			</c:otherwise>
		</c:choose>
		<title>GSSHOP - PROTOTYPE</title>
		<link rel="stylesheet" href="<%= request.getContextPath() %>/public/lib/bootstrap/dist/css/bootstrap.css">
		<link rel="stylesheet" href="<%= request.getContextPath() %>/public/css/common.css">
		<c:choose>
			<c:when test="${cookie.viewType.value eq 'mobile'}">
				<link rel="stylesheet" href="<%= request.getContextPath() %>/public/css/app_narrow.css">
			</c:when>
			<c:otherwise>
				<link rel="stylesheet" href="<%= request.getContextPath() %>/public/css/app_wide.css">
			</c:otherwise>
		</c:choose>		
		
		<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    	<script src="https://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.2/html5shiv.js"></script>
	</head> 
	<body>