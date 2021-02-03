
public abstract class Conta {
	public double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Nova conta: " + this.numero + " criada na agência: " + this.agencia);
		Conta.total++;
	}

	public abstract void depositar(double valor);

	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Valor retirado com sucesso!");
			return true;
		} else {
			System.out.println("Valor não retirado!");
			return false;
		}
	}

	public boolean transferir(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.depositar(valor);
			System.out.println("Valor transferido com sucesso!");
			return true;
		}
		return false;
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
}
