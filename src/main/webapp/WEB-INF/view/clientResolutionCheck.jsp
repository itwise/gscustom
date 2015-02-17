<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="./common/header.jsp" %>
<script src="<%= request.getContextPath()%>/public/js/utils/deviceResolutionChecker.js"></script>
<script src="<%= request.getContextPath()%>/public/js/utils/querystringParser.js"></script>
<script>
	$(document).ready(function(){
		var deviceResolutionChecker = window.deviceResolutionChecker;
		var querystringParser = window.querystringParser;
		
		console.log(location.href);
		var params = querystringParser.parse(location.href); 
		console.log(params);
		
		console.log(deviceResolutionChecker.getDisplayGroup());
		$.cookie('displayGroup', deviceResolutionChecker.getDisplayGroup(), { expires: 7 });
			
		if(params.hasOwnProperty('redirect')){
			location.href = params.redirect;
		}else{
			location.href = 'main.gs';			
		}
	});
</script>
<%@ include file="./common/footer.jsp" %>