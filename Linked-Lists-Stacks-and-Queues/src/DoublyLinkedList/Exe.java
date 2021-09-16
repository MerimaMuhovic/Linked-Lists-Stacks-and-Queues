package homework1Task1;

public class Exe {

	public static void main(String[] args) {
		
DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
		
		list.addRear(1);
		list.addRear(2);
		list.addRear(3);
		list.addRear(4);
		list.addFront(5);
		list.addFront(6);
		
		list.removeFront();
		list.removeRear();
		
		for (Integer i: list) {
			System.out.println(i);
		}
		
		System.out.println("list size: " + list.count());
	}



	}


