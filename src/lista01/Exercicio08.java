package lista01;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		int anoNascimento;
		int anoAtual;
		int idade;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o ano de nascimento");
		anoNascimento = scan.nextInt();

		System.out.println("Digite o ano atual");
		anoAtual = scan.nextInt();

		idade = (anoAtual - anoNascimento);
		
		if(idade >= 18){
			System.out.println("A pessoa possui " + idade + " anos e pode VOTAR e pode tirar a CARTEIRA DE HABILITACAO " );
		}else if (idade >= 16 && idade < 18 ){
			System.out.println("A pessoa possui " + idade + " anos e pode VOTAR, mas não pode tirar a CARTEIRA DE HABILITACAO");;
		}else{
			System.out.println("A pessoa possui " + idade + " anos e não pode votar e nem dirigir");
		}
	}
}
