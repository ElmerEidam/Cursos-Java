
public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario elmer = new Gerente();
		Gerente g1 = new Gerente();

		elmer.setNome("Elmer Eidam Junior");
		elmer.setCpf("089.632.229-77");
		elmer.setSalario(2500);

		g1.setNome("Juninho");
		g1.setCpf("999.999.999-99");
		g1.setSalario(15000);

		System.out.println(elmer.getNome());
		System.out.println(elmer.getBonificacao());
		System.out.println();

		g1.setSenha(1111);
		boolean autenticar = g1.autentica(1111);
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(autenticar);
		System.out.println(g1.getBonificacao());
	}

}
