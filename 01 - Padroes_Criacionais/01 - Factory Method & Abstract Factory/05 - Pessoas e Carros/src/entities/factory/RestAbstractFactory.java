package entities.factory;

import entities.model.CarRestService;
import entities.model.CarService;
import entities.model.UserRestService;
import entities.model.UserService;

public class RestAbstractFactory implements ServiceAbstractFactory{

	@Override
	public UserService getUserService() {
		return new UserRestService();
	}
	
	@Override
	public CarService getCarService() {
		return new CarRestService();
	}
}
