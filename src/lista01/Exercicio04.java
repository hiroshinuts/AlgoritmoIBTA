package lista01;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		int A;
		int B;
		int numero;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um numero inteiro");

		numero = scan.nextInt();

		if (numero >= 0) {

			A = numero;

			System.out.println("O numero: " + A + " é a variavel A");

		} else {

			B = numero;

			System.out.println("O numero: " + B + " é a variavel B");
		}

	}

}
