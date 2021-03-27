//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.
//Código  Produto				Preço
//1		Cachorro quente		R$4.00
//2		X-Salada			R$4.50
//3		X-Bacon				R$5.00
//4		Torrada Simples		R$2.00
//5		Refrigerante		R$1.50

package estruturaCondicional;

import java.util.Scanner;

public class ContaAPagar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int codigo;
		double quantidade, total = 0;

		System.out.println("Insira o código do produto: ");
		codigo = sc.nextInt();
		System.out.println("Insira a quantidade do produto: ");
		quantidade = sc.nextInt();

		if (codigo == 1) {
			total = quantidade * 4;
		} else if (codigo == 2) {
			total = quantidade * 4.5;
		} else if (codigo == 3) {
			total = quantidade * 5;
		} else if (codigo == 4) {
			total = quantidade * 2;
		} else if (codigo == 5) {
			total = quantidade * 1.5;
		}

		System.out.println("O valor total é: R$ " + total);

		sc.close();
	}
}
