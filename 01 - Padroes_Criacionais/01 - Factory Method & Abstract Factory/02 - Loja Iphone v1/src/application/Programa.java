package application;

import java.util.Scanner;

import entities.factory.IphoneFactory;
import entities.model.Iphone;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			IphoneFactory iphone = new IphoneFactory();
			Iphone produto = null;
			System.out.println("Produtos:");
			System.out.println("1 - (iPhone 11/iPhone 11 Pro/iPhone 11 Pro Max)");
			System.out.println("2 - (iPhone 12/iPhone 12 Mini/iPhone 12 Pro/iPhone 12 Pro Max)");
			System.out.println("3 - (iPhone X/iPhone XR/iPhone XS/iPhone XSMax)");
			System.out.println("");
			System.out.println("Digite qual seção de produtos voce deseja visualizar as informações:");
			String r = sc.nextLine();
			String nome;
			switch(r) {
			case "1": 
				System.out.println("(iPhone 11/iPhone 11 Pro/iPhone 11 Pro Max)");
				System.out.println("Digite qual destes produtos voce deseja ver as informações:");
				nome = sc.nextLine();
				produto = iphone.criarIphone11(nome);
				produto.configuracoes();
				break;
			case "2":
				System.out.println("(iPhone 12/iPhone 12 Mini/iPhone 12 Pro/iPhone 12 Pro Max)");
				System.out.println("Digite qual destes produtos voce deseja ver as informações:");
				nome = sc.nextLine();
				produto = iphone.criarIphone12(nome);
				produto.configuracoes();
				break;
			case "3":
				System.out.println("(iPhone X/iPhone XR/iPhone XS/iPhone XSMax)");
				System.out.println("Digite qual destes produtos voce deseja ver as informações:");
				nome = sc.nextLine();
				produto = iphone.criarIphoneX(nome);
				produto.configuracoes();
				break;
			default : 
				System.out.println("esta seção não existe!!");
				break;
			}
			
		}
		catch(Exception e ) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
		}
		
	}

}
