package variaveis;

import javax.swing.JOptionPane;

/*
 * Caracter?sticas do Java:
 * - OO
 * - m?dio n?vel
 * - arquitetura hibrida
 */
public class TiposDados {
	// main ? o m?todo start point de uma app Java
	public static void main(String args[])	{
			//<Tipo de dado> <nome/identificador> = <valor>;
			String nome = JOptionPane.showInputDialog("Informe o seu nome");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
			double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
			double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
			double imc = peso / (altura * altura);
			System.out.println("Nome..: " + nome);
			System.out.println("Idade.: " + idade);
			System.out.println("Altura: " + altura);
			System.out.println("IMC: " + imc);
		
		/*
		 * Tipos De dados:
		 * N?merico: ? o dado que PODE ser utilizado em express?es matem?ticas
		 * e/ou se for um dado cr?tico para o cen?rio que se prope
		 * CEP (diante de um contexto dos Correios): 00010009 - 1
		 * Telefone (do delivery da pizzaria)
		 * Em Javan?s:
		 * - int 	=> somente para n?meros inteiros
		 * - double => para n?mero com casas decimais (n?meros reais)
		 * 
		 * 
		 * Alfanum?rico: ? o dado que n?o est? envolvido em opera??es matem?ticas
		 */


















	} // fechando o m?todo

} // fechando a classe


