package com.demo.stack;

public class MainImpl {

	public static void main(String[] args) {
		
		StackL stack = new StackL();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		System.out.println("Popped element is: "+stack.pop());
		
		System.out.println("List of elements: ");
		stack.display();

	}

}
