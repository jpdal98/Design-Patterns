package application;

import entities.factory.EJBAbstractFactory;
import entities.factory.RestAbstractFactory;
import entities.factory.ServiceAbstractFactory;
import entities.model.CarService;
import entities.model.UserService;

public class Programa {

	public static void main(String[] args) {
		
		ServiceAbstractFactory factory = new RestAbstractFactory();
		ServiceAbstractFactory factory2 = new EJBAbstractFactory();
		
		UserService user1 = factory.getUserService();
		UserService user2 = factory2.getUserService();
		CarService car1 = factory.getCarService();
		CarService car2 = factory2.getCarService();
		
		
		user1.salvar("Paulo");
		user1.delete("Paulo");
		System.out.println("");
		user2.salvar("Pedro");
		user2.delete("Pedro");
		System.out.println("");
		
		car1.salvar("Empala");
		car1.atualizar("Fusca");
		System.out.println("");
		car2.salvar("Carrinho de rolimão");
		car2.atualizar("Relampago mcqueen");

	}

}
