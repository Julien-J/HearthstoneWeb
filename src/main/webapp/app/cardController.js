'use strict';

app.controller("CardController", [ "Card", "$routeParams",
		function(Card, $routeParams) {
			var id = $routeParams.id;
			this.card = Card.get({id:id});
		
		} ]);
