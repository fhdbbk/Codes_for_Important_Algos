package queue;

@SuppressWarnings("serial")
public class QueueEmptyException extends RuntimeException{
	
	public QueueEmptyException(String st){
		super(st);
		System.out.println(st);
	}
}
