package lista01;

import java.nio.charset.Charset;

import javax.swing.JOptionPane;

/**
 * 6 � Ler o nome eo sexo de uma pessoa e apresentar como sa�da uma das
 * seguintes mensagem: �Ilmo. Sr.�, caso seja informado o sexo como masculino,
 * ou �Ilma. Sra.�, caso seja informado o sexo como feminino. Apresentar tamb�m
 * junto com cada mensagem de sauda��o o nome previamente informado.
 * 
 * 
 * @author hiro
 *
 */

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite o seu Nome");
		
		String sexo = JOptionPane.showInputDialog("Qual seu sexo? Feminino = F , Masculino = M");
		
		

		
		if(sexo.equals("M") || sexo.equals("m") ) {
			
			String mensagem = "Ilmo. Sr." + nome;
			JOptionPane.showMessageDialog(null, mensagem);
			
		}else if(sexo.equals("F") || sexo.equals("f")) {
			
			String mensagem = "Ilma Sra." + nome;
			JOptionPane.showMessageDialog(null, mensagem);
			
		}else {
			
			String mensagem = "Sexo invalido";
			JOptionPane.showMessageDialog(null, mensagem);
			
		}
		
	}
}