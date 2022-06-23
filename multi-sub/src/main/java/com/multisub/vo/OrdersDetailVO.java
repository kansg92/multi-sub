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
	private int odPrice;
	private int prodId;
	private int ordersId;
	
	
	private String prodName;
	private String cateName;
	private String payInfo;
	private String payState;
	private String udate;
	private String paydate;
	
	private String usersID;
	private String pname;
	private String pimgname;
	private int price;
	
	public OrdersDetailVO(int id, int amount, int odPrice, int prodId, int ordersId) {
		this.id = id;
		this.amount = amount;
		this.odPrice = odPrice;
		this.prodId = prodId;
		this.ordersId = ordersId;
	}

	public OrdersDetailVO(int amount, int odPrice, int prodId, int ordersId) {
		this.amount = amount;
		this.odPrice = odPrice;
		this.prodId = prodId;
		this.ordersId = ordersId;
	}
	
	
	
}
