package variaveis;

import javax.swing.JOptionPane;

/*
 * Sobre Identificadores (nomes que voc? utiliza dentro da programa??o)
 * Regras:
 * 1? -) N?o come?ar com n?meros. 1berto (errado) h1berto(certo)
 * 2? -) N?o utilizar palavras reservadas.
 * 3? -) N?o fazer uso de caracteres especiais n@me, d@t@, tr#s...
 * 
 * Padr?es:
 * - UML : Padr?o para OO(Orienta??o ao Objeto)
 * 		- Classes devem come?ar com letras maiusculas
 * 		- Variaveis come?am com letras minusculas (substantivos)
 * 		- M?todos come?am com letras minusculas, verbos e s?o seguidos de parenteses
 * 	- CamelCase: maiusculas e minusculas
 * 		- da segunda palavra em diante, todas as palavras devem iniciar com letra maiuscula.
 * 		- utilize nomes significativos
 */

public class TiposDadosDesafio {
	
	public static void main (String[] args) {
		
		/*
		 * Capturem: o nome de um produto, o valor
		 * de compra, e a quantidade.
		 * Sobre o valor de compra, considerem um lucro de
		 * 20% para obterem o valor de venda
		 * Calcule o total considerando o valor de venda e quantidade
		 * Sobre o total acima calcule 22% de impostos
		 * No final exiba:
		 * O nome do produto
		 * O valor de venda
		 * O total sem impostos
		 * 
		 */
		
		String nome_produto = JOptionPane.showInputDialog("Informe o nome do produto");
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor"));
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
		double lucro_venda = valor * 1.2; //Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
		double total = lucro_venda * quantidade;
		double impostos = total * 0.22;
		
		System.out.println("Nome do Produto: " + nome_produto);
		System.out.println("Valor: " + valor);
		System.out.println("Total (- Impostos): " + (total-impostos));
		
	}
	
	/*
	 * Java ME (Micro Edition): para dispositivos que n?o cont?m SO
	 * Java SE (Standard Edition): para aplica??es stand alone (local)
	 * Java EE (Enterprise Edition): para aplica??es WEB.
	 * 
	 * 
	 */

}

