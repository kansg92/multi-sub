$(document).ready(function(){
	$('#main-menu').hide();
	$('#payment').hide();
	$('#userCheck').hide();
	$('#takein').click(function(){
		showPay();
	})
	$('#takeout').click(function(){
		showPay();
	})
	
	sumPriceUpdate();
	

	$('#ordersPage').hide();

	
	$('.pay-info').click(function(){
		$('input:radio[name="payInfo"]').attr("checked",false)
		$(this).children(0).attr("checked",true)
	});
	$('#nextOrder').click(function(){
		if($('#mtchoose').css('display')=="flex"){
			showPay();
		}else if($('#payment').css('display')=="flex"){
			$('#payment').hide();
			$('#userCheck').show();
			$('.modal-title').text("맴버십 적립을 하시겠어요??")
		}else if($('#userCheck').css('display')=="flex"){
			
			var c = confirm("결재를 진행하시겠습니까?");
			var id = $('#usersId').val();
			if(c){
				if(id == null | id==""){
					$('#usersId').val("id01");
					sumbitOrder();
				}else{
					$.ajax({
						url:'checkUser',
						data:{"userId":$('#usersId').val()},
						success: function(data){
							if(data){
								sumbitOrder();
							}else{
								$('#warningText').text("존재하지 앟는 회원 입니다.")
							}
						}
					});
				}
			}
		}
	});
	
	$('#membership').click(function(){
		$('#usersId').attr("hidden",false);
		$(this).hide();
	});
	
 	
});

function sumbitOrder(){
	
	var length = $('input[name="odPrice"]').length;
	var prodIdArr = new Array(length);
	var amountArr = new Array(length);
	var odPriceArr = new Array(length);
	
	var sumprice = $('#sumprice').val();
	var payInfo = $('input:radio[name="payInfo"]').val();
	var payState = $('input[name="payState"]').val();
	var usersId = $('input[name="usersId"]').val();
	
	for(var i=0; i<length; i++){
		prodIdArr[i] = $('input[name="prodId"]').eq(i).val();
		amountArr[i] = $('input[name="amount"]').eq(i).val();
		odPriceArr[i] = $('input[name="odPrice"]').eq(i).val();
	}
	
	$.ajax({
		url:'ordersimpl',
		data:{"prodIdArr":JSON.stringify(prodIdArr), 
			  "amountArr":JSON.stringify(amountArr),
			  "odPriceArr":JSON.stringify(odPriceArr),
			  "sumprice":sumprice,
			  "payInfo":payInfo,
			  "payState":payState,
			  "usersId":usersId,
			},
		success: function(data){
			alert("결제가 완료되었습니다!");
			location.href="/"
		}
	});
	
	
	/*$('#orderform').attr({
		'method':'post',
		'action':'ordersimpl'
	});
	$('#orderform').submit();*/
}

function sumPriceUpdate(){
	var count = $('#count').val();
	var sumprice = 0;
	console.log(count);
	for(i=0;i < count; i++){
		console.log($('#total_amount'+(i+1)).val());
		if($('#total_amount'+(i+1)).val() != null){
			sumprice += parseInt($('#total_amount'+(i+1)).val());
			console.log(sumprice);
		}
	}
 	$('#sumprice').attr("value",sumprice);
}

function showPay(){
	$('#mtchoose').hide();
	$('#payment').show();
}

Number.prototype.format = function(){
	if(this==0) return 0;
	
	var reg = /(^[+-]?\d+)(\d{3})/;
	var n = (this + '');
	
	while (reg.test(n)) n = n.replace(reg, '$1' + ',' + '$2');
	
	return n;
};
	 

String.prototype.format = function(){
	var num = parseFloat(this);
	if( isNaN(num) ) return "0";
	
	return num.format();
};
	    	
	

function change_qty2(t,cnt){
	var price = parseInt($('#price'+cnt).val());
	 	
	var min_qty = 1;
	var this_qty = $("#ct_qty"+cnt).val()*1;
	var max_qty = '10'; // 현재 재고
	if(t=="m"){
		this_qty -= 1;
		if(this_qty<min_qty){
			alert("수량은 1개 이상 입력해 주십시오.");
			return;
		}
	}
	else if(t=="p"){
	this_qty += 1;
		if(this_qty>max_qty){
		alert("최대주문수량은 10개입니다.");
		return;
		}
	}
	var show_total_amount = price * this_qty;
	  
	$("#ct_qty"+cnt).val(this_qty);
	  
	$('#total_amount'+cnt).text(show_total_amount.format());
	$('#total_amount'+cnt).attr("value",show_total_amount);
	
	sumPriceUpdate();	
  	
}

function product_delete(cnt){
	location.href="deleteSessionItem?cnt="+cnt;
}