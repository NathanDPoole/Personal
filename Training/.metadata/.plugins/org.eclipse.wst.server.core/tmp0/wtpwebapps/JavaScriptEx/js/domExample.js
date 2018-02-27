/**
 * 
 */

var u = document.getElementById("user");
var p = document.getElementById("pass");
console.log(u);

var para = document.getElementById("newParagraph");

function changeParagraph(){
	para.innerHTML = "<p> user"+ u + "is logged </p>";
	console.log("value - u & p", u+ " "+p);
}

function mouseHoverDOM(){
	document.getElementById("ModifiedbyJS").innerHTML = "Did it Work????";
}

function mouseOutDOM(){
	document.getElementById("ModifiedbyJS").innerHTML = "What was the original";
}

