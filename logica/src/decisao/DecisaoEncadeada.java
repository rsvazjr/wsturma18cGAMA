package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Solicitem as faltas
		 * para que o aluno esteja aprovado ele precisa ter
		 * a quantidade de faltas menor que 20 e a nota maior ou igual a 6
		 * vale para o exame tamb�m
		 */
		
		/*
		 * Voc� foi reprovado => media menor que 4
		 * Voc� tem chance no exame => media entre 5.9 e 4
		 */
		
		String disciplina = JOptionPane.showInputDialog("Informe o nome da disciplina");
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Faltas"));
		
		if (faltas >20) {
		float primeira_nota = Float.parseFloat(JOptionPane.showInputDialog("Informe a primeira nota"));
		float segunda_nota = Float.parseFloat(JOptionPane.showInputDialog("Informe a segunda nota"));
		float media = (primeira_nota + segunda_nota) / 2;
		float resultado = media;
		
		if (media >=6)  {
			System.out.println("Voc� foi aprovado em " + disciplina + " e a sua m�dia foi " + resultado);

		}

		else if (media < 4) {
			System.out.println("Voc� foi reprovado em " + disciplina + " e a sua m�dia foi " + resultado);

		}

		else{
			System.out.println("Voc� est� de exame em " + disciplina + " e a sua m�dia foi " + resultado);

		}
	
		
		}
		
		else{
			System.out.println("Voc� foi reprovado por faltas. ");
		}
		
		

	}
		
	

}
