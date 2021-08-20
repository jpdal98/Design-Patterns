package entities.factory;

import entities.model.CarEJBService;
import entities.model.CarService;
import entities.model.UserEJBService;
import entities.model.UserService;

public class EJBAbstractFactory implements ServiceAbstractFactory{

	@Override
	public UserService getUserService() {
		return new UserEJBService();
	}
	
	@Override
	public CarService getCarService() {
		return new CarEJBService();
	}
}
