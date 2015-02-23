'use strict';
(function($){
	var VIEW_TYPE_KEY = 'viewType';
	
	$(document).ready(function(){
		// global event
		$('.switch-view-mode-button').on('click', function(){
			$.cookie(VIEW_TYPE_KEY, $(this).attr('data-view-mode'));
			
			var currentUrl = location.href;
			
			location.href = currentUrl;
		});
	});
	
})(jQuery);