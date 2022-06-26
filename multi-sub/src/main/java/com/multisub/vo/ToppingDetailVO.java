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
	private int tamount;
	private int tdPrice;
	private int toppingId;
	private int ordersDId;
	
	private String toppingName;

	public ToppingDetailVO( int tdPrice, int toppingId, int ordersDId) {

		this.tdPrice = tdPrice;
		this.toppingId = toppingId;
		this.ordersDId = ordersDId;
	}
	
}