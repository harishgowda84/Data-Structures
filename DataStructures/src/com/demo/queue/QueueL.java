package com.demo.queue;

import java.util.NoSuchElementException;

public class QueueL {
	
	public Node front;
	public Node rear;
	
	public QueueL(){
		front=null;
		rear=null;
	}
	
	public boolean isEmpty(){
		return (front==null);
	}
	
	public int size(){
		
		Node start=front;
		int size=0;
		while(start!=null){
			start=start.link;
			size++;			
		}
		return size;
	}
	
	public void insert(Object element) {

		Node tmp = new Node(element);
		if (isEmpty()) {
			front = tmp;

		} else {
			rear.link = tmp;
		}
		rear = tmp;

	}
	
	public Object delete(){
		
		Object element=null;
		
		if (!isEmpty()){
		element = front.element;
		front=front.link;
		}else{
			System.out.println("Queue is empty");
			throw new NoSuchElementException();
		}
		return element;
		
	}
	
	public void display(){
		
		Node p =front;
		
		if(isEmpty()){
			System.out.println("Queue is empty");
			return;
		}
		while(p!=null){
			System.out.println(p.element+" ");
			p=p.link;
		}
	}

}
