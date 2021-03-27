//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
//nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

package estruturaCondicional;

import java.util.Scanner;
import java.util.Locale;

public class IntervaloValor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double numero;

		System.out.println("Digite um número inteiro: ");
		numero = sc.nextDouble();

		if (numero >= 0 && numero <= 25) {
			System.out.printf("O número %.2f está no intervalo [0,25].", numero);
		} else if (numero > 25 && numero <= 50) {
			System.out.printf("O número %.2f está no intervalo [25,50].", numero);
		} else if (numero > 50 && numero <= 75) {
			System.out.printf("O número %.2f está no intervalo [50,75].", numero);
		} else if (numero > 75 && numero <= 100) {
			System.out.printf("O número %.2f está no intervalo [75,100].", numero);
		} else {
			System.out.printf("O número %.2f está fora do intervalo.", numero);
		}

		sc.close();
	}

}
