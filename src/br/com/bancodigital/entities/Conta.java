package br.com.bancodigital.entities;

import java.time.LocalDateTime;
import java.util.Random;

import br.com.bancodigital.interfaces.IConta;

public abstract class Conta implements IConta {

	private int agencia;
	private String numeroConta;
	private double saldo;
	public final double tax = 5.00;

	public Conta() {
	}

	public Conta(int agencia) {
		this.agencia = agencia;
		this.numeroConta = gerarNumeroConta();
		this.saldo = 0.00;
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
		return saldo;
	}

	public void setDeposit(double deposit) {
		this.saldo = deposit;
	}

	public double getTax() {
		return tax;
	}

	@Override
	public double addDeposito(double valor) {
		return saldo += valor;

	}

	@Override
	public double sacar(double valor) {
		return saldo -= valor + tax;

	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.addDeposito(valor);

	}

	public double emprestimo(double valor) {
		return saldo += valor;

	}

	@Override
	public void imprimirExtrato() {
		System.out.println("======== EXTRATO ========");
		System.out.println(LocalDateTime.now() + "-" + saldo);

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
		return "Conta [agencia=" + agencia + ", numeroConta=" + gerarNumeroConta() + ", deposit=" + saldo + ", tax="
				+ tax + "]";
	}

}
