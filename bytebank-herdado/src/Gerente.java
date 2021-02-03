public class Gerente extends Funcionario implements Autenticavel {

	private AutenticadorUtil autenticador;

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação de Gerente.");
		return 5000;
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}