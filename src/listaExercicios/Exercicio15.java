package listaExercicios;

import java.util.Scanner;

/**
 * Recebe do usuário os valores de 2
 * catetos de um triangulo retângulo, 
 * calcula e exibe a hipotenusa.
 * 
 * @author Rogério Gregório
 *
 */

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor do 1º cateto: ");
		double cateto1 = teclado.nextDouble();
		
		System.out.println("Digite o valor do 2º cateto: ");
		double cateto2 = teclado.nextDouble();

		teclado.close();
		
		double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		
		System.out.println("O valor da hipotenusa é: " + hipotenusa);

	}

}
