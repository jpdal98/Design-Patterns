package entities.model;

public class ConnectionBDPostgresSQL implements ConnectionBD {

	@Override
	public void estabelecendoConexao() {
		System.out.println("Conexao estabelecida com o Banco PostgresSQL!!");
	}
}
