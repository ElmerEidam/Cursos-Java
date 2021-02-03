public class Conta {
	private double saldo;
	int agencia;
	private int numero;
	Cliente titular;
	
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

	public boolean transferir(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.depositar(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
}
