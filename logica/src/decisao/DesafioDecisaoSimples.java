package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Pedir: nome e idade
		 * De acordo com as regras para vota��o no brasil, oriente
		 * o usu�rio se ele pode votar, se ele
		 * n�o pode votar ou se o voto dele � facultativo
		 */
		
		String nome = JOptionPane.showInputDialog("Informe o seu nome");
		short idade = Short.parseShort(JOptionPane.showInputDialog("Informe a sua idade"));
		
		
		if(idade >= 18 && idade <= 70) {
		//&& => and
		// || => or	
			
			
			System.out.println(nome + " apto para votar");
			
		}
		
		if (idade < 16) {
			
			System.out.println(nome + " n�o apto para votar");
			
		}
		
		if (idade == 16 || idade == 17 || idade > 70) {
			System.out.println(nome + " seu voto � facultativo");
		}
	
		
		

	

	}

}
