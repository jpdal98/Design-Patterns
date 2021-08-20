package entities.model;

public class ContaCorrente {

	private String nome;
	private String senha;
	private double saldo;
	private String cpf;
	private String nomeMae;
	private String telefone;
	
	public ContaCorrente(String nome, String senha, double saldo, String cpf, String nomeMae, String telefone) {
		this.nome = nome;
		this.senha = senha;
		this.saldo = saldo;
		this.cpf = cpf;
		this.nomeMae = nomeMae;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public String toString() {
		return "ContaCorrente [nome=" + nome + ", saldo=" + saldo + ", cpf=" + cpf + ", nomeMae=" + nomeMae
				+ ", telefone=" + telefone + "]";
	}
}
