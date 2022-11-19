package br.com.bancodigital.entities;

public class Emprestimo {

	private int parcelas;
	private double juros;
	private double valor;

	public Emprestimo() {
	}

	public Emprestimo(int parcelas, double juros, double valor) {
		this.parcelas = parcelas;
		this.juros = juros;
		this.valor = valor;
	}

	public int getParcelas() {
		return parcelas;
	}

	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
