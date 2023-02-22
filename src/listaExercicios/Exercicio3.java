package listaExercicios;

import java.util.Scanner;

/**
 * Recebe o valor da base e da altura de um triangulo, fornecidos pelo usuário,
 * e calcula o valor da area.
 * 
 * @author Rogério Gregório
 * 
 */

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o valor da base: ");
		double base = teclado.nextDouble();

		System.out.println("Digite o valor da altura: ");
		double altura = teclado.nextDouble();

		teclado.close();

		double area = (base * altura) / 2;
		System.out.println("O valor da área do triangulo é: " + area);

	}

}
