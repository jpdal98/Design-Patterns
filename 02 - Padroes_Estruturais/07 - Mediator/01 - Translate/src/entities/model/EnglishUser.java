package entities.model;

import entities.mediator.Mediator;

public class EnglishUser extends User {

	public EnglishUser(String name, Mediator mediator) {
		super(name, mediator, Language.ENGLISH);
	}
	
}
