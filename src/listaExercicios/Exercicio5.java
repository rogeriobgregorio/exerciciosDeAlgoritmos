package listaExercicios;

import java.util.Scanner;

/**
 * Recebe os coeficientes a, b e c de uma equação do 2º grau, fornecidos pelo
 * usuario, calcula e exibe a(s) raiz(es).
 * 
 * @author Rogério Gregório
 *
 */

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite o valor de a: ");
		double a = teclado.nextDouble();

		System.out.print("Digite o valor de b: ");
		double b = teclado.nextDouble();

		System.out.print("Digite o valor de c: ");
		double c = teclado.nextDouble();

		teclado.close();

		double delta = Math.pow(b, 2) - 4 * a * c;

		if (delta < 0) {
			System.out.println("A equação não possui raízes reais.");
		} else if (delta == 0) {
			double x = -b / (2 * a);
			System.out.println("A equação possui uma única raiz real: x = " + x);
		} else {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("A equação possui duas raízes reais: x1 = " + x1 + " e x2 = " + x2);
		}

	}

}
