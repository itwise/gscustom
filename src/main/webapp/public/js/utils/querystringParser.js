'use strict';
(function(){
	var querystringParser = {
			parse: function(url){
				var querystring = url.split('?')[1];
				var params = {};
				if(querystring !== undefined){
					var keyAndValues = querystring.split('&');
					for(var i = 0; i < keyAndValues.length; i++){
						var keyAndValue = keyAndValues[i].split('=');
						if(keyAndValue.length === 2){
							params[keyAndValue[0]] = keyAndValue[1];
						}
					}
				}
				return params;
			}
	};
	
	window.querystringParser = querystringParser;
})();