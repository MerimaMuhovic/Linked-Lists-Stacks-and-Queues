package homework1Task2;

import java.util.Stack;

public class Exe {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();

		stack.push(10);
		stack.push(8);
		stack.pop();
	
		
		System.out.println("stack size: " + stack.size());

	}

}
