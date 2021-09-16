package homework1Task3;


public class QueueList<Item> {  
	
	private Node<Item> tail;
	private Node<Item> head;
	private int length;

	
public void enqueue(Item item) {    //////  ulazi na tail izlazi na head
	Node<Item> newNode= new Node<Item>();
	newNode.data=item;
	
	if(tail==null) {/////jer ulazi na tail
		tail=newNode;
		head=newNode;  ///   jer ako imamo jedan node onda je on head i tail  ?
	}
	else{
		tail.next=newNode; // ??
	}
	length ++;
}

public void dequeue() {
	
	if(isEmpty()) {
		throw new IndexOutOfBoundsException("empty");
	}
	else if(length==1) {
		head=null;
	}
	else {

		Node<Item> current=head;
		
		while(current.next.next !=null) {
			current=current.next;
		}
		current.next=null;
	}
	length--;
	
}

public boolean isEmpty() {
	return head==null;
}

public int size() {
	return length;
}

}
	
