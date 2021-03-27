//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente.

package estruturaCondicional;

import java.util.Scanner;

public class SaoMultiplos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, b;

		System.out.println("Digite um valor para A: ");
		a = sc.nextInt();

		System.out.println("Digite um valor para B: ");
		b = sc.nextInt();

		if (a % b == 0 || b % a == 0) {
			System.out.println("Os valores informados são MÚLTIPLOS!");
		} else {
			System.out.println("Os valores informados NÃO são MÚLTIPLOS!");
		}

		sc.close();

	}

}
