'use strict';
var app = angular.module('hearthstoneApp', ["ngRoute","ngResource"]);

app.config(function($routeProvider) 
{
	$routeProvider.when('/', {
		  templateUrl : 'pages/accueil.html',
		  controller : 'AccueilController as accueilController'
		 }).when('/cards',{
			 templateUrl : 'pages/cartes.html',
			  controller : 'CardsController as cardsController'
		 }).when('/card/:id',{
			 templateUrl : 'pages/carte.html',
			 controller : 'CardController as cardController'
		 }).when('/card/addCard',{
			 templateUrl : 'pages/createCard.html',
			 controller : 'AddCardController as addCardController'
		 });
});