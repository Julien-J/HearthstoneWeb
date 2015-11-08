'use strict';


app.controller("CardController",function(Card){
	this.cards = Card.query();	
});