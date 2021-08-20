package application;

import java.util.Scanner;
import entities.factory.ConnectionAbstractFactory;
import entities.factory.ConnectionMySQLFactory;
import entities.factory.ConnectionPostgresSQLFactory;
import entities.model.ConnectionBD;

public class Programa {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		try {
			ConnectionAbstractFactory connection = null;
			ConnectionBD BD = null;
			System.out.println("Digite qual SGBD voce deseja utilizar:(1 - MySQL/ 2 - PostgresSQL)");
			String resposta = sc.nextLine();
			switch (resposta) {
			case "1": {
				connection = new ConnectionMySQLFactory();
				BD = connection.criandoConexao();
				BD.estabelecendoConexao();
				break;
			}
			case "2": {
				connection = new ConnectionPostgresSQLFactory();
				BD = connection.criandoConexao();
				BD.estabelecendoConexao();
				break;
			}
			default:
				throw new Exception("esta opção não existe");
			}
		}
		catch(Exception e ) {
			System.out.println("error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
