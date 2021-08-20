package entities.model;

public abstract class Monstro {

	private String nome;
	private String dano;
	private String poder;
	
	
	public Monstro() {
	}


	public Monstro(String nome, String dano, String poder) {
		this.nome = nome;
		this.dano = dano;
		this.poder = poder;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDano() {
		return dano;
	}


	public void setDano(String dano) {
		this.dano = dano;
	}

	public String getPoder() {
		return poder;
	}


	public void setPoder(String poder) {
		this.poder = poder;
	}
		
}
