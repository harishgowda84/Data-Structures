package com.demo.cqueue;

public class Cqueue {

	public Node rear;

	public boolean isEmpty() {
		return (rear == null);
	}

	public void insert(Object item) {
		Node tmp = new Node(item);

		if (isEmpty()) {

			rear = tmp;
			tmp.link = rear;
		} else {

			tmp.link = rear.link;
			rear.link = tmp;
			rear = tmp;

		}

	}

	public Object delete() {

		Node tmp = null;
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return null;
		} else {
			if (rear.link == rear) {
				tmp = rear;
				rear = null;
			}
			tmp = rear.link;
			rear.link = rear.link.link;

		}
		return tmp.element;
	}

	public int size() {

		Node start = rear.link;
		int size = 0;
		if (isEmpty()) {
			return 0;
		}

		while (start != rear) {
			start = start.link;
			size++;
		}
		return size;

	}

	public void display() {

		Node start = rear.link;

		if (isEmpty()) {
			System.out.println("Queue is empty");
		}

		do
		{
			System.out.println(start.element+" ");
			start=start.link;
		}while(start!=rear.link);

	}

}
