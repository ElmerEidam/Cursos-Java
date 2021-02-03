
public class TestaGetESet {

	public static void main(String[] args) {

		Conta conta = new Conta(1337, 12345);
		Conta conta1 = new Conta(1787, 67899);
		Conta conta2 = new Conta(1457, 98765);
		Cliente elmer = new Cliente();
		
		elmer.setNome("Elmer Eidam Junior");
		elmer.setCpf("089.632.229-77");
		elmer.setProfissao("Programador");
		conta.setTitular(elmer);
		
		System.out.println("Titular da conta: " + conta.getTitular().getNome());		
		System.out.println("Total de contas abertas: " + Conta.getTotal());
	}
}