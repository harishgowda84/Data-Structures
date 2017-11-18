package tree;

public class Node {
	 public Object data;
	 Node left;
	 Node right;
	 public Node(){
		 
	 }
	 public Node(Object data){
		 this.data=data;
		 left=null;
		 right=null;
	 }
	@Override
	public String toString() {
		return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
	 
	 

}
