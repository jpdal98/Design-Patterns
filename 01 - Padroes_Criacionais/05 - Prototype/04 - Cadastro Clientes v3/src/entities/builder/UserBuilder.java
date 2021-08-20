package entities.builder;

import entities.model.Address;
import entities.model.User;

public class UserBuilder {

	private String name;
	private Integer age;
	private Address address;
	
	public UserBuilder(String name, Integer age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public UserBuilder withName(String name) {
		this.name = name;
		return this;
	}
	
	public UserBuilder withAge(Integer age) {
		this.age = age;
		return this;
	}

	public UserBuilder withAddress(Address address) {
		this.address = address;
		return this;
	}
	
	public User now() {
		return new User(name, age, address);
	}
	
}
