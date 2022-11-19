package br.com.bancodigital.interfaces;

public interface IConta {
	
	double addDeposito(double valor);
	double sacar(double valor);
	void transferir(double valor);
	void imprimirExtrato();
	void transferir(double valor, IConta contaDestino);
	
}
