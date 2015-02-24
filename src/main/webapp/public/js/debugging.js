'use strict';
(function($, deviceResolutionChecker){
	$(document).ready(function(){
		function debugInfoRendering(){
			var deviceInfo = deviceResolutionChecker.getDeviceInfo();
			$('#device-width').text(deviceInfo.width);
			$('#device-height').text(deviceInfo.height);
			$('#pixel-ratio').text(deviceInfo.pixelRatio);
			
			var viewType = $.cookie('viewType');
			if(viewType === undefined || viewType === ''){
				viewType = '지정되지 않음';
			}
			
			$('#view-type').text(viewType);
			$('#display-group').text($.cookie('displayGroup'));
			
			$('#parsing-type').text($.cookie('parsingType'));
			
			$('#user-agent').text(window.navigator.userAgent);
		}
		
		debugInfoRendering();
		
		function resetCookie(){
			if(confirm('쿠키를 삭제하고 화면을 새로고침 합니다.')){
				$.removeCookie('displayGroup');
				$.removeCookie('viewType');
				$.removeCookie('parsingType');
				
				var currentUrl = location.href;
				
				location.href = currentUrl;
			}			
		}
		
		// event
		$(window).on('resize', debugInfoRendering);
		$('#remove-cookie-button').on('click', resetCookie);		
	});
})(jQuery, window.deviceResolutionChecker);