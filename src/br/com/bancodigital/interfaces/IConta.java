package br.com.bancodigital.interfaces;

public interface IConta {
	
	void depositar(double valor);
	void sacar(double valor);
	void transferir(double valor);
	void emprestimo(double valor);
	void imprimirExtrato();
	
}
