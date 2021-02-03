package bytebank;

public class contaCorrente {
	double saldo;
	int agencia;
	int numero;
	String titular;

	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Valor depositado com sucesso!");
		System.out.println("Saldo: R$" + saldo);
	}

	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transferir(double valor, contaCorrente destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.depositar(valor);
			return true;
		}
		return false;
	}

}
