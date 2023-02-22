package listaExercicios;

import java.util.Scanner;

/**
 * Recebe a quantidade de alimento em quilos,
 * fornecida pelo usuário, calcula quantos
 * dias durará esse alimento sabendo que o 
 * consumo é de 50g ao dia.
 * 
 * @author Rogério Gregório
 *
 */

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de alimento: ");
		double qtdAlimento = teclado.nextDouble();
		
		teclado.close();
		
		double resultado = qtdAlimento / 0.050;
		
		System.out.println("Essa quantidade de alimento terá duração de: " + resultado + " dias.");
		
	}

}
