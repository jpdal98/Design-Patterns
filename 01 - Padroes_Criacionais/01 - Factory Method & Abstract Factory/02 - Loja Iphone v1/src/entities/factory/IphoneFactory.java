package entities.factory;

import entities.model.Iphone;
import entities.model.Iphone11;
import entities.model.Iphone11Pro;
import entities.model.Iphone11ProMax;
import entities.model.Iphone12;
import entities.model.Iphone12Mini;
import entities.model.Iphone12Pro;
import entities.model.Iphone12ProMax;
import entities.model.IphoneX;
import entities.model.IphoneXR;
import entities.model.IphoneXS;
import entities.model.IphoneXSMax;

public class IphoneFactory {

	public Iphone criarIphone11(String nome) throws Exception {
		Iphone iphone = null;
		if (nome.equals("iPhone 11")) {
			iphone = new Iphone11();
			return iphone;
		} else if (nome.equals("iPhone 11 Pro")) {
			iphone = new Iphone11Pro();
			return iphone;
		} else if (nome.equals("iPhone 11 Pro Max")) {
			iphone = new Iphone11ProMax();
			return iphone;
		} else {
			throw new Exception("Esse iphone não existe!!");
		}
	}

	public Iphone criarIphone12(String nome) throws Exception {
		Iphone iphone = null;
		if (nome.equals("iPhone 12")) {
			iphone = new Iphone12();
			return iphone;
		} else if (nome.equals("iPhone 12 Mini")) {
			iphone = new Iphone12Mini();
			return iphone;
		} else if (nome.equals("iPhone 12 Pro")) {
			iphone = new Iphone12Pro();
			return iphone;
		} else if (nome.equals("iPhone 12 Pro Max")) {
			iphone = new Iphone12ProMax();
			return iphone;
		} else {
			throw new Exception("Esse iphone não existe!!");
		}
	}

	public Iphone criarIphoneX(String nome) throws Exception {
		Iphone iphone = null;
		if (nome.equals("iPhone X")) {
			iphone = new IphoneX();
			return iphone;
		} else if (nome.equals("iPhone XR")) {
			iphone = new IphoneXR();
			return iphone;
		} else if (nome.equals("iPhone XS")) {
			iphone = new IphoneXS();
			return iphone;
		} else if (nome.equals("iPhone XSMax")) {
			iphone = new IphoneXSMax();
			return iphone;
		} else {
			throw new Exception("Esse iphone não existe!!");
		}
	}
}
