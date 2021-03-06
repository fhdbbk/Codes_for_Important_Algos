package linkedlists;

public class LinkedList {

	/**
	 * @param args
	 */
	Node head = null;
	
	//Inserts at the end
	public void insert(Object d){
		Node temp1 = new Node(d);
		if(head == null){
			head = temp1;
			return;
		}
		Node temp2 = head;
		while(temp2.next != null){
			temp2 = temp2.next;
		}
		temp2.next = temp1;
	}
	
	public Node getHead(){
		return head;
	}
	
	//Inserts at the given position
	public void insert(Object d, int position){
		Node temp1 = new Node(d);
		if(position == 1){
			temp1.next = head;
			head = temp1;
			return;
		}
		Node temp2 = head;
		for(int i = 1; i < position-1; i++){
			temp2 = temp2.next;
		}
		temp1.next = temp2.next;
		temp2.next = temp1;
	}
	
	// Prints the integer data values in the list
	public void printList(){
		Node temp = head;
		if(temp == null){
			System.out.println("List is empty!");
			return;
		}
		while(temp != null){
			System.out.print((Integer)temp.data + "->"); 
			temp = temp.next;
		}
		System.out.println();
	}
	
	//Recursive method to print the list
	public void printList(Node p){
		if(p == null){
			System.out.println();
			return;
		}
		System.out.print((Integer)p.data + "->");
		printList(p.next);
	}
	
	//Method to print the list in reverse order
	public void printReverse(Node p){
		if(p == null){
			return;
		}
		printReverse(p.next);
		System.out.print((Integer)p.data + "->");
	}
	
	public int listSize(){
		if(head == null){
			return 0;
		}
		else{
			Node temp = head;
			int count = 0;
			while(temp != null){
				count++;
				temp = temp.next;
			}
			return count;
		}
	}
	
	public void deleteNode(int position){
		if(position > listSize()){
			System.out.println("Invalid operation");
			return;
		}
		if(position == 1){
			head = head.next;
			return;
		}
		
		Node temp = head;
		for(int i = 1; i < position-1; i++){
			temp = temp.next;
		}
		temp.next = temp.next.next;
	}
	
	public void reverseList(){
		Node prev = null;
		Node next = null;
		Node current = head;
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}
	
	public void reverseList(Node p){
		if (p.next == null){
			head = p;
			return;
		}
		reverseList(p.next);
		Node q = p.next;
		q.next = p;
		p.next = null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.insert(5);
		list.printList();
		list.insert(56);
		list.printList();
		list.insert(41);
		list.printList();
		list.insert(1, 1);
		list.printList();
		list.insert(22, 3);
		list.printList();
		list.insert(82, 6);
		list.printList();
		System.out.println("Size of the list is: " + list.listSize());
		//list.deleteNode(4);
		//list.printList();
		//list.deleteNode(1);
		//list.printList();
		//list.deleteNode(4);
		//list.printList();
		//list.deleteNode(4);
		//list.printList();
		//System.out.println("Size of the list is: " + list.listSize());
		list.reverseList();
		Node h = list.getHead();
		list.printList(h);
		list.printReverse(h);
		System.out.println();
		list.reverseList(h);
		list.printList();
	}

}
