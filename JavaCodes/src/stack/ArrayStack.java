package stack;

public class ArrayStack implements Stack{
	public static final int CAPACITY = 1024;
	private int N;
	private Object S[];
	private int t = -1;
	
	public ArrayStack(){
		this(CAPACITY);
	}
	
	public ArrayStack(int cap){
		N = cap;
		S = new Object[N];
	}

	public int size() {
		// TODO Auto-generated method stub
		return t+1;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (t < 0);
	}

	public Object top() throws StackEmptyException {
		// TODO Auto-generated method stub
		if(isEmpty())
			throw new StackEmptyException("Stack is Empty");
		return S[t];
		
	}

	public void push(Object o) throws StackFullException{
		// TODO Auto-generated method stub
		if (size() == N)
			throw new StackFullException("Stack Overflow");
		S[++t] = o;
	}

	public Object pop() throws StackEmptyException {
		// TODO Auto-generated method stub
		Object elem;
		if(isEmpty())
			throw new StackEmptyException("Stack is Empty");
		elem = S[t];
		S[t--] = null;
		return elem;
	}
}
