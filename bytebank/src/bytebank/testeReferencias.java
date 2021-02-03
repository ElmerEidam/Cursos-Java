package bytebank;

public class testeReferencias {
	public static void main(String[] args) {
		contaCorrente primeiraConta = new contaCorrente();
		primeiraConta.saldo = 200;
		
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		
		contaCorrente segundaConta = primeiraConta;
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;  
		System.out.println("Novo saldo da segunda conta: " + segundaConta.saldo);
		System.out.println("Novo saldo da primeira conta: " + primeiraConta.saldo);		
		
		if(primeiraConta == segundaConta) {
			System.out.println("São a mesma conta!");
		}
		
	}
}
