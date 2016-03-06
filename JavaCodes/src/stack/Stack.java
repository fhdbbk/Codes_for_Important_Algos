package stack;

public interface Stack {
	public int size();
	public boolean isEmpty();
	public Object top() throws StackEmptyException;
	public void push(Object o);
	public Object pop() throws StackEmptyException;
}
