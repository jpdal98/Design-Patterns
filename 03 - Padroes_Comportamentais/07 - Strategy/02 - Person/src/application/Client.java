package application;

import entities.model.Person;
import entities.strategies.eat.MeatFoodStrategy;
import entities.strategies.eat.VeggieFoodStrategy;
import entities.strategies.transportation.AirplaneStrategy;
import entities.strategies.transportation.BikeStrategy;
import entities.strategies.transportation.CarStrategy;
import entities.strategies.transportation.WalkStrategy;
import entities.strategies.work.DeveloperStrategy;
import entities.strategies.work.NoWorkStrategy;
import entities.strategies.work.PilotStrategy;

public class Client {

	public static void presentYourself(Person person) {
		System.out.println("Hi, I'm " + person.getName());
		person.eat();
		person.move();
		person.work();
		System.out.println("----------------");
	}
	
	public static void main(String[] args) {
		Person jhon = new Person("Jhon", new MeatFoodStrategy(), 
				new CarStrategy(), new DeveloperStrategy());
		presentYourself(jhon);
		
		Person ann = new Person("Ann", new MeatFoodStrategy(), 
				new AirplaneStrategy(), new PilotStrategy());
		presentYourself(ann);
		
		Person carol = new Person("Carol", new VeggieFoodStrategy(), 
				new BikeStrategy(), new DeveloperStrategy());
		presentYourself(carol);
		
		Person alan = new Person("Alan", new VeggieFoodStrategy(), 
				new WalkStrategy(), new NoWorkStrategy());
		presentYourself(alan);
	}
}
