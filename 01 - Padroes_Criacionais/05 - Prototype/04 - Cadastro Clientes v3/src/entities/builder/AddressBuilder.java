package entities.builder;

import entities.model.Address;

public class AddressBuilder {

	private String street;
	private Integer number;
	
	private AddressBuilder(String street, Integer number) {
		this.street = street;
		this.number = number;
	}
	
	public AddressBuilder withStreet(String street) {
		this.street = street;
		return this;
	}
	
	public AddressBuilder withNumber(Integer number) {
		this.number = number;
		return this;
	}
	
	public Address now() {
		return new Address(street, number);
	}
}
