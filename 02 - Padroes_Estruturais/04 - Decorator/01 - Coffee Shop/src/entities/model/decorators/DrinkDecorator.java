package entities.model.decorators;

import entities.model.Drink;

public abstract class DrinkDecorator implements Drink {
	protected Drink drink;
	
	public DrinkDecorator(Drink drink) {
		this.drink = drink;
	}
}