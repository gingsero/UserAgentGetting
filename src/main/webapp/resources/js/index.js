/**
 * 
 */

var button_getter;


window.onload = function(){
	console.log("window.onload()");
	button_getter = document.getElementById("getbutton");
	
	
}


function executeGetting(){
	console.log("executeGetting()");
	$.ajax({
		type:"GET",
		url:"get/useragent.do",
		success: function(){
			console.log("ajax success");
		},
		error: function(){
			console.log("ajax error");
		}
	});
}