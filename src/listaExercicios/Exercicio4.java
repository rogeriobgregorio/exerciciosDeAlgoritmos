package listaExercicios;

import java.util.Scanner;

/**
 * Recebe a temperatura em celsius, fornecida pelo usuário, converte e exibe em
 * fahrenheit.
 * 
 * @author Rogério Gregório
 * 
 */

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o valor da temperatura em celsius: ");
		int celsius = teclado.nextInt();

		teclado.close();

		int fahrenheit = (9 * celsius + 160) / 5;
		System.out.println("A temperatura convertida para fahrenheit é: " + fahrenheit);

	}

}
