package entities.model;

import entities.builder.UserBuilder;

public class User implements Cloneable {
	private final String name;
	private final Integer age;
	private final Address address;
	
	public User(String name, Integer age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	@Override
	protected User clone() throws CloneNotSupportedException {
		Address cloneAddress = (Address) address.clone();
		return new User(name, age, cloneAddress);
	}
	
	public UserBuilder cloneBuilder() {
		return new UserBuilder(name, age, address);
	}
}
