package listaExercicios;

import java.util.Scanner;

/**
 * Calcula o salário de um funcionário reajustado em 15%, com base no valor
 * fornecido pelo usuário.
 * 
 * @author Rogério Gregório
 * 
 */

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o valor do salário: ");
		double salario = teclado.nextDouble();

		teclado.close();

		double salarioReajustado = salario + (salario * 0.15);
		System.out.println("O salário reajustado em 15% é: " + salarioReajustado);

	}

}
