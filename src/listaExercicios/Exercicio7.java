package listaExercicios;

import java.util.Scanner;

/**
 * Recebe os valores do comprimento, largura e altura de um paralelepipedo,
 * fornecidos pelo usuario, calcula e exibe a area.
 * 
 * @author Rogério Gregório
 *
 */

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o valor do comprimento: ");
		double comprimento = teclado.nextDouble();

		System.out.println("Digite o valor da largura: ");
		double largura = teclado.nextDouble();

		System.out.println("Digite o valor da altura: ");
		double altura = teclado.nextDouble();

		teclado.close();

		double area = 2 * ((comprimento * largura) + (comprimento * altura) + (largura * altura));

		System.out.println("O valor da área é: " + area);

	}

}
