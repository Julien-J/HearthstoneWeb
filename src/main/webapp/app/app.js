'use strict';
var app = angular.module('hearthstoneApp', ["ngRoute","ngResource"]);

app.config(function($routeProvider) 
{
	$routeProvider.when('/', {
		  templateUrl : 'pages/accueil.html',
		  controller : 'AccueilController as accueilController'
		 }).when('/cards',{
			 templateUrl : 'pages/cartes.html',
			  controller : 'cardController as cardController'
		 });
	
});