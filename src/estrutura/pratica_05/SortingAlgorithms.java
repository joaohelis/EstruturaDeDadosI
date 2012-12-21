package src.estrutura.pratica_05;

public class SortingAlgorithms {
	
	public static void main(String[] args) {
		
		SortingAlgorithms a = new SortingAlgorithms();
		
		int n;
		
		while(true){
			try{
				n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o tamamnho do vetor a ser criado.", "Input", JOptionPane.QUESTION_MESSAGE));
				if(n < 0)
					JOptionPane.showMessageDialog(null, "Digite um número maior ou igual a zero", "Estrutura de Dados I",JOptionPane.ERROR_MESSAGE);
				else
					break;
			}catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Formato Inválido!\nDigite apenas números", "Estrutura de Dados I",JOptionPane.ERROR_MESSAGE);
			}
		}
		
		int[] vector1 = a.criarVetorAleatorio(n);
		
		printVector(selectionSort(vector1));
		
	}
	
	
	// Bubble Sort
	
	public static int[] bubbleSort(int[] vetor){
		int aux;
		for(int i = 0; i < vetor.length -1; ++i)
			for (int j = i+1; j < vetor.length; ++j)
				if (vetor[i] > vetor[j]){
					aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
		return vetor;
	}
	
	// Selection Sort
	
	public static int[] selectionSort(int[] v){ 
		int menor,   
			temp;
		// Esse algor�timo assegura que ao final de cada execu��o do for
		// o elemento corrente da posi��o do indice i estar� devidamente
		// ordenado
		for(int i = 0; i < v.length-1; ++i){   
		    menor =  i;                        
		    for (int j = i+1; j < v.length; ++j)
		         if (v[j] < v[menor]) 
					menor = j;
    		temp =  v[menor];
    		v[menor] = v[i];
    		v[i] = temp;     
		}
		return v;
	}
	
	// M�todo para imprimir um vetor 
	
	public static void printVector(int[] v){
		printVector(v,0);
	}
	
	// M�todo para imprimir um vetor
	
	private static void printVector(int[] v, int idInicial){
		if (idInicial < v.length){
			System.out.print((idInicial < v.length -1)?v[idInicial]+", ": v[idInicial]+"\n");
			printVector(v, ++idInicial);
		}
	}
	
	// Método para criar vetor com número aleatórios
	
	public static int [] criarVetorAleatorio(int n){
		int[] v = new int[n];
		for (int i = 0; i < n; ++i)
			v[i] = (int)(Math.random() * 1000);
		return v;
	}
	

	
}

	