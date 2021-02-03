public class Conta {
	private double saldo;
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
	
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Valor depositado com sucesso!");
		System.out.println("Saldo: R$" + this.saldo);
	}

	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Valar retirado com sucesso!");
			System.out.println("Saldo: R$" + this.saldo);
			return true;
		} else {
			System.out.println("Valar não retirado!");
			System.out.println("Saldo: R$" + this.saldo);
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

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	/*public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("O número da conta não pode ser menor ou igual a zero.");
		}else	
			this.numero = numero;
	}*/

	public int getAgencia() {
		return this.agencia;
	}

	/*public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("A agência mão pode ser menor ou igual a zero.");
			return;
		} else
			this.agencia = agencia;
	}*/

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