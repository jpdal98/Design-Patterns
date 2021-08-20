package application;

import entities.model.Address;
import entities.model.User;

public class Program {

	public static void main(String[] args){
		
		User user = new User("ToClone", 25, new Address("ABC Street", 1000));
		User cloneUser = user.cloneBuilder().withName("Cloned++").now();
		cloneUser = user.cloneBuilder().withAge(30).now();
		cloneUser = user.cloneBuilder().withAddress(new Address("A Street", 500)).now();
		
		System.out.println(user.toString());
		System.out.println(cloneUser.toString());
		
	}
}