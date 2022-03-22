package trees;
import java.util.*;

// Print Preorder of the tree using Indorder and Postorder

class TreeUsingInAndPost {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int inOrder[] = new int[n];
		int postOrder[] = new int[n];
		for(int i=0; i<n; i++){
			inOrder[i] = sc.nextInt();
		}

		for(int i=0; i<n; i++){
			postOrder[i] = sc.nextInt();
		}
		Node root = buildTree(inOrder, postOrder, n);
		preOrder(root);
	}
	private static void preOrder(Node root){
		if(root==null){
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}

	private static Node buildTree(int[] inOrder,int[] postOrder,int n){
		if(n == 0){
			return null;
		}
		return buildTree(inOrder, postOrder, 0, n-1, 0, n-1);

	}

	private static Node buildTree(int[] inOrder, int[] postOrder, int inStart, int inEnd, int postStart, int postEnd){
		if(inStart > inEnd){
			return null;
		}

		Node node = new Node(postOrder[postEnd]);
		int currNodeInInorder = search(inOrder, inStart, inEnd, postOrder[postEnd]);
		
		node.left = buildTree(inOrder, postOrder, inStart, currNodeInInorder-1, postStart, postStart - inStart + currNodeInInorder-1);
		node.right = buildTree(inOrder, postOrder, currNodeInInorder+1, inEnd, postEnd - inEnd + currNodeInInorder , postEnd-1);
		return node;

	}

	private static int search(int[] arr,int start, int end, int data){
		for(int i=start;i<=end;i++){
			if(arr[i]==data){
				return i;
			}
		}
		return -1;
	}


}
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}
