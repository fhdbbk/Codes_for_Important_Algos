package queue;

@SuppressWarnings("serial")
public class QueueFullException extends RuntimeException{
	public QueueFullException(String st){
		super(st);
		System.out.println(st);
	}

}
