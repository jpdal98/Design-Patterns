package entities.model;

public class MonstroFogo extends Monstro{

	private String passaTempo;

	public MonstroFogo() {
		super();
	}

	public MonstroFogo(String nome, String dano, String poder, String passaTempo) {
		super(nome, dano, poder);
		this.passaTempo = passaTempo;
	}

	public String getPassaTempo() {
		return passaTempo;
	}

	public void setPassaTempo(String passaTempo) {
		this.passaTempo = passaTempo;
	}

	@Override
	public String toString() {
		return  "[ nome: " + getNome() + ", dano: " + getDano() + ", poder: " + getPoder() + ", passatempo: " + passaTempo + " ]";
	}
	
	
}
