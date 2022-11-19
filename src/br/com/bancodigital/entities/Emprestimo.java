package br.com.bancodigital.entities;

public class Emprestimo {

	private int parcelas;
	private final double juros = 0.075;
	private double valor;

	public Emprestimo() {
	}

	public Emprestimo(int parcelas, double valor) {
		this.parcelas = parcelas;
		this.valor = valor;
	}

	public int getParcelas() {
		return parcelas;
	}

	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double valorDoEmprestimo(double valor, int parcelas) {
		return (valor * juros + valor) / parcelas;

	}

}
