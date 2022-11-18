package br.com.bancodigital.application;

import br.com.bancodigital.entities.Conta;

public class Program {

	public static void main(String[] args) {
		
	Conta cc = new Conta();
	cc.gerarNumeroConta();
	
	System.out.println(cc);

	}

}
