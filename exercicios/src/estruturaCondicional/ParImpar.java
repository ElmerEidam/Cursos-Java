//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

package estruturaCondicional;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero;

		System.out.println("Digite um número inteiro: ");
		numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("O número é PAR!");
		} else {
			System.out.println("O número é ÍMPAR!");
		}

		sc.close();

	}

}
