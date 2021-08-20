package entities.builder;

public class FatMealBuilder extends FastFoodBuilder {
	
	@Override
	public void buildDrink() {
		meal.setDrink("MilkShake");
	}

	@Override
	public void buildMain() {
		meal.setMain("TripleCheddarBaconBurguer");
	}

	@Override
	public void buildSide() {
		meal.setSide("Onion Rings");
	}

	@Override
	public void buildDessert() {
		meal.setDessert("Large IceCream");
	}

	@Override
	public void buildGift() {
		meal.setGift("Hospital pass");
	}
}
