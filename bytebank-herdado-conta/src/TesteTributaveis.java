
public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.depositar(100.0);

		SeguroDeVida seguro = new SeguroDeVida();
		CalculadorImposto calc = new CalculadorImposto();

		calc.registra(cc);
		calc.registra(seguro);

		System.out.println("Total de imposto: R$" + calc.getTotalImposto());
	}

}
