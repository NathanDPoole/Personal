/**
 * 
 */
"use strict" //means you have to put var in front of variables
var a = 10;
console.log(a);

//document.write('never use document.write'); out-dated
//alert("pop-up boxes"); //not a good practice, easy to forget

console.log(a);

var x=10; var y=20; //global scope
function add(){
	var c = 40; //local scope
	return(x + y);
}

console.log(add);
console.log(add());
//console.log(c);


//function used as a variable
//functions can be anonymous. notice the f1 function dosn't have a name
var f1 = function(){
	return true;
}

console.log(f1());

var f2 = new Function("x", "y", "return (x*y);");
console.log(f2(20, 30));

//hoisting
console.log("result of muliplication: ", multiply(30, 40));
//call comes before execution
function multiply(d, e){
	return d*e;
}

//self invoking functions
//the definition is in the call
(function printMsg(){
	console.log("this is a message");
})();

(function (){
	console.log("anonymous self invoking");
})();

//ignores extra arguments
console.log(multiply(10,10));
console.log(multiply(10,10,20));
console.log(multiply(10,10,20,30));
//passes undefined if missing arguments
console.log(multiply(10));



function changeValues(g){
	g += ", How are you?";
	console.log(g);
	return g;
}

var h= changeValues("Tom");
console.log(h);

//overloading(more like overriding
function multiply(d, e, i){
	return d*e*i;
}

console.log(multiply(10, 20, 30));
//the latest version covers over all previous versions
console.log(multiply(10, 20));



function Person(age, name){
	this.age = age;
	this.name = name;
}

var tom = new Person(25, "Tom");

console.log(tom.age);


//more on scope
var myVar;

function assignValue(){
	myVar=10;
}
assignValue();
console.log(myVar);
//global variables retain their value even if assign inside a function

//objects

//create using new
var player = new Object();
var playerName = "Marshawn Lynch";
var playerScore = "100";

player.name = playerName;
player.score = playerScore;


//create using literals
var player1 = {name: "Joe Montana", score: 600, rank: 2};
var player2 = {name: "Tom Brady", score: 650, rank: 1};

console.log(player1.name);
console.log(player2.name);

function printPlayerInfo(){
	console.log(this.name + " scored totaly - "+ this.score);
}

player1.info = printPlayerInfo; //relating the printPlayerInfo function the the
player2.info = printPlayerInfo;	//	.info method

console.log(player1.info());
console.log(player2.info());

//closure
var counter;
function f3(){
	var counter = 0;
	counter += 1;
}
f3();
console.log(counter);
f3();
console.log(counter);
f3();
console.log(counter);
f3();
console.log(counter);

var add = (function(){
	var dd = 0;
	return( function(){ return dd+=1;});
})();

console.log(add());
console.log(add());
console.log(add());
console.log(add());



































