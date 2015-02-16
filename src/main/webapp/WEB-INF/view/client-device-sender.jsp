<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="./common/header.jsp" %>
<form method="POST" id="sendForm">
	<input id="deviceWidthId" name="deviceWidth" type="hidden"/>
	<input id="deviceHeightId" name="deviceHeight" type="hidden"/>
	<input id="deviceRatioId" name="deviceRatio" type="hidden"/>
</form>
<script>
	$(document).ready(function(){
		$('#deviceWidthId').val($(window).width());
		$('#deviceHeightId').val($(window).height());
		
		var devicePixelRatio = window.devicePixelRatio;
        if(devicePixelRatio === undefined){
            if(window.screen.deviceXDPI && window.screen.logicalXDPI){
                devicePixelRatio = window.screen.deviceXDPI / window.screen.logicalXDPI;
            }
        }
		$('#deviceRatioId').val(devicePixelRatio);
		
		$('#sendForm').submit();
	});
</script>
<%@ include file="./common/footer.jsp" %>