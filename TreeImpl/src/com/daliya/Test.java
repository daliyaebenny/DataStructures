package com.daliya;

public class Test {

	public static void main(String[] args) {
	 Node root = new Node(10);
	 root.left = new Node(20);
	 root.right = new Node(30);
	 root.left.left = new Node(40);
	 System.out.print("\n INORDER \n ");
	 root.inorder(root);
	 System.out.print("\n PREORDER \n");
	 root.preorder(root);
	 System.out.print("\n POSTORDER \n");
	 root.postorder(root);
	 System.out.print("\n HEIGHT \n");
	 System.out.print(root.heightOfTree(root));
	}

}