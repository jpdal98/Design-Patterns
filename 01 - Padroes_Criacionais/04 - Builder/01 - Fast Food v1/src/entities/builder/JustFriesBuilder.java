package entities.builder;

public class JustFriesBuilder extends FastFoodBuilder {
	@Override
	public void buildDrink() {
		// no drink
	}

	@Override
	public void buildMain() {
		// no main
	}

	@Override
	public void buildSide() {
		meal.setSide("Large Fries");
	}

	@Override
	public void buildDessert() {
		// no dessert
	}

	@Override
	public void buildGift() {
		// no gift
	}
}
