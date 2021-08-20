package entities.factory;

import entities.model.Iphone;
import entities.model.Iphone12;
import entities.model.Iphone12Mini;
import entities.model.Iphone12Pro;
import entities.model.Iphone12ProMax;

public class Iphone12Factory implements IphoneFactory{

	public Iphone criarIphone(String nome) throws Exception {
		Iphone iphone = null;
		if(nome.equals("iPhone 12")) {
			 iphone = new Iphone12();
			 return iphone;
		}else if(nome.equals("iPhone 12 Mini")) {
			iphone = new Iphone12Mini();
			return iphone;
		}else if (nome.equals("iPhone 12 Pro")) {
			iphone = new Iphone12Pro();
			return iphone;
		}else if (nome.equals("iPhone 12 Pro Max")) {
			iphone = new Iphone12ProMax();
			return iphone;
		}else {
			throw new Exception("Esse iphone não existe!!");
		}
	}
}
