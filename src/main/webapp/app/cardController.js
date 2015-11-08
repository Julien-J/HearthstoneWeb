'use strict';


app.controller("CardController",["Card",function(Card){
	this.cards = Card.query();	
}]);