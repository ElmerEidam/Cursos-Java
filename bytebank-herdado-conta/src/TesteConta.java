
public class TesteConta {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.depositar(5000);

		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.depositar(200);

		cc.transferir(300, cp);

		System.out.println("CC: R$" + cc.getSaldo());
		System.out.println("CP: R$" + cp.getSaldo());

	}
}
