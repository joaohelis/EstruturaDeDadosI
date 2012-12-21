package estrutura.pratica_03;

/* Interface que define as ações de uma Pilha.
 */
public interface Stack{
	//Insere o objeto no topo da pilha
	public void push(Aluno a);

	//Remove o elemento no topo da pilha e retorna
	public Aluno pop() throws EmptyStackException;

	//Retorna o aluno da posição p da lista
	public Aluno top() throws EmptyStackException;

	//Retorna um boolean indicando se a pilha está vazia
	public boolean empty();

	//Informa o número de elemento da pilha
	public int size();

	//Imprime o conteúdo da Pilha
	public String toString();
}