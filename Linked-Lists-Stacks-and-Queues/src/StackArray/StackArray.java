package homework1Task2;

public class StackArray<Item> {

	private int top = 0;
	private int length = 0;
	
	Item[] newStack =(Item[]) new Object[1];
		
	public void resize(int capacity) {
		
		Item[]copy =(Item[]) new Object[capacity];
		for(int i=0; i < length;i++) {
		
			copy[i]=newStack[i];
			newStack=copy;		
		}
	}
	public boolean isEmpty() {
		return top==0;
		
	}

	public int size() {
		return length;
	}

	
	public void push(Item item) {
		if(newStack.length==length) {
			resize(2 * newStack.length);
		}
		
		newStack[top]=item;
		length++;
	}
	
	public void pop() {
		
		Item item = newStack[top];
		newStack[top] = null;
		
		if(length > 0 && length == newStack.length / 4) { 	
			resize(newStack.length / 2);
		}
	
		length--;
	}
	
}

	
	


