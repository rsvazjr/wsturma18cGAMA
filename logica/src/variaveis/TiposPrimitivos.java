package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		/*
		 * Tipos primitivos: são os tipos que estão dentro da linguagem
		 * 
		 * boolean = Tipo lógico (true/false)
		 * char = 1 caracter (ele utiliza como separador os apostrofos) 'a' (char) // "a" (String)
		 * 
		 * 
		 * byte = número inteiro (-128/+127)
		 * short = número inteiro (-32 mil / +32 mil)
		 * int = número inteiro (-9 trilhões / +9 trilhões)
		 * long = número inteiro (quintilhões)
		 * 
		 * float = para casas deciamis
		 * double = para casas deciamis (possui o dobro de precisão em relação ao float).
		 * 
		 */
		
		
		float salario = Float.parseFloat(JOptionPane.showInputDialog("Salario"));
		float fgts = salario * (float) 0.08; //Ocorre o casting
		int numero = 5;
		byte resultado = (byte) (numero + 2); //Ocorre o casting
		
		/*
		 * Classes Wrappers (São classes que servem para apoiar os tipos primitivos)
		 * int => Integer
		 * float => Float
		 * boolean => Boolean
		 * double => Double
		 */
		
		
		
	}

}
