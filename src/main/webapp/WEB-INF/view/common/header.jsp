<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<c:choose>
			<c:when test="${cookie.viewType.value eq 'wide'}">
				<meta name="viewport" content="width=1024px"/>
			</c:when>
			<c:otherwise>
				<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0"/>
			</c:otherwise>
		</c:choose>
		<title>GSSHOP - PROTOTYPE</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/public/lib/bootstrap/dist/css/bootstrap.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/public/css/common.css">
		<c:choose>
			<c:when test="${cookie.viewType.value eq 'wide'}">				
				<c:set var="loadedCSS" value="${pageContext.request.contextPath}/public/css/app_wide.css" />
				<link rel="stylesheet" href="${pageContext.request.contextPath}/public/css/app_wide.css">
			</c:when>
			<c:when test="${cookie.displayGroup eq null and displayGroup ne null}">
				<c:choose>
					<c:when test="${(displayGroup eq 'M') or (displayGroup eq 'N')}">
						<c:set var="loadedCSS" value="${pageContext.request.contextPath}/public/css/app_narrow.css" />
						<link rel="stylesheet" href="${pageContext.request.contextPath}/public/css/app_narrow.css">
					</c:when>
					<c:otherwise>
						<c:set var="loadedCSS" value="${pageContext.request.contextPath}/public/css/app_wide.css" />
						<link rel="stylesheet" href="${pageContext.request.contextPath}/public/css/app_wide.css">
					</c:otherwise>
				</c:choose>
			</c:when>
			<c:otherwise>				
				<c:choose>					
					<c:when test="${(cookie.displayGroup.value eq 'M') or (cookie.displayGroup.value eq 'N')}">
						<c:set var="loadedCSS" value="${pageContext.request.contextPath}/public/css/app_narrow.css" />
						<link rel="stylesheet" href="${pageContext.request.contextPath}/public/css/app_narrow.css">
					</c:when>
					<c:otherwise>
						<c:set var="loadedCSS" value="${pageContext.request.contextPath}/public/css/app_wide.css" />
						<link rel="stylesheet" href="${pageContext.request.contextPath}/public/css/app_wide.css">
					</c:otherwise>
				</c:choose>
			</c:otherwise>
		</c:choose>	
				
		<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    	<script src="//cdnjs.cloudflare.com/ajax/libs/jquery-cookie/1.4.1/jquery.cookie.min.js"></script>
    	<script src="//cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.2/html5shiv.js"></script>
    	
    	<script src="${pageContext.request.contextPath}/public/js/utils/deviceResolutionChecker.js"></script>
		<script src="${pageContext.request.contextPath}/public/js/utils/querystringParser.js"></script>
		
		<script src="${pageContext.request.contextPath}/public/js/common.js"></script>
		<script src="${pageContext.request.contextPath}/public/js/debugging.js"></script>
	</head> 
	<body>