package com.multisub.vo;

import org.springframework.web.multipart.MultipartFile;

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
public class ToppingVO {
	private int id;
	private String name;
	private int Price;
	private String imgname;
	private int cateId;
	private MultipartFile mf;
}
