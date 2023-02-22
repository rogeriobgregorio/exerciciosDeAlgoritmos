package listaExercicios;

import java.util.Scanner;

/**
 * Recebe o valor de um deposito em poupança, fornecido pelo usuário, calcula e
 * exibe o valor após 1 mês de aplicação sabendo que o rendimento é de 1,3% ao
 * mês.
 * 
 * @author Rogério Gregório
 *
 */

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o valor do depósito: ");
		double deposito = teclado.nextDouble();

		teclado.close();

		double rendimento = deposito + (deposito * 0.013);
		System.out.println("O valor após o rendimento é: " + rendimento);

	}

}
