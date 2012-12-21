package estrutura.pratica_05;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		
		int n ;
		
		while(true){
			try{
				n = Integer.parseInt(JOptionPane.showInputDialog("Informe um número que represente o tamnho do vetor a ser criado: "));
				if (n <= 0)
					JOptionPane.showMessageDialog(null, "Informe um número maior ou igual a um", "Estrutura de Dados I", JOptionPane.ERROR_MESSAGE);
				else
					break;
			}catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Digite apenas números", "Estrutura de Dados I", JOptionPane.ERROR_MESSAGE);
			}	
		}
	}

}
