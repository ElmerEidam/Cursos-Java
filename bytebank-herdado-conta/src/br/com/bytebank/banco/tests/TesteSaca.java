package br.com.bytebank.banco.tests;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.SaldoInsuficienteException;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);

		conta.depositar(200.0);
		try {
			conta.sacar(210.0);
		} catch (SaldoInsuficienteException ex) {
			System.out.println("Exceção: " + ex.getMessage());
		}
		System.out.println(conta.getSaldo());
	}

}
