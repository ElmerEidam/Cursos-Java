//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

package estruturaCondicional;

import java.util.Scanner;

public class SomaHoras {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int horaInicial, horaFinal, duracao;

		System.out.println("Digite a hora INICIAL do jogo: ");
		horaInicial = sc.nextInt();
		System.out.println("Digite a hora FINAL do jogo: ");
		horaFinal = sc.nextInt();

		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}

		System.out.println("A duração total do jogo, em horas, foi: " + duracao);

		sc.close();
	}

}
