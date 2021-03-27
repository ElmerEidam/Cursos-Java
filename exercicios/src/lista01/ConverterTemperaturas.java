//Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em 
//Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas: 
//F = C * 1.8 + 32 
//K = C + 273.15
//Re = C * 0.8
//Ra = C * 1.8 + 32 + 459.67


package lista01;

import java.util.Scanner;

public class ConverterTemperaturas{

	public static void main(String[] args) {
		double  C, K, F, RE, RA;
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Temperatura em Celsius: ");
		C = sc1.nextDouble();
		
		F = C * 1.8 + 32;
		K = C + 273.15;
		RE = C * 0.8; 
		RA = C * 1.8 + 32 + 459.67;
		
		System.out.println("Temperatura em Fahrenheit:" + F);
		System.out.println("Temperatura em Kelvin:" + K);
		System.out.println("Temperatura em Réaumur:" + RE);
		System.out.println("Temperatura em Rankine:" + RA);
		
		sc1.close();
	}
}