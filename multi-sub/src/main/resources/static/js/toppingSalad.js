
$(document).ready(function(){

	$('#select-vegetable').hide();
	$('#select-sauce').hide();
	$('#select-others').hide();
	$('#ordersPage').hide();
	$('#prevBtn').css("visibility","hidden");
	$('#testBtn').hide();
	
	$('#testBtn').click(function(){
		if($('input:checkbox[name=others]').is(":checked")){
			
			$('#topping-select').attr({
				'method' : 'post',
				'action' : 'toppingaddimpl'
			})
			$('#topping-select').submit();
		}else{
			alert("토핑을 선택해주세요.");
		}
		
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
		}else if($('#select-cheese').css("display") == 'flex'){
			$('#select-cheese').hide();
			$('#select-vegetable').show();	
			$('#prevBtn').css("visibility","visible");
		}
		if($('input:checkbox[name=vegetable]').is(":checked") == false){
		}else if($('#select-vegetable').css("display") == 'flex'){
			$('#select-vegetable').hide();
			$('#select-sauce').show();	
		}
		
		if($('input:checkbox[name=sauce]').is(":checked") == false){
		}else if($('#select-sauce').css("display") == 'flex'){
			$('#select-sauce').hide();
			$('#select-others').show();	
			$('#testBtn').show();
			$('#nextBtn').hide();
		}
	
	});
	
	$('#prevBtn').click(function(){
		if($('#select-vegetable').css("display") == 'flex'){
			$('input:checkbox[name=vegetable]').attr("checked",false)
			$('.vegetable').removeClass("selectedbox");	
			$('#select-cheese').show();
			$('#select-vegetable').hide();
			$('#prevBtn').css("visibility","hidden");	
		
		}
		
		if($('#select-sauce').css("display") == 'flex'){
			$('input:checkbox[name=sauce]').attr("checked",false)
			$('.sauce').removeClass("selectedbox");	
			$('#select-vegetable').show();
			$('#select-sauce').hide();	

		}
		if($('#select-others').css("display") == 'flex'){
			$('#select-sauce').show();
			$('#select-others').hide();	
			$('input:checkbox[name=others]').attr("checked",false)
			$('.sauce').removeClass("selectedbox");	
			$('#testBtn').hide();
			$('#nextBtn').show();
		}
	})
	
});