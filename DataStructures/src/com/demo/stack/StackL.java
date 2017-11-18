package com.demo.stack;

public class StackL {
	
	public Node top;
	
	public boolean isEmpty(){
		return (top==null);
		
	}
	
	public void push(Object x){
		
		Node node = new Node(x);
		node.next=top;
		top=node;
	}
	
	public Object pop() {

		Object x = top.element;
		top = top.next;
		return x;

	}
	
	public void display(){
		Node start=top;
		while(start!=null){
			System.out.println(start.element+" ");
			start=start.next;
		}		
	}
	
	
	
	

}
