package application;

import java.util.Scanner;

import entities.factory.FactoryMonstros;
import entities.model.Monstro;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Digite o tipo do monstro que voce deseja criar:(fogo/gelo/terra/agua) ");
			String tipoMonstro = sc.next();
			FactoryMonstros fabrica = new FactoryMonstros();
			Monstro monstro = fabrica.criarMonstro(tipoMonstro);
			System.out.println("Atributos do monstro:" + monstro.toString());
			
			
		}
		catch(Exception e) {
			System.out.println("error: " + e.getMessage());
		}finally {
			if(sc != null) {
				sc.close();
			}
		}
		
	}

}
