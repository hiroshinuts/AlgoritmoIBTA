package lista01;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		int numero;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite um numero entre 1 a 9");
		numero = scan.nextInt();
		
		if (numero >= 1 && numero <= 9){
			
			System.out.println("O numero " + numero + " est� entre a faixa permitida");
			
		}else{
			
			System.out.println("O numero " + numero + " n�o est� entre a faixa permitida");
			
		}
		
		
	}

}
