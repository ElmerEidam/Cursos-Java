//Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. Fazer um algoritmo que calcule e escreva:
//a. a maior e a menor altura do grupo;
//b. média de altura dos homens;
//c. o número de mulheres.

package lista01;

import java.util.Scanner;

public class QuantidadeHomensMulheres {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		int opcao, qtHomens = 0, qtMulheres = 0;
		double somaAltura = 0, mediaAltura = 0, altura = 0, maiorAltura = 0, menorAltura = 2.50;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Pessoa número: " + i);

			System.out.println("Digite sua altura: ");
			altura = sc1.nextDouble();
			if (altura > maiorAltura) {
				maiorAltura = altura;
			} else if (altura < menorAltura) {
				menorAltura = altura;
			}
			;

			do {
				System.out.println("Qual o seu sexo? 1 - Feminino / 2 - Masculino");
				opcao = sc1.nextInt();
				switch (opcao) {
				case 1:
					qtMulheres++;
					break;
				case 2:
					qtHomens++;
					somaAltura += altura;
					break;
				default:
					System.out.println("Opção inválida! Escolha novamente...");
					opcao = 0;
					break;
				}
			} while (opcao != 1 && opcao != 2);

			mediaAltura = somaAltura / qtHomens;
		}

		System.out.println("A maior altura é: " + maiorAltura);
		System.out.println("A menor altura é: " + menorAltura);
		System.out.println("A média de altura dos homens é: " + mediaAltura);
		System.out.println("A quantidade de mulheres é: " + qtMulheres);

		sc1.close();
	}
}
