package entities.model;

public class MonstroAgua extends Monstro{

	private String poderEspecial;

	public MonstroAgua() {
		super();
	}

	public MonstroAgua(String nome, String dano, String poder, String poderEspecial) {
		super(nome, dano, poder);
		this.poderEspecial = poderEspecial;
	}

	public String getPoderEspecial() {
		return poderEspecial;
	}

	public void setPoderEspecial(String poderEspecial) {
		this.poderEspecial = poderEspecial;
	}

	@Override
	public String toString() {
		return "[ nome: " + getNome() + ", dano: " + getDano() + ", poder: " + getPoder() + ", poder especial: " + poderEspecial + " ]";
	}
	
	
}
