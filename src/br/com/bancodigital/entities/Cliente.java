package br.com.bancodigital.entities;

public class Cliente {

	private String nome;
	private long cpf;
	private String telefone;
	private String endereco;
	private char tipoCliente;
	private double saldo;

	public Cliente() {
	}

	public Cliente(String nome, long cpf, String telefone, String endereco, char tipoCliente, double saldo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		this.tipoCliente = tipoCliente;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public char getTipoCliente() {
		return tipoCliente;
	}
	
	public void setTipoCliente(char tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
