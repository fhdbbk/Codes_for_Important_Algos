package queue;

public class ArrayQueue implements Queue{
	
	public static final int CAPACITY = 1024;
	private int N;
	private Object Q[];
	private int f = -1;
	private int r = 0;
	
	public ArrayQueue(){
		this(CAPACITY);
	}
	
	public ArrayQueue(int cap){
		N = cap;
		Q = new Object[N];
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return (N - f + r) % N;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (f == r) || (f == -1);
	}

	@Override
	public Object front() throws QueueEmptyException {
		// TODO Auto-generated method stub
		if(isEmpty())
			throw new QueueEmptyException("Queue is empty");
		return Q[f];
	}

	@Override
	public void dequeue() throws QueueEmptyException {
		// TODO Auto-generated method stub
		if(isEmpty())
			throw new QueueEmptyException("Queue is empty");
		Q[f] = null;
		f = (f + 1) % N;
	}

	@Override
	public void enqueue(Object obj) throws QueueFullException {
		// TODO Auto-generated method stub
		if(size() == N - 1)
			throw new QueueFullException("Queue is full.");
		Q[r] = obj;
		r = (r + 1) % N;
	}

}
