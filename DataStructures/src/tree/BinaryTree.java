package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;

public class BinaryTree {
	Node root;

	public static int height(Node root) {
		if (root == null)
			return 0;

		int hl = height(root.left);
		int hr = height(root.right);

		if (hl > hr) {
			return 1 + hl;
		} else {
			return 1 + hr;
		}

	}

	/*public static boolean search(Node p, int x) {
		
		List<Object> sum= new ArrayList<Object>();
		
		sum.add(p.data);
		
		while (p != null) {

			if (x < p.data) {
				
				p = p.left;
				sum.add(p.data);

			} else if (x > p.data) {
				p = p.right;
				sum.add(p.data);
			} else {
				return true;
			}

		}
		return false;

	}*/
	
	
/*public static List<Integer> LCA(Node p, int x) {
		
		List<Integer> sum= new ArrayList<Integer>();
		
		sum.add(p.data);
		
		while (p != null) {

			if (x < p.data) {
				
				p = p.left;
				sum.add(p.data);

			} else if (x > p.data) {
				p = p.right;
				sum.add(p.data);
			} else {
				return sum;
			}

		}
		return sum;

	}*/

	/*public static Node InsertNode(Node root, int value) {
		Node tmp = root;
		Node prev = null;
		while (tmp != null) {
			prev = tmp;
			if (value < tmp.data) {
				tmp = tmp.left;

			} else if (value > tmp.data) {
				tmp = tmp.right;
			} else {
				return tmp;
			}

		}
		Node temp = new Node();
		temp.data = value;
		if (prev == null) {
			tmp = temp;
		} else if (value < prev.data) {
			prev.left = temp;
		} else {
			prev.right = temp;
		}
		return root;

	}

	public static void insert(Node root, int value) {
		Node prev = null;
		while (root != null) {
			prev = root;
			if (value < root.data) {
				root = root.left;

			} else if (value > root.data) {
				root = root.right;
			} else {
				System.out.println("Key is present");
				return;
			}

		}
		Node temp = new Node(value);
		if (prev == null) {
			root = temp;
		} else if (value < prev.data) {
			prev.left = temp;
		} else {
			prev.right = temp;
		}

	}*/
	
	
	public static void leftNodes(Node p) {
		if (p == null) {
			return;
		}
		System.out.print(p.data + " ");
		leftNodes(p.left);
		

	}

	public static void preorder(Node p) {
		if (p == null) {
			return;
		}
		System.out.print(p.data + " ");
		preorder(p.left);
		preorder(p.right);

	}
	
	public static void postorder(Node p) {
		if (p == null) {
			return;
		}
		
		postorder(p.left);
		postorder(p.right);
		System.out.print(p.data + " ");

	}

	public static void levelorder(Node root) {

		if (root == null) {
			return;
		}

		List<Node> elements = (List<Node>) new LinkedList<Node>();
		elements.add(root);

		while (elements.size() > 0) {

			if (elements.get(0).left != null)
				elements.add(elements.get(0).left);

			if (elements.get(0).right != null)
				elements.add(elements.get(0).right);
			
			System.out.print(elements.remove(0).data+" ");

		}

	}

	public static void inorder(Node p) {
		if (p == null) {
			return;
		}

		inorder(p.left);
		System.out.print(p.data + " ");
		inorder(p.right);

	}
	
	/*static Node lca(Node root,int v1,int v2)
    {
        if(root==null){
            return new Node();
        }
    
        List<Integer> first = LCA(root,v1);
		List<Integer> second = LCA(root,v2);
		
		List<Integer> common = new ArrayList<>();
		
		for(Integer element:  first){
			if(second.contains(element)){
				common.add(element);
			}
			
		}
		
		
	   
       return node;
    }*/

	

}
