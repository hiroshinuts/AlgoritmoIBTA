package lista01;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		char sexo;
		double altura;
		double resultado;

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe seu sexo , 'm' para Mulher ou 'h' para Homem");

		sexo = scan.nextLine().charAt(0);

		System.out.println("Digite sua altura");
		altura = scan.nextDouble();

		switch (sexo) {

		case 'm': {

			resultado = (72.7 * altura);

			System.out.println(" O peso ideal para a pessoa é " + resultado);
			break;
		}
		case 'h': {

			resultado = (62.1 * altura);
			System.out.println("O peso ideal para a pessoa é " + resultado);

		}
		}

	}

}
