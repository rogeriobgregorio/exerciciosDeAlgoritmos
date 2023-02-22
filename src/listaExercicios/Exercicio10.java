package listaExercicios;

import java.util.Scanner;

/**
 * Recebe dois números reais fornecidos pelo usuário, calcula e exibe a
 * diferença entre os valores.
 * 
 * @author Rogério Gregório
 *
 */

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o 1º número: ");
		double primeiroNumero = teclado.nextDouble();

		System.out.println("Digite o 2º número: ");
		double segundoNumero = teclado.nextDouble();

		teclado.close();

		if (primeiroNumero > segundoNumero) {

			double resultado = primeiroNumero - segundoNumero;

			System.out.println("A diferença entre " + primeiroNumero + " e " + segundoNumero + " é de: " + resultado);

		} else if (primeiroNumero < segundoNumero) {

			double resultado = segundoNumero - primeiroNumero;

			System.out.println("A diferença entre " + primeiroNumero + " e " + segundoNumero + " é de: " + resultado);

		} else {

			System.out.println("Os números são iguais");

		}

	}

}
