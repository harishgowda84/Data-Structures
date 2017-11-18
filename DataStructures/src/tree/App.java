package tree;

public class App {
	
	public static void main(String[] args) {
		
		
		Node root = new Node("A");
		root.left = new Node("B");
		root.right = new Node("C");

		root.left.left = new Node("B1");
		root.left.right = new Node("B2");
		
		root.right.left = new Node("C1");
		root.right.right = new Node("C2");


		BinaryTree binaryTree = new BinaryTree();
		binaryTree.root=root;
		
		binaryTree.preorder(root);
		System.out.println();
		binaryTree.inorder(root);
		System.out.println();
		binaryTree.postorder(root);
		System.out.println();
		binaryTree.levelorder(root);
		System.out.println();
		System.out.println("Height of a tree: "+binaryTree.height(root));
		
		binaryTree.leftNodes(root);
		
		
	
		
       
		
	
	
		
		
	

	}

}
