package lista01;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		String nome;
		double nota1, nota2, nota3, nota4;
		double media;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o Nome do Aluno");
		nome = scan.nextLine();

		System.out.println("Digite a nota da primeira avaliação");
		nota1 = scan.nextDouble();

		System.out.println("Digite a nota da segunda avaliação");
		nota2 = scan.nextDouble();

		System.out.println("Digite a nota da terceira avaliação");
		nota3 = scan.nextDouble();

		System.out.println("Digite a nota da quarta avaliação");
		nota4 = scan.nextDouble();

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 5) {

			System.out.println("O Aluno " + nome + " foi APROVADO, com média " + media);

		}else{
			
			System.out.println("O Aluno " + nome + " foi REPROVADO, com média " + media);
			
		}

	}

}
