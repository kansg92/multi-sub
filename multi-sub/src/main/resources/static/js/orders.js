

$(document).ready(function(){
	$('#main-menu').hide();
});


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
	  
	  for(i=0; i <= cnt; i++){
		var total =total_amount+i;
		$(total).text(show_total_amount.format());
	    $(total).attr("value",show_total_amount);
		}
	  
	}
	
	
	
	
	
	
	
	