function saveInputValue(){
	
}

 
$(document).ready(function(){

	$('#select-vegetable').hide();
	$('#select-sauce').hide();
	$('#select-others').hide();

	$('#testBtn').click(function(){
		/*
		$.ajax({
			url:"test",
			success:function(data){
				alert(data);
			}
		})
		*/
		$('#topping-select').attr({
			'method' : 'post',
			'action' : 'toppingaddimpl'
		})
		$('#topping-select').submit();
	});
	

	$('.top-cheese').click(function(){
		console.log( $(this).children(0));
		$('input:radio[name="cheese"]').attr("checked",false)
		$(this).children(0).attr("checked",true)
	});	
	$('.top-vegetable').click(function(){
		if($(this).children(0).attr("checked")){
			$(this).children(0).attr("checked",false)
		}else{
			$(this).children(0).attr("checked",true)
		}
	});
	$('.top-sauce').click(function(){
		if($(this).children(0).attr("checked")){
			$(this).children(0).attr("checked",false)
		}else{
			$(this).children(0).attr("checked",true)
		}
	});
	$('.top-others').click(function(){
		if($(this).children(0).attr("checked")){
			$(this).children(0).attr("checked",false)
		}else{
			$(this).children(0).attr("checked",true)
		}
	});
	
	
	
	$('#sessionBtn').click(function(){
		var result = confirm("장바구니를 비우겠습니까?");
		if(result){
		    session.invalidate();
		}
	});
	
	
	$('#nextBtn').click(function(){

		if($('input:radio[name=cheese]').is(":checked") == false){
			alert("click cheese")
		}else{
			$('#select-cheese').hide();
			$('#select-vegetable').show();	
		}
		if($('input:checkbox[name=vegetable]').is(":checked") == false){
		}else{
			$('#select-vegetable').hide();
			$('#select-sauce').show();	
		}
		
		if($('input:checkbox[name=sauce]').is(":checked") == false){
		}else{
			$('#select-sauce').hide();
			$('#select-others').show();	
		}
	
	});
	
});