'use strict';


app.controller("CardsController",["Card",function(Card){
	this.cards = Card.query();	
}]);
