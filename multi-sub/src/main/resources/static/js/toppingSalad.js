function saveInputValue(){
	
}

 
$(document).ready(function(){

	$('#select-vegetable').hide();
	$('#select-sauce').hide();
	$('#select-others').hide();

	$('#ordersPage').hide();
	
	
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
		$('.cheese').removeClass("selectedbox");
		$('input:radio[name="cheese"]').attr("checked",false)
		$(this).children(0).attr("checked",true)
		$(this).children(1).toggleClass("selectedbox");
	});	
	$('.top-vegetable').click(function(){
		$(this).children(1).toggleClass("selectedbox");
		if($(this).children(0).attr("checked")){
			$(this).children(0).attr("checked",false)
		}else{
			$(this).children(0).attr("checked",true)
		}
	});
	$('.top-sauce').click(function(){
		$(this).children(1).toggleClass("selectedbox");
		if($(this).children(0).attr("checked")){
			$(this).children(0).attr("checked",false)
		}else{
			$(this).children(0).attr("checked",true)
		}
	});
	$('.top-others').click(function(){
		$(this).children(1).toggleClass("selectedbox");
		if($(this).children(0).attr("checked")){
			$(this).children(0).attr("checked",false)
		}else{
			$(this).children(0).attr("checked",true)
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