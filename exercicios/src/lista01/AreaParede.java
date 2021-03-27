//Uma parede em formato retangular precisa ser coberta por azulejos também retangulares. 
//Escreva um programa que leia as quatro medidas hp, lp, ha e la,
//calcule e imprima quanto azulejos com as medidas dadas são necessários para cobrir a parede dada.
//A área é calculada assim: lado1*lado2

package lista01;

import java.util.Scanner;

public class AreaParede {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);

		double hp, lp, ha, la, qtd;

		System.out.println("Digite a altura da parede: ");
		hp = sc1.nextDouble();
		System.out.println("Digite a largura da parede: ");
		lp = sc1.nextDouble();
		System.out.println("Digite a altura dos azulejos: ");
		ha = sc1.nextDouble();
		System.out.println("Digite a largura dos azulejos: ");
		la = sc1.nextDouble();

		qtd = (hp * lp) / (ha * la);

		System.out.println("A quantidade de azulejos necessários é: " + qtd);

		sc1.close();
	}
}