package entities.factory;

import entities.model.Iphone;
import entities.model.Iphone11;
import entities.model.Iphone11Pro;
import entities.model.Iphone11ProMax;

public class Iphone11Factory implements IphoneFactory{

	public Iphone criarIphone(String nome) throws Exception {
		Iphone iphone = null;
		if(nome.equals("iPhone 11")) {
			 iphone = new Iphone11();
			 return iphone;
		}else if(nome.equals("iPhone 11 Pro")) {
			iphone = new Iphone11Pro();
			return iphone;
		}else if (nome.equals("iPhone 11 Pro Max")) {
			iphone = new Iphone11ProMax();
			return iphone;
		}else {
			throw new Exception("Esse iphone não existe!!");
		}
	}
}
