'use strict';

$(document).ready(function(){
	function resizeProductImageHeight(){
		var $productImage = $('.product-image');
		$productImage.height($(window).width());
	}
	$(window).on('resize', function(){
		resizeProductImageHeight();
	});
	
	resizeProductImageHeight();
});