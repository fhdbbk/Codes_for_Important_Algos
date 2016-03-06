package stack;

public class StackEmptyException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StackEmptyException(String st){
		super(st);
		System.out.println(st);
	}
}
