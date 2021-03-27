/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.*/

package estruturaSequencial;

import java.util.Scanner;
import java.util.Locale;

public class CalculaSalario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numeroFuncionario, horasTrabalhadas;
		double valorHora, salario;

		System.out.println("Digite o número do funcionário: ");
		numeroFuncionario = sc.nextInt();
		System.out.println("Digite quantas horas o funcionário trabalhou: ");
		horasTrabalhadas = sc.nextInt();
		System.out.println("Digite o valor recebido por hora de trabalho: ");
		valorHora = sc.nextDouble();

		salario = valorHora * horasTrabalhadas;

		System.out.println("O salário do funcionário " + numeroFuncionario);
		System.out.printf(" é de: R$%.2f", salario);

		sc.close();
	}

}
