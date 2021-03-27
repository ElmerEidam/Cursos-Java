/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.*/

package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class CalculaAreas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, pi = 3.14159, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		
		System.out.println("Digite o valor de A: ");
		a = sc.nextDouble();
		System.out.println("Digite o valor de B: ");
		b = sc.nextDouble();
		System.out.println("Digite o valor de C: ");
		c = sc.nextDouble();
		
		areaTriangulo = a * c / 2; //A = a * h / 2
		areaCirculo = pi * c * c; //A = π * r2
		areaTrapezio = (a + b) / 2 * c; //A = ( B + b ) / 2 × h
		areaQuadrado = b * b; //A = b x h
		areaRetangulo = a * b; //A = b x h
		
		System.out.println("A área total do Triângulo é: " + areaTriangulo);
		System.out.println("A área total do Círuclo é: " + areaCirculo);
		System.out.println("A área total do Trapézio é: " + areaTrapezio);
		System.out.println("A área total do Quadrado é: " + areaQuadrado);
		System.out.println("A área total do Retângulo é: " + areaRetangulo);
		
		sc.close();
	}

}
