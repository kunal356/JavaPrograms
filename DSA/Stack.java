package stackImplementation;
import java.util.LinkedList;
public class Stack<K>{
	
	private class Node{
		K val;
		
		public Node(K val) {
			this.val=val;
		}
	}
	
	private int size;
	private int tOS;
	LinkedList<Node> st;
	public Stack() {
		st= new LinkedList<>();
		this.size=0;
		this.tOS=-1;
		
	}
	public void push(K val) {
		Node node = new Node(val);
		this.st.addFirst(node);
		this.size++;
		this.tOS++;
	}
	public K pop() {
		Node n = st.removeFirst();
		this.size--;
		this.tOS--;
		return n.val;
		
	}
	public K peek() {
		Node n = st.getFirst();
		return n.val;
	}
	public boolean isEmpty() {
		return st.isEmpty(); 
	}
	public static void main(String[] args) {
		Stack<Integer> st= new Stack<Integer>();
		st.push(80);
		st.push(40);
		st.push(30);
		st.push(20);
		st.pop();
		System.out.println(st.peek());
		
//		System.out.println(st.peek());
		System.out.println(st.isEmpty());
	}
}
