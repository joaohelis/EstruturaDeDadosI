package estrutura.pratica_05;

public class MergeSort {
	
	public static void main(String[] args) {
		
		MergeSort merge = new MergeSort();
		
		int[] aux = criarVetorAleatorio(100);
		
		merge.calcularTempoExecucao(aux);
	}
	
	public void calcularTempoExecucao(int[] v){
		
		long time1 = System.currentTimeMillis();
		mergeSort(v);
		long time2 = System.currentTimeMillis();
		System.out.println("Tempo de execução de um vetor com "+v.length+" elementos");
		System.out.println("Utilizando o algorítimo de execução Merge Sort:  ");
		System.out.println(">>> "+ (time1 - time2)/1000);
		 
	}
	
	
	public static void printVector(int[] v, int idInicial){
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
	
	public  int[] mergeSort(int[] v){
		return this.mergeSort(v, 0, v.length);
	}
	
	private  int[] mergeSort(int[] v, int ini, int post){
		
		if (post - ini > 1){
			
			int mid = (post + ini)/2;
			
			mergeSort(v, ini, mid);
			mergeSort(v, mid, post);
			
			int i = ini;
			int j = mid;
			int k = 0; // Indexador do vetor auxiliar
			
			int[] aux = new int[post - ini]; // Vetor auxliar criado para armazenar os elementos ordenados
			
			while(i < mid && j < post){
				if(v[i] <= v[j]){
					aux[k] = v[i];
					++i;
				}else{
					aux[k] = v[j];
					++j;
				}
				++k;
			}
			
			while(i < mid){
				aux[k] = v[i];
				++i;
				++k;
			}
			
			while(j < post){
				aux[k] = v[j];
				++j;
				++k;
			}
			
			for(int a = ini; a < post; ++a)
				v[a] = aux[a- ini];	
		}
		
		return v;
	}

}
