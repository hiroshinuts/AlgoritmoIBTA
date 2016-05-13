package lista01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		int numero;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um numero");
		numero = scan.nextInt();

		if (numero % 2 == 0) {

			System.out.println("O numero " + numero + " é Par");

		} else {

			System.out.println("O numero " + numero + " é Impar");
		}

	}

}
