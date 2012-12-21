package estrutura.pratica_01;

public class ArrayList<E>{

	private transient Object[] vector;
	private int size,
				increase;
	
	public ArrayList(){
		this(10);
		this.increase = 10;
	}
	
	public ArrayList(int length){
		this.vector = new Object[length];
		this.size = 0;
		this.increase = 0;
	}
	
	private Object[] incrementVector(Object[] vector, int increase){
		Object[] aux = new Object[vector.length + increase];
		for(int i = 0; i < vector.length; ++i)
			aux[i] = vector[i];
		return aux;
	}
	
	private Object[] decrementVector(Object[] vector, int decrement){
		Object[] aux = new Object[vector.length - decrement];
		for(int i = 0; i < aux.length; i++)
			aux[i] = vector[i];
		return aux;
	}
	
	public void addPosition(E arg0, int index) {
		if(index < 0 || index > size || (this.increase == 0 && size == this.vector.length))
			throw new IndexOutOfBoundsException();
		if(size == this.vector.length)
			vector = incrementVector(vector, increase);
		for(int i = size; i > index; --i)
			vector[i] = vector[i-1];
		vector[index] = arg0;
		++size;
	}

	public void addBeginning(E arg0) {
		this.addPosition(arg0, 0);
	}

	public void addEnd(E arg0){
		this.addPosition(arg0, size);
	}

	public boolean contains(E arg0) {
		for(int i = 0; i < this.size; i++)
			if (this.vector[i].equals(arg0))
				return true;
		return false;
	}

	public boolean isEmpty() {
		return (this.size == 0)?true:false;
	}

	
	public E remove(int index){
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException();
		E aux = (E) this.vector[index];
		for(; index < size -1; ++index)
			this.vector[index] = vector[index+1];
		if ((this.size-1) % this.increase == 0){
			System.out.println("entrei aki");
			this.vector = this.decrementVector(vector, increase);
		}
		--size;
		return aux;
	}

	public E get(int arg0){
		if (arg0 < 0 || arg0 >= size)
			throw new IndexOutOfBoundsException();
		return (E) vector[arg0];
	}

	public E removeBeginning() {
		return remove(0);
	}

	public E removeEnd(){
		return remove(size-1);
	}

	public int size() {
		return this.size;
	}

}