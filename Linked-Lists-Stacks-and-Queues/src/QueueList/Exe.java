package homework1Task3;

public class Exe {

	public static void main(String[] args) {
		
		QueueList<Integer> queue = new QueueList<Integer>();

		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);

		queue.enqueue(4);
		
		System.out.println("queue size: " + queue.size());
	}

}
