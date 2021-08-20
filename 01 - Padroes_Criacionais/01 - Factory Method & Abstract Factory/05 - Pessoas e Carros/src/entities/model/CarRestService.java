package entities.model;

public class CarRestService implements CarService{

	@Override
	public void salvar(String modelo) {
		System.out.println("Salvando " + modelo + " Atraves do Serviço Rest");
	}
	
	@Override
	public void atualizar(String novoModelo) {
		System.out.println("deletando " + novoModelo + " Atraves do Serviço Rest");
	}
	
}
