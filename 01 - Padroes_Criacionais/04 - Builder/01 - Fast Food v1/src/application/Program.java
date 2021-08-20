package application;

import entities.builder.FastFoodBuilder;
import entities.builder.FatMealBuilder;
import entities.builder.JustFriesBuilder;
import entities.builder.Menu1Builder;
import entities.builder.Menu2Builder;
import entities.director.MealDirector;

public class Program {

	public static void order(String name, FastFoodBuilder builder) {
		System.out.println("Ordering a " + name);
		MealDirector director = new MealDirector(builder);
		director.constructCombo();
		System.out.println(director.getCombo());
		
		System.out.println("------------------");
	}

	public static void main(String[] args) {
		order("Burguer", new Menu1Builder());
		order("Veggie Burguer", new Menu2Builder());
		order("Just Fries", new JustFriesBuilder());
		order("Heart Atack", new FatMealBuilder());
	}

}
