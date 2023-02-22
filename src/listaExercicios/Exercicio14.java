package listaExercicios;

import java.util.Scanner;

/**
 * Recebe do usuário dois ângulos e um 
 * lado de um triangulo, calcula e exibe
 * o valor do segundo e terceiro lado.
 * 
 * @author Rogério Gregório
 *
 */

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor do 1º ângulo: ");
		double angulo1 = teclado.nextDouble();
		
		System.out.println("Digite o valor do 2º ângulo: ");
		double angulo2 = teclado.nextDouble();
		
		System.out.println("Digite o valor do 1º lado: ");
		double lado1 = teclado.nextDouble();
		
		teclado.close();
		
		double rad1 = Math.toRadians(angulo1);
		double rad2 = Math.toRadians(angulo2);
		double rad3 = Math.PI - rad1 - rad2;
		
		double lado2 = lado1 * Math.sin(rad2) / Math.sin(rad3);
		double lado3 = lado1 * Math.sin(rad1) / Math.sin(rad3);
		
		System.out.println("O valor do segundo lado é: " + lado2);
        System.out.println("O valor do terceiro lado é: " + lado3);

	}

}
