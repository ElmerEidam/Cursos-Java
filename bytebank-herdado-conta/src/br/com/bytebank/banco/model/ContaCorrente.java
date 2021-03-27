package br.com.bytebank.banco.model;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) { // construtor recebe os mesmos parâmetros do construtor da classe
													// mãe
		super(agencia, numero); // chamando o construtor da classe mãe
	}

	@Override // sobrescrever o método
	public void sacar(double valor) {
		double valorASacar = valor + 0.2;
		super.sacar(valorASacar);
	}

	@Override
	public void depositar(double valor) {
		super.saldo += valor;
		System.out.println("Valor depositado com sucesso!");
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		return "Conta Corrente | " + super.toString();
	}

}
