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
public class ToppingDetailVO {
	private int id;
	private int amount;
	private int toppingId;
	private int ordersDId;
	
	private int tdprice;
	private String toppingName;
	
	public ToppingDetailVO(int id, int amount, int toppingId, int ordersDId) {
		this.id = id;
		this.amount = amount;
		this.toppingId = toppingId;
		this.ordersDId = ordersDId;
	}

	
	
	
	
}
