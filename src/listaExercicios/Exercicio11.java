package listaExercicios;

import java.util.Scanner;

/**
 * Recebe o raio de uma circunferência, fornecido pelo usuário, calcula e exibe
 * o comprimento da circunferência.
 * 
 * @author Rogério Gregório
 *
 */

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o raio da circunferência: ");
		double raio = teclado.nextDouble();

		teclado.close();

		double comprimento = 2 * Math.PI * raio;

		System.out.println("O comprimento da circunferência é: " + comprimento);

	}

}
