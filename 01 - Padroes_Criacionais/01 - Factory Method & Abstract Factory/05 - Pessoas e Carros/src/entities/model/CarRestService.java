package entities.model;

public class CarRestService implements CarService{

	@Override
	public void salvar(String modelo) {
		System.out.println("Salvando " + modelo + " Atraves do Servi�o Rest");
	}
	
	@Override
	public void atualizar(String novoModelo) {
		System.out.println("deletando " + novoModelo + " Atraves do Servi�o Rest");
	}
	
}
