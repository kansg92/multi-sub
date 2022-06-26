$(document).ready(function(){


	$('#sessionBtn').click(function(){
		var result = confirm("장바구니를 비우겠습니까?");
		if(result){
			console.log("ok");
		    location.href="deleteSession";
		}
	});
	
	$('#goOrder').click(function(){
		location.href="orders";
		
	})
	
});