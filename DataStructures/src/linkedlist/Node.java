package linkedlist;

public class Node {
	
	public int element;
	public  Node next;
	
	public Node (){
		
	}
	
	public Node (int i){
		element=i;
		next=null;
	}
	public int getElement() {
		return element;
	}
	public void setElement(int element) {
		this.element = element;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	

}
