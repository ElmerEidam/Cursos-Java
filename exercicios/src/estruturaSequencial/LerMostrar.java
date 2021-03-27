/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa.*/

package estruturaSequencial;

import java.util.Scanner;

public class LerMostrar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int soma, a, b;

		System.out.println("Digite o valor de A: ");
		a = sc.nextInt();
		System.out.println("Digite o valor de B: ");
		b = sc.nextInt();

		soma = a + b;

		System.out.println("A soma destes valores é: " + soma);

		sc.close();
	}

}
