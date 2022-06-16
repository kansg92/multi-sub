package com.multisub.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrdersDetailVO {
	private int id;
	private int amount;
	private int price;
	private int prodId;
	private int toppingDId;
	
	private String prodName;
	private int prodPrice;
	private String toppingName;
	private int toppingPrice;
}
