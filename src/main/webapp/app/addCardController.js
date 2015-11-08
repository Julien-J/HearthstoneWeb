'use strict';

app.controller("AddCardController", [ "Card",
		function(Card) {
			
			this.card = {};
			this.add = function(card){
				Card.save(card);
			}
		
		} ]);