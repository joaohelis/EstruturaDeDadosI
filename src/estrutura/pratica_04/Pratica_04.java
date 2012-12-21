package estrutura.pratica_04;

public class Pratica_04 {
	
	// MAIN - Teste dos MEtodos 
	
	public static void main(String[] args) {
		Pratica_04 a = new Pratica_04();
		a.testReverse();
	}
	
	// RESPOSTA QUESTAO O1
	/*
		6
		4
		2
		2
		1
		1
		4
		3
		1
		1
		3
		6
	*/
	
	// QUESTAO 02
	
	public int F1(int N){
		if (N == 0)
			return 1;
		else if(N > 0)
			return 1 + 1 / F1(N-1);
		else
			return -1;
	}
	
	
	// TESTE QUESTAO 03
	
	public void testReverse(){
		Pratica_04 v = new Pratica_04();
		int[] vetor = {1,2,3,4,5};
		int[] vetorInvertido = v.reverse(vetor);
		
		for(int i = 0; i < vetorInvertido.length; i ++){
			String valorIndice = (String) ((i < vetorInvertido.length-1)? vetorInvertido[i]+" ,":(vetorInvertido[i]+""));
			System.out.print(valorIndice);
		}
	}
	
	// QUESTAO 03

	public int[] reverse(int[] vetor){
		return reverseAux(vetor, 0, vetor.length-1);
	}
	
	private int[] reverseAux(int[] vetor, int IDinicial, int IDfinal){
		int aux = vetor[IDinicial];
		vetor[IDinicial] = vetor[IDfinal];
		vetor[IDfinal] = aux;
		if(IDfinal == IDinicial)
			return vetor;
		else
			return reverseAux(vetor, ++IDinicial, --IDfinal);
	}
	
	// QUESTAO 04
	
	/*
	 * 
	 * private int soma(No inicio){
	 * 		if (inicio == null)
	 * 			return 0;
	 * 		else
	 * 			return inicio.getInfo() + soma(inicio.getProx());
	 * }
	 * 
	 */
}
