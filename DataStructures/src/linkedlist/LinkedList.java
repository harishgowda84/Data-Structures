package linkedlist;

//added comment
public class LinkedList {
	
	public Node head;
	
	public void addAtStart(int i) {

		Node node = new Node(i);
		if (head == null) {
			head = node;
		} else {
			node.setNext(head);
			head = node;
		}

	}
	Node  ReversePrint(Node head) 

	{
	            Node prev = null;
				Node current = head;
				Node next = null;
				while (current != null) {
					next = current.next;
					current.next = prev;
					prev = current;
					current = next;
				}
				head = prev;
	         
	    return head;
	    
	}

	Node Delete(Node head, int position) {
		  
	     Node start=head;
	     Node prev=null;
	    
	    if(head == null){
	        return head;
	    }
	    int count=0;
	    
	    while(start!=null){
	        
	        if(count==position){
	            break;
	        }
	        prev=start;
	        start=start.next;
	        count=count+1;
	    }
	    if(prev!=null){
	        prev.next=start.next;
	    }else{
	        start=start.next;
	    }
	    return head;
	}
	
	public void positionNode(int position,Node head){
		
		Node start=head;
		int cposition=1;
		while(start!=null){
			if(cposition==position){
				break;
			}
			start=start.next;
			cposition++;
		}
		
		if (start == null) {
			System.out.println("Node not found");
		} else {
			System.out.println("Node at position:  " +position+" is  "+ start.element);
		}
	
		
	}
	
	public Node InsertNth(Node head, int data, int position) {

		Node start = head;

		if (start == null && position > 1) {
			System.out.println("Node is empty, it cannot be inserted at :  " + position);
			return null;
		} else if (start == null) {
			Node node = new Node(data);
			head = node;
			return head;
		}

		int currentPosition = 1;
		Node prev = null;

		if (position == 1) {
			Node newNode = new Node(data);
			newNode.next = start;
			start = newNode;
			return start;
		}

		while (start != null) {

			if (currentPosition == position) {
				break;
			}
			prev = start;
			start = start.next;
			currentPosition++;

		}
		Node newNode = new Node(data);
		newNode.next = start;
		prev.next = newNode;
		return head;

	}
	
	public void addBeforeElement(int i,int element) {
		
		Node start=head;
       while(start!=null){	
    	   
    	   if(start.next.element==i){
    		   break;
    	   }
	    	start=start.next;	    	
	    }
       Node newNode = new Node(element);
       newNode.setNext(start.next);
       start.setNext(newNode);
       
      
       

	}
	
	public void printAllElements(Node head) {
	    Node start=head;
	    while(start!=null){
	    	
	    	System.out.print(start.element+" ");
	    	start=start.next;
	    	
	    }
	    
	    System.out.println("");
	    
	}
	
	public void addAtEnd(int i) {
	    Node start=head;
	    while(start.next!=null){    	
	    
	    	start=start.next;
	    	
	    }
	    Node end = new Node(i);
	    start.next=end;
	    
	    
	}
	

}
