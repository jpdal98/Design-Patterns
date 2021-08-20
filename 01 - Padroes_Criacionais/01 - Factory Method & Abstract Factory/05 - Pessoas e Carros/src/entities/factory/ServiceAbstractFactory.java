package entities.factory;

import entities.model.CarService;
import entities.model.UserService;

public interface ServiceAbstractFactory {

	UserService getUserService();
	CarService getCarService();
}
