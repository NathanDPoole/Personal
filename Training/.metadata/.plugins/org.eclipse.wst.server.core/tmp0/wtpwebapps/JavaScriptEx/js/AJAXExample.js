/**
 * 
 */

window.onload = function (){
	
	document.getElementById("submitButton").addEventListener("click", nflPlayers)
	
}

function nflPlayers(){
	
	var xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function (){
		
//		console.log("Ready State - " + xhr.readyState);
//		console.log(xhr.status);
//		console.log(xhr.responseText);
		
		if((xhr.readyState == 4)&&(xhr.status == 200)){
			document.getElementsByTagName('P')[0].innerHTML = xhr.responseText;
			
			var a = JSON.parse(xhr.responseText);
			for(b in a){
				console.log(b + ": name");
				console.log(a[b] + ": value")
			}
			
			
		}
	}
	
	xhr.open("GET", "https://api.myjson.com/bins/9cb8b", true);
	xhr.send();

}