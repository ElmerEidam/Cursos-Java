
public class TesteReferencias {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("Elmer");
		g1.setSalario(15000.0);
		String nome = g1.getNome();

		EditorVideo e1 = new EditorVideo();
		e1.setNome("Sebastião");
		e1.setSalario(1500.0);

		Designer d1 = new Designer();
		d1.setNome("Carlão");
		d1.setSalario(1500.0);

		System.out.println("O nome do gerente é: " + nome);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(e1);
		controle.registra(d1);

	}

}
