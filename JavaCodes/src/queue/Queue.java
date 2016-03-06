package queue;

public interface Queue {
	public int size();
	public boolean isEmpty();
	public Object front() throws QueueEmptyException;
	public void dequeue() throws QueueEmptyException;
	public void enqueue(Object o) throws QueueFullException;
}
