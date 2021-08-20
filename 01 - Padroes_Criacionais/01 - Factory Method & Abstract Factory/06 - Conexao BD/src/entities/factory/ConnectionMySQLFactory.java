package entities.factory;

import entities.model.ConnectionBD;
import entities.model.ConnectionBDMySQL;

public class ConnectionMySQLFactory implements ConnectionAbstractFactory{

	@Override
	public ConnectionBD criandoConexao() {
		return new ConnectionBDMySQL();
	}
}
