package entities.factory;

import entities.model.Iphone;

public abstract class IphoneFactory {

	public abstract Iphone criarIphone(String nome) throws Exception;
}
