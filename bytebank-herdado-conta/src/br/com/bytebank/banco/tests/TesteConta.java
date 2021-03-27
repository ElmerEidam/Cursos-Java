package br.com.bytebank.banco.tests;

import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

public class TesteConta {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.depositar(5000);

		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.depositar(200);

		cc.transferir(300, cp);

//		System.out.println(cc);
//		System.out.println(cp);

		System.out.println(cc + ", Saldo R$" + cc.getSaldo());
		System.out.println(cp + ", Saldo R$" + cp.getSaldo());
	}
}
