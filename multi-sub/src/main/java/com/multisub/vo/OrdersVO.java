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
	private int sumprice;
	private String payInfo;
	private Date regdate;
	private String payState;
	private Date udate;
	private String usersId;
	
	
}

