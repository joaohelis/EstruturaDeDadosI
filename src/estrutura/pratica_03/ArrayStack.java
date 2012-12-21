package estrutura.pratica_03;

public class ArrayStack implements Stack {

	private Aluno[] stack;
	private int size;
	private int incremento;
	
	public ArrayStack(int tamanho){
		this.stack = new Aluno[tamanho];
		this.size = 0;
		this.incremento = 0;
	}
	
	public ArrayStack(){
		this(10);
		this.incremento = 10;
	}
	
	private Aluno[] incrementStack(Aluno[] vector, int increase){
		Aluno[] aux = new Aluno[vector.length + increase];
		for(int i = 0; i < vector.length; ++i)
			aux[i] = vector[i];
		return aux;
	}
	
	private Aluno[] decrementVector(Aluno[] vector, int decrement){
		Aluno[] aux = new Aluno[vector.length - decrement];
		for(int i = 0; i < aux.length; i++)
			aux[i] = vector[i];
		return aux;
	}
	
	@Override
	public void push(Aluno arg0) {
		if(this.incremento == 0 && size == this.stack.length)
			throw new FullStackException("full Stack");
		if(size == this.stack.length)
			stack = this.incrementStack(stack, incremento);
		stack[size] = arg0;
		++size;
	}
	
	@Override
	public Aluno pop() throws EmptyStackException{
		if(size == 0)throw new EmptyStackException("Empty stack");
		Aluno aux = this.stack[size-1];
		this.stack[size-1] = null;
		if (incremento != 0 && (this.size-1) % this.incremento == 0)
			this.stack = this.decrementVector(stack, incremento);
		--size;
		return aux;
	}
	
	@Override
	public Aluno top() throws EmptyStackException {
		if(size == 0)throw new EmptyStackException("Empty stack");
		return this.stack[size-1];
	}

	@Override
	public boolean empty() {
		return (size == 0)?true:false;
	}

	@Override
	public int size() {
		return this.size;
	}

	public String toString(){
		String aux = "";
		for(int i = size-1; i >= 0; i--)
			aux += "Aluno: "+this.stack[i]+"\n";
		return aux;
	}
}
