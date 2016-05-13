package lista01;

import java.util.Scanner;

public class Exercicio10 {
	
	public static void main(String[] args) {
		
		int n1,n2,n3,n4,n5;
		int media;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		n1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero");
		n2 = scan.nextInt();
		
		System.out.println("Digite o terceiro numero");
		n3 = scan.nextInt();
		
		System.out.println("Digite o quarto numero");
		n4 = scan.nextInt();
		
		System.out.println("Digite o quinto numero");
		n5 = scan.nextInt();
		
		
		media = (n1 + n2 + n3 + n4 + n5)/5;
		
		if(n1 > media) {
			System.out.println("A nota " + n1 + " é maior que a média " + media );
		}
		
		if(n2 > media) {
			System.out.println("A nota " + n2 + " é maior que a média " + media );
		}
		
		if(n3 > media) {
			System.out.println("A nota " + n3 + " é maior que a média " + media );
		}
		
		if(n4 > media) {
			System.out.println("A nota " + n4 + " é maior que a média " + media );
		}
		
		if(n5 > media) {
			System.out.println("A nota " + n5 + " é maior que a média " + media );
		}
		
		
	}

}
