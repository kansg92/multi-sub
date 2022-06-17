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
public class UserAuthorityVO {
	private int id;
	private String userType;
	private Date regdate ;
	
	public UserAuthorityVO(int id, String userType) {
		
		this.id = id;
		this.userType = userType;
	}
	
	
}
