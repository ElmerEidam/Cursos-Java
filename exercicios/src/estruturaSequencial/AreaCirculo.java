/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais.
Fórmula da área: area = π . raio 2
Considere o valor de π = 3.14159*/

package estruturaSequencial;

import java.util.Scanner;
import java.util.Locale;

public class AreaCirculo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double area, pi = 3.14159, raio;

		System.out.println("Digite o raio do círculo: ");
		raio = sc.nextDouble();

		area = pi * raio * raio;

		System.out.printf("A área deste círculo é: %.4f%n", area);

		sc.close();
	}

}
