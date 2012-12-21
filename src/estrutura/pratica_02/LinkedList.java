
package estrutura.pratica_02;

public class LinkedList<E> {
		
	private Node<E> head;
	private int size;
	
	public LinkedList(){
		this.head = null;
		this.size = 0;
	}
	
	public void addPosition(E e, int index){
		if(index < 0 || index > size)
			throw new IndexOutOfBoundsException();
		if(this.head == null || index == 0)
			this.head = new Node<E>(e, head);
		else{
			Node<E> aux = this.getNode(index -1); 
			aux.setProx(new Node<E>(e, aux.getProx()));
		}
		++size;
	}
	
	public void addBeginning(E e){
		this.addPosition(e, 0);
	}
	
	public void addEnd(E e){
		this.addPosition(e, size);
	}
	
	public E remove(int index){
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException();
		Node<E> aux = (index == 0)? this.head: getNode(index-1);
		E removeAux = (index == 0)? aux.getValue(): aux.getProx().getValue();
		if(index == 0)
			this.head = this.head.getProx();
		else if(index == size -1)
			aux.setProx(null);
		else
			aux.setProx(aux.getProx().getProx());
		--this.size;
		return removeAux;
	}
	
	public E removeBeginning(){
		return this.remove(0);
	}
	
	public E removeEnd(){
		return this.remove(size-1);
	}
	
	private Node<E> getNode(int index){
		if(index < 0 || index > size)
			throw new IndexOutOfBoundsException();
		Node<E> aux = head;
		for(int i = 0; i < index; i++)
			aux = aux.getProx();
		return aux;
	}
	
	public E get(int index){
		return getNode(index).getValue();
	}
	
	public boolean conteins(E e){
		Node<E> aux = this.head;
		while(aux.getProx() != null){
			if (aux.getValue().equals(e))
				return true;
			aux = aux.getProx();
		}
		return false;	
	}
	
	public int size(){
		return this.size;
	}
	
	public boolean isEmpty(){
		return this.size == 0;
	}
	
	public static void main(String[] args) {
		
	}

}