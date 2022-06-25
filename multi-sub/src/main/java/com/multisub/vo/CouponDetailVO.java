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
public class CouponDetailVO {
	private int id;
	private String state;
	private String useDate;
	private String userId;
	private int couponId;
	private int ordersDId;
	
	private String cname;
	private double cdiscount;
	private String cregdate;
	private String cexpirDate;
	private boolean cexpirYN;
	
	private String usname;
	private int uspoint;
	
	private int ordprice;
	private int ordersId;
	
	public CouponDetailVO(int id, String state, String useDate, String userId, int couponId, int ordersDId) {
		
		this.id = id;
		this.state = state;
		this.useDate = useDate;
		this.userId = userId;
		this.couponId = couponId;
		this.ordersDId = ordersDId;
	}

	public CouponDetailVO(String state, String useDate, String userId, int couponId, int ordersDId) {
		
		this.state = state;
		this.useDate = useDate;
		this.userId = userId;
		this.couponId = couponId;
		this.ordersDId = ordersDId;
	}
	
	
}