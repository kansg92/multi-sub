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
public class NutritionVO {
 
	public NutritionVO(double kcal, double gram, double protein, double fat, double sugar, double salt) {
		this.kcal=kcal;
		this.gram=gram;
		this.protein=protein;
		this.fat=fat;
		this.sugar=sugar;
		this.salt=salt;
	}
		
	private int id;
	private double kcal;
	private double gram;
	private double protein;
	private double fat;
	private double sugar;
	private double salt;
	
	
}
