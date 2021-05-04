package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		/*
		 * Tipos primitivos: s�o os tipos que est�o dentro da linguagem
		 * 
		 * boolean = Tipo l�gico (true/false)
		 * char = 1 caracter (ele utiliza como separador os apostrofos) 'a' (char) // "a" (String)
		 * 
		 * 
		 * byte = n�mero inteiro (-128/+127)
		 * short = n�mero inteiro (-32 mil / +32 mil)
		 * int = n�mero inteiro (-9 trilh�es / +9 trilh�es)
		 * long = n�mero inteiro (quintilh�es)
		 * 
		 * float = para casas deciamis
		 * double = para casas deciamis (possui o dobro de precis�o em rela��o ao float).
		 * 
		 */
		
		
		float salario = Float.parseFloat(JOptionPane.showInputDialog("Salario"));
		float fgts = salario * (float) 0.08; //Ocorre o casting
		int numero = 5;
		byte resultado = (byte) (numero + 2); //Ocorre o casting
		
		/*
		 * Classes Wrappers (S�o classes que servem para apoiar os tipos primitivos)
		 * int => Integer
		 * float => Float
		 * boolean => Boolean
		 * double => Double
		 */
		
		
		
	}

}
