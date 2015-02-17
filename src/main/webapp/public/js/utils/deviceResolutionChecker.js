'use strict';
(function($){
	var DEVICE_GROUP = {
			NARROW: 'N',
			MIDDLE: 'M',
			WIDE: 'W'
	};
	
	
	// FIXME 실제로는 사용되지 않는 정보. 불필요 판단되면 삭제할 것.
	var devicePixelRatio = window.devicePixelRatio;
    if(devicePixelRatio === undefined){
        if(window.screen.deviceXDPI && window.screen.logicalXDPI){
            devicePixelRatio = window.screen.deviceXDPI / window.screen.logicalXDPI;
        }
    }
    
	var deviceInfo = {
			width: $(window).width(),
			height: $(window).height(),
			pixelRatio: devicePixelRatio,
			
	};
	
			
	var deviceResolutionChecker = {
		deviceInfo: deviceInfo,
		getDisplayGroup: function(){
			var deviceGroup = DEVICE_GROUP.NARROW;
			if(this.deviceInfo.width > 481 && this.deviceInfo.width <= 800){
				deviceGroup = DEVICE_GROUP.MIDDLE;
			}else if(this.deviceInfo.width > 800){
				deviceGroup = DEVICE_GROUP.WIDE;
			}			
			return deviceGroup;
		}
	};
	
	window.deviceResolutionChecker = deviceResolutionChecker;	
})(window.jQuery);
