package entities.model;

public class UserEJBService implements UserService{

	@Override
	public void salvar(String nome) {
		System.out.println("Salvando " + nome + " Atraves do Servi�o EJB");
	}
	
	@Override
	public void delete(String nome) {
		System.out.println("deletando " + nome + " Atraves do Servi�o EJB");
	}
}
