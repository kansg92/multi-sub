function saveInputValue(){
	
}

$(document).ready(function(){

	$('#select-option').hide();
	$('#select-toast').hide();
	$('#select-cheese').hide();
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
	
	$('.top-bread').click(function(){
		$('input:radio[name="bread"]').attr("checked",false)
		$(this).children(0).attr("checked",true)
	});
	$('.top-option').click(function(){
		console.log( $(this).children(0));
		$('input:radio[name="cm"]').attr("checked",false)
		$(this).children(0).attr("checked",true)
	});
	$('.top-toast').click(function(){
		$('input:radio[name="toast"]').attr("checked",false)
		$(this).children(0).attr("checked",true)
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
	
	
	

	
	
	$('#nextBtn').click(function(){
		if($('input:radio[name=bread]').is(":checked") == false){
			alert("pleas click bread")
		}else{
			$('#select-bread').hide();
			$('#select-option').show();
		}
		
		if($('input:radio[name=cm]').is(":checked") == false){
		}else{
			$('#select-option').hide();
			$('#select-toast').show();	
		}
		
		if($('input:radio[name=toast]').is(":checked") == false){
		}else{
			$('#select-toast').hide();
			$('#select-cheese').show();	
		}
		
		if($('input:radio[name=cheese]').is(":checked") == false){
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