package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Capturarem:
		 * - Nome da disciplina
		 * - primeira nota
		 * - segunda nota
		 * - calcular a media
		 * - exibir a media
		 */
		
		/*
		 * Você foi reprovado => media menor que 4
		 * Você tem chance no exame => media entre 5.9 e 4
		 */
		
		String disciplina = JOptionPane.showInputDialog("Informe o nome da disciplina");
		float primeira_nota = Float.parseFloat(JOptionPane.showInputDialog("Informe a primeira nota"));
		float segunda_nota = Float.parseFloat(JOptionPane.showInputDialog("Informe a segunda nota"));
		float media = (primeira_nota + segunda_nota) / 2;
		float resultado = media;
		
		if(media >= 6) {
		//&& => and
		// || => or	
			
			
			System.out.println("Nome da Disciplina: " + disciplina);
			System.out.println("Primeira nota: " + primeira_nota);
			System.out.println("Segunda nota: " + segunda_nota);
			System.out.println("Média: " + resultado);
			System.out.println("Você foi aprovado");
			
		}
		
		if (media < 4) {
			
			System.out.println("Nome da Disciplina: " + disciplina);
			System.out.println("Primeira nota: " + primeira_nota);
			System.out.println("Segunda nota: " + segunda_nota);
			System.out.println("Média: " + resultado);
			System.out.println("Você foi reprovado");
			
		}
		
		if (media < 6 && media >= 4) {
			
			System.out.println("Nome da Disciplina: " + disciplina);
			System.out.println("Primeira nota: " + primeira_nota);
			System.out.println("Segunda nota: " + segunda_nota);
			System.out.println("Média: " + resultado);
			System.out.println("Você tem chance no exame");
			
		}
		
		/* Exemplo simplificado de fazer a mesma coisa acima
		 * 
		 * if (media >=6) {
			System.out.println("Você foi aprovado em " + disciplina + "e a sua média foi " + resultado);

		}

		if (media < 4) {
			System.out.println("Você foi reprovado em " + disciplina + "e a sua média foi " + resultado);

		}

		if (media < 6 && media >= 4) {
			System.out.println("Você está de exame em " + disciplina + "e a sua média foi " + resultado);

		}
		 * 
		 */
		
		

	}

}
