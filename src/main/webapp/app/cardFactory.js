'use strict';

app.factory("Card",["$resource",function($resource){
	return $resource("/api/card",null,null);
}]);

