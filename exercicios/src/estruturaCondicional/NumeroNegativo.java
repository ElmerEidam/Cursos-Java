//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

package estruturaCondicional;

import java.util.Scanner;

public class NumeroNegativo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero;

		System.out.println("Digite um número inteiro: ");
		numero = sc.nextInt();

		if (numero < 0) {
			System.out.println("O número é NEGATIVO!");
		} else {
			System.out.println("O número é POSITIVO!");
		}

		sc.close();

	}

}
