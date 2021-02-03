public class TestaBanco {

	public static void main(String[] args) {
		Cliente elmer = new Cliente();
		elmer.nome = "Elmer Eidam Junior";
		elmer.cpf = "999.999.999-99";
		elmer.profissao = "Programador";
		
		Conta contaDoElmer = new Conta();
		contaDoElmer.titular = elmer;
		contaDoElmer.depositar(1000);
		
		System.out.println(contaDoElmer.titular.nome);
		
		
	}

}
