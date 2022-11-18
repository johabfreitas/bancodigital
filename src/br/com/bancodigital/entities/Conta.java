package br.com.bancodigital.entities;

public class Conta {

	private int agencia;
	private int numeroConta;
	private double deposit;
	public final double tax = 5.00;

	public Conta() {

	}

	public Conta(int agencia, int numeroConta, double deposit) {
		super();
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.deposit = deposit;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getTax() {
		return tax;
	}

}
