package entities.builder;

public class Menu1Builder extends FastFoodBuilder {
	@Override
	public void buildDrink() {
		meal.setDrink("Coke");
	}

	@Override
	public void buildMain() {
		meal.setMain("Cheeseburguer");
	}

	@Override
	public void buildSide() {
		meal.setSide("Fries");
	}

	@Override
	public void buildDessert() {
		meal.setDessert("Apple Pie");
	}

	@Override
	public void buildGift() {
		meal.setGift("Avenger's Toy");
	}
}
