//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
//Se o ponto estiver na origem, escreva a mensagem “Origem”.
//Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
//situação.

package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class CoordenadasNoPlano {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x, y;

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
		} else if (x == 0.0 && y != 0) {
			System.out.println("Ponto sobre o eixo X.");
		} else if (y == 0.0 && x != 0) {
			System.out.println("Ponto sobre o eixo Y.");
		} else if (x == 0.0 && y == 0.0) {
			System.out.println("Ponto na origem.");
		}

		sc.close();
	}

}
