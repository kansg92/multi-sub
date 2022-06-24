
 
$(document).ready(function(){
	$('#order-page').hide();

	$('#sessionBtn').click(function(){
		var result = confirm("장바구니를 비우겠습니까?");
		if(result){
			console.log("ok");
		    location.href="deleteSession";
		}
	});
	
	$('#deleteMenu').click(function(){
		var deproduct = confirm("상품을 지우겠습니까?");
		if(deproduct){
			console.log("ok");
		    location.href="orderproductdelete";
		
		}
	});
	
	$('#goOrder').click(function(){
		location.href="orders";
		
	})
	
});