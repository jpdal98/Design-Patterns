package entities.model;

public class ConnectionBDMySQL implements ConnectionBD{

	@Override
	public void estabelecendoConexao() {
		System.out.println("Conexao estabelecida com o Banco MySQL!!");
	}
	
}
