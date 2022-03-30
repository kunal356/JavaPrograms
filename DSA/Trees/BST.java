package trees;

public class BST {
	public static void main(String[] args) {
		Node root = null;
		root = insert(root,20);
		root = insert(root,25);
		root = insert(root,15);
		root = insert(root,2);
		root = insert(root,30);
		root = insert(root,11);
		inOrder(root);
		System.out.println("");
		search(root,1);
		search(root,11);
		
		delete(root,25);
		delete(root,112);
		delete(root,11);
		inOrder(root);
		System.out.println("");
		
	}
	public static Node insert(Node root,int data) {
		Node newNode = new Node(data);
		return insert(root,newNode);
		
	}
	private static Node insert(Node root, Node newNode) {
		if(root==null) return newNode;
		if(root.data<newNode.data) {
			root.right = insert(root.right,newNode);
		}else {
			root.left = insert(root.left,newNode);
		}
		return root;
	}
	public static void inOrder(Node root) {
		if(root==null) {
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	public static void search(Node root,int data) {
		if(root==null) {
			System.out.println(data+" is not present in the BST");
			return;
		}if(root.data==data) {
			System.out.println(data+" is present in the BST");
			return;
		}
		if(root.data<data) {
			search(root.right,data);
		}else {
			search(root.left,data);
		}
		
	}
	
	public static Node delete(Node root, int data) {
		if(root == null) {
			System.out.println(data+" is not present");
			return null;
		}
		if(root.data < data) {
			root.right = delete(root.right,data);
			return root;
		}else if(root.data>data) {
			root.left = delete(root.left,data);
			return root;
		}
		
		if(root.right == null && root.left == null) {
			root = null;
			return root;
		}else if(root.left == null) {
			root = root.right;
			return root;	
		}else if(root.right == null) {
			root = root.left;
			return root;
		}else {
			
			
			Node replacingNode = findMax(root.left);
			root.data = replacingNode.data;
			root.left = delete(root.left,replacingNode.data);
			
			/*Node replacingNode = findMin(root.right);
			root.data = replacingNode.data;
			root.right = delete(root.right,replacingNode.data);
			*/
			
		}
		return root;
	}
	
	public static Node findMax(Node root) {
		while(root.right!=null) {
			root = root.right;
		}
		return root;
	}
}
