//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//menos uma de duas coordenadas for NULA.

package estruturaWhile;

import java.util.Scanner;
import java.util.Locale;

public class QuadranteNulo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x, y;

		do {
			System.out.println("");
			System.out.println("Digite a coordenada X: ");
			x = sc.nextDouble();
			System.out.println("Digite a coordenada Y: ");
			y = sc.nextDouble();

			if (x < 0 && y < 0) {
				System.out.println("Ponto no quadrante 3.");
			} else if (x < 0.0 && y > 0.0) {
				System.out.println("Ponto no quadrante 2.");
			} else if (x > 0.0 && y < 0.0) {
				System.out.println("Ponto no quadrante 4.");
			} else if (x > 0.0 && y > 0.0) {
				System.out.println("Ponto no quadrante 1.");
			}
		} while (x != 0.0 && y != 0);

		System.out.println("Programa encerrado.");

		sc.close();
	}

}
