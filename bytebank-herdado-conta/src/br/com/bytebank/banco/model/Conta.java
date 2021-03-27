package br.com.bytebank.banco.model;

/**
 * 
 * Classe que representa uma moldura de uma conta.
 * 
 * @author Elmer Eidam Junior
 * @version 0.1
 */

public abstract class Conta {
	public double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	/**
	 * Construtor para inicializar o objeto a partir da agência e número da conta
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Nova conta: " + this.numero + " criada na agência: " + this.agencia);
		Conta.total++;
	}

	public abstract void depositar(double valor);

	/**
	 * Método perigoso, joga uma exceção de saldo insuficiente.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void sacar(double valor) {
		if (this.saldo < valor) {
			System.out.println("Valor não pode ser retirado!");
			throw new SaldoInsuficienteException("Saldo: R$" + this.saldo + ", valor a ser retirado: R$" + valor);
		} else {
			this.saldo -= valor;
			System.out.println("Valor retirado com sucesso!");
		}
	}

	public void transferir(double valor, Conta destino) {
		this.sacar(valor);
		destino.depositar(valor);
		System.out.println("Valor transferido com sucesso!");
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	/*
	 * public void setNumero(int numero) { if(numero <= 0) {
	 * System.out.println("O número da conta não pode ser menor ou igual a zero.");
	 * }else this.numero = numero; }
	 */

	public int getAgencia() {
		return this.agencia;
	}

	/*
	 * public void setAgencia(int agencia) { if (agencia <= 0) {
	 * System.out.println("A agência mão pode ser menor ou igual a zero."); return;
	 * } else this.agencia = agencia; }
	 */

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public String toString() {
		return "Número: " + this.numero + ", Agência: " + this.agencia;
	}
}
