

 
$(document).ready(function(){

	$('#select-option').hide();
	$('#select-toast').hide();
	$('#select-cheese').hide();
	$('#select-vegetable').hide();
	$('#select-sauce').hide();
	$('#select-others').hide();
	$('#ordersPage').hide();

	
	
	$('#testBtn').click(function(){

		$('#topping-select').attr({
			'method' : 'post',
			'action' : 'toppingaddimpl'
		})
		$('#topping-select').submit();
	});
	
	$('.top-bread').click(function(){
		$('.bread').removeClass("selectedbox");
		$('input:radio[name="bread"]').attr("checked",false);
		$(this).children(0).attr("checked",true);
		$(this).children(1).toggleClass("selectedbox");
	});
	$('.top-option').click(function(){
		$('.option').removeClass("selectedbox");
		$('input:radio[name="cm"]').attr("checked",false);
		$(this).children(0).attr("checked",true);
		$(this).children(1).toggleClass("selectedbox");
	});
	$('.top-toast').click(function(){
		$('input:radio[name="toast"]').attr("checked",false)
		$(this).children(0).attr("checked",true)
		$('.toasting').removeClass("selectedbox");
		$(this).children(1).toggleClass("selectedbox");
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
		if($('input:radio[name=bread]').is(":checked") == false){
			alert("pleas click bread")
		}else{
			$('#select-bread').hide();
			$('#select-option').show();
		}
		
		if($('input:radio[name=cm]').is(":checked") == false){
		}else{
			console.log("toast where you")
			console.log($('#select-toast'))
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