package br.com.bancodigital.entities;

import java.util.Random;

import br.com.bancodigital.interfaces.IConta;

public class Conta implements IConta {

	private int agencia;
	private String numeroConta;
	private double deposit;
	public final double tax = 5.00;

	public Conta() {

	}

	public Conta(int agencia, double deposit) {
		this.agencia = agencia;
		this.numeroConta = gerarNumeroConta();
		this.deposit = deposit;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getNumeroConta() {
		return numeroConta;
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

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emprestimo(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		
	}
	
	public String gerarNumeroConta() {
		Random numeroConta = new Random();
		Random digitoConta = new Random();
		
		int numero = numeroConta.nextInt(1000, 9999);
		int digito = digitoConta.nextInt(9);
	
		return numero + "-" + digito;
	}

	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", numeroConta=" + gerarNumeroConta() + ", deposit=" + deposit + ", tax=" + tax
				+ "]";
	}
	
	

}
