/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/

package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ValoresPecas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo1, codigo2, quantidade1, quantidade2;
		double valor1, valor2, total;

		System.out.println("Digite o código da primeira peça: ");
		codigo1 = sc.nextInt();
		System.out.println("Digite a quantidade de peças: ");
		quantidade1 = sc.nextInt();
		System.out.println("Digite o valor de cada peça: R$");
		valor1 = sc.nextDouble();
		System.out.println("Digite o código da segunda peça: ");
		codigo2 = sc.nextInt();
		System.out.println("Digite a quantidade de peças: ");
		quantidade2 = sc.nextInt();
		System.out.println("Digite o valor de cada peça: R$");
		valor2 = sc.nextDouble();

		total = valor1 * quantidade1 + valor2 * quantidade2;

		System.out.println(quantidade1 + " peça(s) com o código " + codigo1);
		System.out.println(quantidade2 + " peça(s) com o código " + codigo2);
		System.out.println("Valor total a pagar: R$" + total);

		sc.close();
	}

}
