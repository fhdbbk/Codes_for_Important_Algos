package stack;

public class StackFullException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StackFullException(String st){
		super(st);
		System.out.println(st);
	}
}
