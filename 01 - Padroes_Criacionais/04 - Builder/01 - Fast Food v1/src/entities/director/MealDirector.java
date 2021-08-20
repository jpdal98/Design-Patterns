package entities.director;

import entities.builder.FastFoodBuilder;
import entities.model.FastFood;

public class MealDirector {

	private FastFoodBuilder builder;

	public MealDirector(FastFoodBuilder builder) {
		this.builder = builder;
	}
	
	public void constructCombo() {
		builder.buildDrink();
		builder.buildMain();
		builder.buildSide();
		builder.buildDessert();
		builder.buildGift();
	}
	
	public FastFood getCombo() {
		return builder.getMeal();
	}
}
