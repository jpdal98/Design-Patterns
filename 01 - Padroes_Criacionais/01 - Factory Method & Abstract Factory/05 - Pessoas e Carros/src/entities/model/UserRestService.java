package entities.model;

public class UserRestService implements UserService{

	@Override
	public void salvar(String nome) {
		System.out.println("Salvando " + nome + " Atraves do Serviço Rest");
	}
	
	@Override
	public void delete(String nome) {
		System.out.println("deletando " + nome + " Atraves do Serviço Rest");
	}
}
