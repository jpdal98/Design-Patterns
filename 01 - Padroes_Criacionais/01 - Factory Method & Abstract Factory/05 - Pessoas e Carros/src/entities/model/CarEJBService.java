package entities.model;

public class CarEJBService implements CarService{

	@Override
	public void salvar(String modelo) {
		System.out.println("Salvando " + modelo + " Atraves do Serviço EJB");
	}
	
	@Override
	public void atualizar(String novoModelo) {
		System.out.println("deletando " + novoModelo + " Atraves do Serviço EJB");
	}
}
