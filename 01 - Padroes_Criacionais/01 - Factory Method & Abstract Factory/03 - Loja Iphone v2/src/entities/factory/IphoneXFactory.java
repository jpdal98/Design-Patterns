package entities.factory;

import entities.model.Iphone;
import entities.model.IphoneX;
import entities.model.IphoneXR;
import entities.model.IphoneXS;
import entities.model.IphoneXSMax;

public class IphoneXFactory extends IphoneFactory{

	@Override
	public Iphone criarIphone(String nome) throws Exception {
		Iphone iphone = null;
		if(nome.equals("iPhone X")) {
			 iphone = new IphoneX();
			 return iphone;
		}else if(nome.equals("iPhone XR")) {
			iphone = new IphoneXR();
			return iphone;
		}else if (nome.equals("iPhone XS")) {
			iphone = new IphoneXS();
			return iphone;
		}else if (nome.equals("iPhone XSMax")) {
			iphone = new IphoneXSMax();
			return iphone;
		}
			throw new Exception("Esse iphone não existe!!");
		
	}
}
