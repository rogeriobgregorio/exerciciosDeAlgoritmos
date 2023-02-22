package listaExercicios;

import java.util.Scanner;

/**
 * Calcula a área de um quadrado com base no valor do lado fornecido pelo
 * usuário.
 * 
 * @author Rogério Gregório
 * 
 */

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o valor do lado do quadrado: ");
		int lado = teclado.nextInt();

		teclado.close();

		int area = lado * lado;
		System.out.println("A área do quadrado é: " + area);

	}

}
