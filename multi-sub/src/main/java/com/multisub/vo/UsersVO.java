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
public class UsersVO {
		
	private String id;
	private String pwd;
	private String name;
	private String email;
	private String addr;
	private String phone;
	private int point;
	private String membersip;
	private String regdate;
	private int userTypeId;
	
	
	private int oprice;
	private String opayInfo;
	private String opayState;
	private String oudate;
	
	private String cdstate;
	private int cdcouponId;
	private int cdordersDId;
	
	private String utuserType;

	public UsersVO(String id, String pwd, String name, String email, String addr, String phone, int point,
			String membersip, String regdate, int userTypeId) {
		
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.addr = addr;
		this.phone = phone;
		this.point = point;
		this.membersip = membersip;
		this.regdate = regdate;
		this.userTypeId = userTypeId;
	}
	
	
	
	public UsersVO(String pwd, String name, String email, String addr, String phone, int point,
			String membersip, String regdate, int userTypeId) {
		
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.addr = addr;
		this.phone = phone;
		this.point = point;
		this.membersip = membersip;
		this.regdate = regdate;
		this.userTypeId = userTypeId;
	}



	public UsersVO(String id, String pwd, String name, String email, String addr, String phone, int point,
			String membersip, int userTypeId) {
		
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.addr = addr;
		this.phone = phone;
		this.point = point;
		this.membersip = membersip;
		this.userTypeId = userTypeId;
	}
	
	
	
}