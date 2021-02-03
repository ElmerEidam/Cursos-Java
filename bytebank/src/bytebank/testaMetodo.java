package bytebank;

public class testaMetodo {

	public static void main(String[] args) {
		
		contaCorrente contaDoElmer = new contaCorrente();
		contaDoElmer.titular = "Elmer Eidam Junior";
		contaDoElmer.saldo = 100;
		contaDoElmer.depositar(50);		
		
		boolean conseguiuRetirar = contaDoElmer.sacar(20);
		System.out.println("Saldo: R$" + contaDoElmer.saldo);
		System.out.println(conseguiuRetirar);
		
		contaCorrente contaDaIsabela = new contaCorrente();
		contaDaIsabela.titular = "Isabela Mendes";
		contaDaIsabela.depositar(1000);
		
		if(contaDaIsabela.transferir(500, contaDoElmer)) {
			System.out.println("Transferência com sucesso!");
		} else {
			System.out.println("Faltou dinheiro.");
		}
				
		System.out.println("Saldo da conta da Isabela: R$" + contaDaIsabela.saldo);
		System.out.println("Saldo da conta do Elmer: R$" + contaDoElmer.saldo);
	}

}
