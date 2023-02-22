package listaExercicios;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Recebe a data de nascimento e a data atual, fornecidos pelo usuário, calcula
 * e exibe a idade que ele terá daqui 17 anos.
 * 
 * @author Rogério Gregório
 *
 */

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		DateTimeFormatter ddMMyy = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Digite a data de seu nascimento: ");
		String dataString = teclado.next();

		System.out.println("Digite a data atual: ");
		String anoString = teclado.next();

		teclado.close();

		LocalDate dataNasc = LocalDate.parse(dataString, ddMMyy);
		LocalDate dataAtual = LocalDate.parse(anoString, ddMMyy);

		int idadeFutura = Period.between(dataNasc, dataAtual).getYears() + 17;
		System.out.println("A idade que ele terá daqui 17 anos será: " + idadeFutura + " anos.");

	}

}
