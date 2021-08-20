package application;

import entities.builder.FastFoodBuilder;
import entities.model.FastFood;

public class Program {

	public static void main(String[] args) {
		FastFood burguerCombo = new FastFoodBuilder("Fries")
				.andMain("CheeseBurger")
				.forDrink("Code")
				.thatsAll();
		System.out.println(burguerCombo);
		
		FastFood justFries = new FastFoodBuilder("Fries").thatsAll();
		System.out.println(justFries);
		
		FastFood heartAtackCombo = new FastFoodBuilder("Large Fries")
				.andMain("Monster Burguer")
				.forDrink("Milk Shake")
				.andDessert("Fudge Cake")
				.andGift("2 Kilograms")
				.thatsAll();
		System.out.println(heartAtackCombo);
	}
}
