public class TestaIR {

	public static void main(String[] args) {

		double salario = 1800.0;

		if (salario <= 1899.99) {
			System.out.println("Valor abaixo de R$1900,00.");
		} else if (salario >= 1900 && salario <= 2800) {
			System.out.println("O IR é de 7.5% e pode deduzir na declaração o valor de R$142,00.");
		} else if (salario >= 2800.01 && salario <= 3751) {
			System.out.println("O IR é de 15% e pode deduzir na declaração o valor de R$350,00.");
		} else if (salario >= 3751.01 && salario <= 4664)
			System.out.println("O IR é de 22,5% e pode deduzir na declaração o valor de R$636,00.");
		else {
			System.out.println("Valor acima de R$4664,00.");
		}
	}
}