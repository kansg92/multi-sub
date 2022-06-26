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
public class ProductVO {
	private int id;
	private String name;
	private int price;
	private String imgname;
	private Date regdate;
	private int cateId;
	private int nutId;
	
	private int sessionNum;
	
	public ProductVO(int id, String name, int price, String imgname) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.imgname = imgname;
	}
	public ProductVO(int id, String name, int price, String imgname, int cateId, int nutId) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.imgname = imgname;
		this.cateId = cateId;
		this.nutId = nutId;
	}
	
	public ProductVO(int id, String name, int price, String imgname, Date regdate, int cateId, int nutId) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.imgname = imgname;
		this.regdate = regdate;
		this.cateId = cateId;
		this.nutId = nutId;
	}
	
	
}

