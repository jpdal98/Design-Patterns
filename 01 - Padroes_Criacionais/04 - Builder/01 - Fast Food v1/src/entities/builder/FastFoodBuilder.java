package entities.builder;

import entities.model.FastFood;

public abstract class FastFoodBuilder {

	// meal significa refeição
	protected FastFood meal;

	public FastFoodBuilder() {
		meal = new FastFood();
	}
	
	public FastFood getMeal() {
		return meal;
	}
	
	public abstract void buildDrink();
	public abstract void buildMain();
	public abstract void buildSide();
	public abstract void buildDessert();
	public abstract void buildGift();
	
}
