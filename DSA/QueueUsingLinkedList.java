package queue;
import java.util.LinkedList;
public class QueueUsingLinkedList<K> {
	class Node{
		K data;
		public Node(K data) {
			this.data=data;
		}
	}
	
	LinkedList<Node> ll;
	int size;
	public QueueUsingLinkedList(){
		ll=new LinkedList<>();
		this.size=0;
	}
	public void add(K data) {
		Node n = new Node(data);
		ll.addLast(n);
		this.size++;
	}
	
	public K remove() {
		Node nodeToremove = ll.getFirst();
		ll.removeFirst();
		this.size--;
		return nodeToremove.data;	
	}
	
	public K peek() {
		return ll.getFirst().data;
	}
	
	public boolean isEmpty() {
		return this.size==0;
	}
	
	public void display() {
		Node temp = null;
		int i= 0;
		while(i<size) {
			temp=ll.get(i);
			System.out.print(temp.data+" ");
			i++;
		}
	}
	public static void main(String[] args) {
		QueueUsingLinkedList<Integer> q1 = new QueueUsingLinkedList<Integer>();
		q1.add(10);
		q1.add(20);
		q1.add(30);
		q1.add(40);
		System.out.println(q1.peek());
		System.out.println(q1.remove());
		System.out.println(q1.isEmpty());
		q1.display();
		
	}
}
