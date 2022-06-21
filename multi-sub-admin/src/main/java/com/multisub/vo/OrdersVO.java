package com.multisub.vo;

import java.util.Date;

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
public class OrdersVO {
	private int id;
	private int price;
	private String payInfo;
	private Date regdate;
	private String payState;
	private Date udate;
	private String usersId;
	private int couponDId;
	
	public OrdersVO(int id, int price, String payInfo, String payState, String usersId, int couponDId) {
		
		this.id = id;
		this.price = price;
		this.payInfo = payInfo;
		this.payState = payState;
		this.usersId = usersId;
		this.couponDId = couponDId;
	}
	
}

