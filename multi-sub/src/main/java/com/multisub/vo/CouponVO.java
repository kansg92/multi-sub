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
public class CouponVO {
	
	private int id;
	private String name;
	private double discount;
	private Date regdate;
	private String expirDate;
	private boolean expirYN;
		
	
	public CouponVO(int id, String name, double discount, String expirDate, boolean expirYN) {
	
		this.id = id;
		this.name = name;
		this.discount = discount;
		this.expirDate = expirDate;
		this.expirYN = expirYN;
	}

	
	
}