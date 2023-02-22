package listaExercicios;

import java.util.Scanner;

/**
 * Recebe os valores em x e y, fornecidos pelo usuário, efetua a troca de seus
 * valores e exibe seus conteudos.
 * 
 * @author Rogério Gregório
 *
 */

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o valor de x: ");
		int x = teclado.nextInt();

		System.out.println("Digite o valor de y: ");
		int y = teclado.nextInt();

		teclado.close();

		int aux = x;
		x = y;
		y = aux;

		System.out.println("O valor de x é: " + x);
		System.out.println("O valor de y é: " + y);

	}

}
