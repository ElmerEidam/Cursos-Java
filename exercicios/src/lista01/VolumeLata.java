//Calcular e apresentar o valor do volume de uma lata de óleo, utilizando fórmula: v = pi * r² * a,
//em que as variáveis: v, r e h representam respectivamente o volume, o raio e a altura.
//Vamos declarar as variáveis V, R e A como double e definir um valor qualquer para as variáveis de altura e de raio.
//Agora vamos escrever a fórmula, conforme dita no enunciado e, em seguida, exibir na tela uma mensagem contendo 
//o resultado do volume encontrado.


package lista01;

import java.util.Scanner;

public class VolumeLata {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		
		double pi = 3.14159;
		double v, r, h;
		
		System.out.println("Digite o valor do raio da lata de óleo: ");
		r = sc1.nextDouble();		
		System.out.println("Digite o valor da altura da lata: ");
		h = sc1.nextDouble();
		
		v = pi * r * r * h;
		
		System.out.println("O volume é: " + v + "ml");
		
		sc1.close();
	}

}
