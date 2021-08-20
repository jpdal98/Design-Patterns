package entities.model;

public class MonstroTerra extends Monstro{

	private String doenca;

	public MonstroTerra() {
		super();
	}

	public MonstroTerra(String nome, String dano, String poder, String doenca) {
		super(nome, dano, poder);
		this.doenca = doenca;
	}

	public String getDoenca() {
		return doenca;
	}

	public void setDoenca(String doenca) {
		this.doenca = doenca;
	}

	@Override
	public String toString() {
		return "[ nome: " + getNome() + ", dano: " + getDano() + ", poder: " + getPoder() + ", doença: " + doenca + " ]";
	}
	
	
}
