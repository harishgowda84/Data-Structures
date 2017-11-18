package linkedlist;
//this is comment
public class LinkedListImpl {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.addAtStart(10);
		list.addAtStart(20);
		list.addAtStart(30);
		list.addAtStart(40);
		list.addAtEnd(100);

		list.printAllElements(list.head);

		Node updatedhead = list.InsertNth(list.head, 500, 3);

		list.printAllElements(updatedhead);

		 list.positionNode(3, updatedhead);

		

		Node head = list.ReversePrint(list.head);

		list.printAllElements(head);

	}

}
