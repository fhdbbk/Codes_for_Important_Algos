package linkedlists;

public class DoublyLinkedList {
	
	DNode head;
	
	public DoublyLinkedList(){
		head = null;
	}

	public void insertAtHead(Object d){
		DNode temp = new DNode(d);
		if (head == null){
			head = temp;
			return;
		}
		temp.next = head;
		head.prev = temp;
		head = temp;
	}
	
	public void insertAtTail(Object d){
		DNode temp1 = new DNode(d);
		if (head == null){
			head = temp1;
			return;
		}
		DNode temp2 = head;
		while(temp2.next != null){
			temp2 = temp2.next;
		}
		temp2.next = temp1;
		temp1.prev = temp2;
		
	}
	
	public void printList(){
		DNode temp = head;
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
	
	public void reversePrint(){
		DNode temp = head;
		if(temp == null){
			System.out.println("List is empty!");
			return;
		}
		while(temp.next != null){
			temp = temp.next;
		}
		while(temp != null){
			System.out.print((Integer)temp.data + "->"); 
			temp = temp.prev;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList dl = new DoublyLinkedList();
		dl.printList();
		//dl.insertAtHead(1);
		//dl.insertAtHead(5);
		//dl.insertAtHead(7);
		//dl.printList();
		//dl.reversePrint();
		dl.insertAtTail(54);
		dl.insertAtTail(68);
		dl.printList();
	}

}
