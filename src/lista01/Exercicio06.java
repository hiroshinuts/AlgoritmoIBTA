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

		System.out.println("Digite a nota da primeira avalia��o");
		nota1 = scan.nextDouble();

		System.out.println("Digite a nota da segunda avalia��o");
		nota2 = scan.nextDouble();

		System.out.println("Digite a nota da terceira avalia��o");
		nota3 = scan.nextDouble();

		System.out.println("Digite a nota da quarta avalia��o");
		nota4 = scan.nextDouble();

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 5) {

			System.out.println("O Aluno " + nome + " foi APROVADO, com m�dia " + media);

		}else{
			
			System.out.println("O Aluno " + nome + " foi REPROVADO, com m�dia " + media);
			
		}

	}

}
