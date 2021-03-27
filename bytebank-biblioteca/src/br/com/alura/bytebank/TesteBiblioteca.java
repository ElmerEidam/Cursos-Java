package br.com.alura.bytebank;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;

public class TesteBiblioteca {

	public static void main(String[] args) {

		Conta c = new ContaCorrente(123, 321);
		
		c.depositar(500.50);
		
		System.out.println(c.getSaldo());

	}

}
