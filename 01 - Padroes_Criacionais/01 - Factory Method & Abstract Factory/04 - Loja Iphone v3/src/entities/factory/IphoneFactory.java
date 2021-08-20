package entities.factory;

import entities.model.Iphone;

public interface IphoneFactory {

	public Iphone criarIphone(String nome) throws Exception;
}
