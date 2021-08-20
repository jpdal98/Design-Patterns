package entities.model;

public class MonstroGelo extends Monstro{

	private int idade;

	public MonstroGelo() {
		super();
	}

	public MonstroGelo(String nome, String dano, String poder, int idade) {
		super(nome, dano, poder);
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "[ nome: " + getNome() + ", dano: " + getDano() + ", poder: " + getPoder() + ", idade: " + idade + " ]";
	}
	
	
}
