package br.com.bytebank.banco.model;

//a palavra reservada SUPER significa que o atributo está definido na classe mãe

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero) { //construtor recebe os mesmos parâmetros do construtor da classe mãe
		super(agencia, numero); //chamando o construtor da classe mãe 
	}

	@Override
	public void depositar(double valor) {
		super.saldo += valor;
		System.out.println("Valor depositado com sucesso!");		
	}	
	
	@Override
	public String toString() {
		return "Conta Poupança | " + super.toString();
	}
	
}
