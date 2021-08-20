package application;

import java.util.Scanner;

import entities.builder.ContaConrrenteBuilder;
import entities.model.ContaCorrente;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ContaCorrente conta = new ContaConrrenteBuilder("Paulo", "70719808", "074.839.423-04").dadosConta();
		System.out.println("Dados da Conta Corrente:");
		System.out.println(conta);
		System.out.println("Deseja fazer o cadastro completo?(s/n)");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			conta = new ContaConrrenteBuilder("Paulo", "70719808", "074.839.423-04").deposito(3000).fone("40028922")
					.nomeMae("Merdonia").dadosConta();
			System.out.println(conta);
			sc.close();
		} else if (resposta == 'n') {
			sc.close();
		} else {
			sc.close();
			throw new IllegalArgumentException("Unexpected value: " + resposta);
		}
	}

}
