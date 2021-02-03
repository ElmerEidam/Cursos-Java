package bytebank;

public class criarConta {

	public static void main(String[] args) {
		
		contaCorrente primeiraConta = new contaCorrente();	
		contaCorrente segundaConta = new contaCorrente();
		
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		segundaConta.saldo = 50;
		System.out.println(segundaConta.saldo);
		
		System.out.println("A primeira conta tem R$" + primeiraConta.saldo);
		System.out.println("A segunda conta tem R$" + segundaConta.saldo);
	}

}
