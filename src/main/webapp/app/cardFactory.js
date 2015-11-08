'use strict';

app.factory("Card",["$resource",function($resource){
//	return $resource("./api/card",null,{"getOne":{method:"GET",url:"./api/card/:id",params:"id:"});
	return $resource("./api/card/:id",{id:"@id"},null);
}]);

