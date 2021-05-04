package variaveis;

public class ManipulaString {
	
	public static void main(String[] args) {
		
		String email = "teste@teste.com.br";
		System.out.println("Original: " + email);
		System.out.println("Minusculo: " + email.toLowerCase());
		System.out.println("Maiusculo: " + email.toUpperCase());
		System.out.println("Quantidade de Caracteres: " + email.length());
		System.out.println("Tem arroba? " + email.contains("a")); //boolean (true or false
		System.out.println("Posi��o do @: " + email.indexOf("@"));
		System.out.println("Do 3� at� o 5�: " + email.substring(2,4));
		System.out.println("Do 3� at� o fim: " + email.substring(2));
		System.out.println("Primeira metade: " + email.substring(0, email.length()));
		System.out.println("Usuario: " + email.substring(0, email.indexOf("@")).toLowerCase()); //exibir do @ para frente
		System.out.println("Servidor: " + email.substring(email.indexOf("@")+1).toLowerCase());
		System.out.println("Primeiro Caracter: " + email.charAt(0));
		System.out.println("� igual? " + email.equals(email));
		
		/*
		 * String.length() => retorna a quantidade de caracteres
		 */
	}
	
	/*
	 * churros => variavels
	 * churros() => fun��o
	 * Abc.churros() => m�todo
	 * Churros => classe
	 */

}
