class Main{
    
    public static Node getTree(){
        Node root = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        Node node5 = new Node(6);
        Node node6 = new Node(7);
        Node node7 = new Node(8);
        Node node8 = new Node(9);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;

        node2.left = node5;
        node2.right = node6;

        node3.left = node7;
        node3.right = node8;

        return root;

    }
    
//     preorder using recursion
    public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    
//     postorder using recursion
    public static void postorder(Node root){
        if(root==null) return;
        
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

//     inorder using recursion
    public static void inorder(Node root){
        if(root==null) return;
        
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
        
    }
    
//     preorder using iteration
    public static void preorderIterative(Node root){
        
        if(root==null) return;
        Stack<Node> s = new Stack<>();
        s.push(root);

        while(!s.isEmpty()){
            Node node = s.pop();
            System.out.print(node.data+" ");

            if(node.right!=null){
                s.push(node.right);
            }if(node.left!=null){
                s.push(node.left);
            }
        }
    }

    // inorder using iteration
    public static void inorderIterative(Node root){
        
        if(root==null) return;
        Stack<Node> s = new Stack<>();
        Node curr = root;

        while(curr!=null || s.size()>0){
            while(curr!=null){
                s.push(curr);
                curr=curr.left;
            }
        curr=s.pop();
        System.out.print(curr.data+" ");
        curr = curr.right;
        }
        
    }
//postOrder Iterative remaining
    
//    level order traversal
    public static void levelOrderIn1Line(Node root) {
    	Queue<Node> q = new LinkedList<>();
    	q.add(root);
    	
    	while(!q.isEmpty()) {
    		Node node = q.remove();
    		
    		System.out.print(node.data+" ");
    		if(node.left != null) {
    			q.add(node.left);
    		}
    		if(node.right !=null) {
    			q.add(node.right);
    		}
    		
    		
    		
    	}
    }
    
    public static void levelOrder(Node root) {
    	Queue<Node> q = new LinkedList<>();
    	q.add(root);
    	q.add(null);
    	while(!q.isEmpty()) {
    		Node node = q.remove();
    		if(node==null) {
    			System.out.println();
    			if(!q.isEmpty())q.add(null);
    			continue;
    		}
    		System.out.print(node.data+" ");
    		if(node.left != null) {
    			q.add(node.left);
    		}
    		if(node.right !=null) {
    			q.add(node.right);
    		}
    		
    		
    		
    	}
    }
    
//    Height of tree 
    public static int getHeight(Node root) {
    	if(root == null) return 0;
    	int leftHeight = getHeight(root.left);
    	int rightHeight = getHeight(root.right);
    	return Math.max(leftHeight, rightHeight)+1;
    }
    
//    count of Leaf Nodes
    public static int countLeafNodes(Node root) {
    	if(root == null) {
    		return 0;
    	}
    	if(root.left==null && root.right==null) {
    		return 1;
    	}
    	int leftLeafNodes = countLeafNodes(root.left);
    	int rightLeafNodes = countLeafNodes(root.right);
    	return leftLeafNodes+rightLeafNodes;
    }



    public static void main(String args[]){
        Node root = getTree();
        System.out.println("Preorder using recursion: ");
        preorder(root);
        System.out.println("");
        System.out.println("Postorder using recursion: ");
        postorder(root);
        System.out.println("");
        System.out.println("Inorder using recursion: ");
        inorder(root);
        



    }
}
class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
