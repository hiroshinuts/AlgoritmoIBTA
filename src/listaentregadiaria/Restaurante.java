package listaentregadiaria;

import java.util.Scanner;

public class Restaurante {

	public static Integer codigo;
	public static String prato;
	public static Double valor;
	public static Character gorjeta;

	public static void main(String[] args) {

		System.out.println("Escolha um Prato");
		System.out.println("Picanha Valor R$25,00 Digite '1'");
		System.out.println("Lasanha Valor R$20,00 Digite '2'");
		System.out.println("Strogonoff Valor R$18,00 Digite '3'");
		System.out.println("Bife Acebolado Valor R$15,00 Digite '4'");
		System.out.println("Pao com Ovo Valor R$8,00 Digite '5'");

		Scanner s = new Scanner(System.in);

		codigo = s.nextInt();

		if (codigo < 1 || codigo > 5) {
			System.out.println("Codigo do Prato Invalido");
		}

		switch (codigo) {
		case 1:
			prato = "Picanha";
			valor = 25.0;
			break;

		case 2:
			prato = "Lasanha";
			valor = 20.0;
			break;

		case 3:
			prato = "Strognoff";
			valor = 18.0;
			break;

		case 4:
			prato = "Bife Acebolado";
			valor = 15.0;
			break;

		case 5:
			prato = "Pao com ovo";
			valor = 5.0;
			break;

		}

		System.out.println("Deseja pagar os 10% do Garçon? Digite ('s' para sim e 'n' para não)");

		gorjeta = s.next().toLowerCase().charAt(0);

		switch (gorjeta) {
		case 's':
			valor += valor * 0.10;
			System.out.println("O valor total já incluso o valor da gorjeta é de " + valor);
			break;
		case 'n':
			System.out.println("O valor total, da refeição é de " + valor + " com a opção de não dar gorjeta");
			break;
		default:
			System.out.println("Resposta para gorjeta incorreta!");
			break;

		}

	}
}
