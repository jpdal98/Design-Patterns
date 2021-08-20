package entities.factory;

import entities.model.ConnectionBD;
import entities.model.ConnectionBDPostgresSQL;

public class ConnectionPostgresSQLFactory implements ConnectionAbstractFactory{

	@Override
	public ConnectionBD criandoConexao() {
		return new ConnectionBDPostgresSQL();
	}
}
