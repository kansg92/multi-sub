

$(document).ready(function(){
	$('#main-menu').hide();
<<<<<<< HEAD
	$('#payment').hide();
	$('#takein').click(function(){
		showPay();
	})
	$('#takeout').click(function(){
		showPay();
	})
	
	sumPriceUpdate();
	

	
	$('#deleteMenu').click(function(){
		var id = $('input[name="id"]').val();
		var deproduct = confirm("상품을 지우겠습니까?");
		
		if(deproduct){
			for(i=0; i<id ;i++){
			console.log("ok");
		}
		location.href="orderproductdelete";
	}
	});
 	
=======
	$('#main-menu2').hide();
	
	$('#deleteMenu').click(function(){
		var deproduct = confirm("해당메뉴를 지우겠습니까?");
		if(deproduct){
			session.removeAttribute("topping"+num);
		}
	});
		
>>>>>>> han
});

function sumPriceUpdate(){
	var count = $('#count').val();
	var sumprice = 0;
	for(i=0;i < count; i++){
		sumprice += parseInt($('#total_amount'+(i+1)).val());
		console.log(sumprice);
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
<<<<<<< HEAD
	    	

function change_qty2(t,cnt){
	var price = parseInt($('#p_price'+cnt).val());
	 	
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
=======
	    

function change_qty2(t){
	  var price = parseInt($('input[name=p_price]').val());
	
	  var min_qty = 1;
	  var this_qty = $("#ct_qty").val()*1;
	  var max_qty = '200'; // 현재 재고
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
	        alert("죄송합니다. 재고가 부족합니다.");
	        return;
	        }
	    }
	
	  var show_total_amount = price * this_qty;

	  
	  $("#ct_qty").val(this_qty);
	  $("#it_pay").val(show_total_amount);
	  
	  $("#total_amount").attr("value",show_total_amount.format());
	    
	  var total = 0;
 	for(i=0;i<=this_qty;i++){
		for(j=0; j <= price; j++){
		total =show_total_amount + j;
		}
	  }
	   
	  $("#sumprice").attr("value",total.format());
	  
	  
	}

>>>>>>> han
	
	sumPriceUpdate();	
  	
}







