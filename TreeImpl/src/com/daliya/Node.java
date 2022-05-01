package com.daliya;

//Tree applications 
//Hierarchical data repn in memory
// binary tree every node has atmost 2 children ie., 0,1,2 

public class Node {
	int key;
	Node left;
	Node right;

	Node(int k) {
		key = k;
	}

	public void inorder(Node root) {
		// O(n);n:of nodes
		// Auxillay space is recursive calls for height of tree+1(null of leaf ) O(H)
		if (root != null) {
			inorder(root.left);
			System.out.print(root.key + ",");
			inorder(root.right);
		}
	}

	public void preorder(Node root) {
		// O(n);n:of nodes
		// Auxillay space is recursive calls for height of tree+1(null of leaf ) O(H)
		if (root != null) {
			System.out.print(root.key + ",");
			preorder(root.left);
			preorder(root.right);
		}
	}

	public void postorder(Node root) {
		// O(n);n:of nodes
		// Auxillay space is recursive calls for height of tree+1(null of leaf ) O(H)
		if (root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.key + ",");

		}

	}
	
	public int heightOfTree(Node root) {
		if(root == null ) {
			return 0;
		}else {
			return Math.max(heightOfTree(root.left),heightOfTree(root.right))+1;
		}
	}
}
