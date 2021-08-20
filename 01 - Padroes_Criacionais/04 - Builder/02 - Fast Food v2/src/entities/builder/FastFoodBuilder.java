package entities.builder;

import entities.model.FastFood;

public class FastFoodBuilder {
		//Mandatory
		private String side;
		
		//Optionals
		private String drink;
		private String main;
		private String dessert;
		private String gift;
		
		public FastFoodBuilder(String side) {
			this.side = side;
		}

		public FastFoodBuilder forDrink(String drink) {
			this.drink = drink;
			return this;
		}
		
		public FastFoodBuilder andMain(String main) {
			this.main = main;
			return this;
		}

		public FastFoodBuilder andDessert(String dessert) {
			this.dessert = dessert;
			return this;
		}

		public FastFoodBuilder andGift(String gift) {
			this.gift = gift;
			return this;
		}
		
		public FastFood thatsAll() {
			return new FastFood(drink, main, side, dessert, gift);
		}
}
