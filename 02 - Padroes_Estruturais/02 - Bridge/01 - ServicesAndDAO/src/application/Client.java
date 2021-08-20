package application;

import entities.dao.UserMongoDao;
import entities.dao.UserMysqlDao;
import entities.dao.UserOracleDao;
import entities.dao.UserPostgresDao;
import entities.model.User;
import entities.services.UserEJB;
import entities.services.UserRest;
import entities.services.UserService;
import entities.services.UserSoap;

public class Client {

	public static void main(String[] args) {
		User user = new User("user", "user@email.com", "passwd");

		UserService userRestOracleService = new UserRest(new UserOracleDao());
		userRestOracleService.save(user);

		UserService userEJBMongoService = new UserEJB(new UserMongoDao());
		userEJBMongoService.save(user);

		UserService userSoapPostgresService = new UserSoap(new UserPostgresDao());
		userSoapPostgresService.save(user);

		// .......

		UserService userRestMysqlService = new UserRest(new UserMysqlDao());
		userRestMysqlService.save(user);

	}

}
