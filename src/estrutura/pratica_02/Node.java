package estrutura.pratica_02;

public class Node<E>{
	
	private E value;
	private Node<E> prox;
	
	public Node(E value, Node<E> prox){
		this.value = value;
		this.prox = prox;
	}

	public E getValue() {
		return value;
	}

	public void setValue(E value) {
		this.value = value;
	}

	public Node<E> getProx() {
		return prox;
	}

	public void setProx(Node<E> prox) {
		this.prox = prox;
	}

}
