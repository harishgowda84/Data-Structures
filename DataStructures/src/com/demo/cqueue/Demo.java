package com.demo.cqueue;

public class Demo {
	
	public static void main(String[] args) {
		
		Cqueue queue = new Cqueue();
		
		queue.insert(10);
		queue.insert(20);
		queue.insert(30);
		queue.insert(40);
		
		System.out.println("Size is: "+queue.size());
		
		queue.display();
		
	}

}
