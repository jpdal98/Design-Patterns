package entities.factory;

import entities.model.Monstro;
import entities.model.MonstroAgua;
import entities.model.MonstroFogo;
import entities.model.MonstroGelo;
import entities.model.MonstroTerra;

public class FactoryMonstros {

	public Monstro criarMonstro(String tipoMonstro) throws Exception {
		Monstro monstro = null;
		if(tipoMonstro.equals("fogo")) {
			monstro = new MonstroFogo("Meurem", "1000", "bater", "Jogar shougi");
			return monstro;
		}else if(tipoMonstro.equals("gelo")) {
			monstro = new MonstroGelo("Cid", "500", "Rajada de gelo", 350);
			return monstro;
		}else if(tipoMonstro.equals("terra")) {
			monstro = new MonstroTerra("Ptolomeu", "750", "Tacar a pedrada", "Dor nas costas");
			return monstro;
		}else if(tipoMonstro.equals("agua")) {
			monstro = new MonstroAgua("Katara", "300", "Rajada de agua", "Turbilhão de agua");
			return monstro;
		}else{
			throw new Exception("este monstro não existe!!");
		}
	}
	
}
