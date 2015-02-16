'use strict';
$(document).ready(function(){
	if(navigator.appVersion.indexOf("MSIE 8.0") !== -1){
		resizeProductImageScaleForIE8();
	}
	
	function resizeProductImageScaleForIE8(){
		$('div[data-background-image-scale]').each(function(){			
			var backgroundImageUrl = $(this).css('background-image')
										.replace(/url|\(|\)/g, '');			
			var filterCSS = 'progid:DXImageTransform.Microsoft.AlphaImageLoader(' + 
				'src=' + backgroundImageUrl + ',' + 
				'sizingMethod="scale");';
			$(this).css('filter', filterCSS);
			$(this).css('-ms-filter', filterCSS);
			
			console.log($(this).css('filter'));
		});
	}
});