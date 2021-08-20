package entities.builder;

import entities.model.ContaCorrente;

public class ContaConrrenteBuilder {

	//Obrigatorio
	private String nome;
	private String senha;
	private String cpf;
	
	//Opcional
	private double saldo;
	private String nomeMae;
	private String telefone;
	
	public ContaConrrenteBuilder(String nome, String senha, String cpf) {
		this.nome = nome;
		this.senha = senha;
		this.cpf = cpf;
	}
	
	public ContaConrrenteBuilder deposito(double valor) {
		this.saldo = valor;
		return this;
	}
	
	public ContaConrrenteBuilder nomeMae(String nome) {
		this.nomeMae = nome;
		return this;
	}
	
	public ContaConrrenteBuilder fone(String numero) {
		this.telefone = numero;
		return this;
	}
	
	public ContaCorrente dadosConta() {
		return new ContaCorrente(nome, senha, saldo, cpf, nomeMae, telefone);
	}
}
