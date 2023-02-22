package listaExercicios;

import java.util.Scanner;

/**
 * Recebe so usuário dois numeros inteiros, calcula e exibe a soma dos
 * quadrados.
 * 
 * @author Rogério Gregório
 *
 */

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o 1º número inteiro: ");
		int primeiroNumero = teclado.nextInt();

		System.out.println("Digite o 2º número inteiro: ");
		int segundoNumero = teclado.nextInt();

		teclado.close();

		int resultado = (int) (Math.pow(primeiroNumero, 2) + Math.pow(segundoNumero, 2));
		System.out.println("O resultado da soma dos quadrados é: " + resultado);

	}

}
