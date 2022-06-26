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
public class ChartVO {
	public int sales ;
	public String sdate;
	public int ordercnt;
	public String payinfo;
	public int userType100;
	public int userType200;
	
	public String catename;
	
	public int picard;
	public int picash;
	public int pipay;
	
	
	public ChartVO(int sales, String sdate, int userType100, int userType200) { //saleschart
		this.sales = sales;
		this.sdate = sdate;
		this.userType100 = userType100;
		this.userType200 = userType200;
	}
	
	public ChartVO(String sdate, int userType100, int userType200) { 
		this.sdate = sdate;
		this.userType100 = userType100;
		this.userType200 = userType200;
	}

	public ChartVO(String sdate, int picard, int picash, int pipay) {
		//paychart
		//this.sales = sales;
		this.sdate = sdate;
		this.picard = picard;
		this.picash = picash;
		this.pipay = pipay;
	}

	public ChartVO(int sales, String catename) { //catechart
		this.sales = sales;
		this.catename = catename;
	}
	
	
	
	
	
	
}
