package linkedlist;

public class LinkedList {
	
	private class Node{
		int data;
		Node next;
		Node(){
			
		}
		Node(int data,Node next){
			this.data=data;
			this.next=next;
		}
	}
	private int size;
	private Node head;
	private Node tail;
	
	public int getSize() {
		return this.size; 
	}
	
	public void addFirst(int data) {
		
		Node n = new Node(data,null);
		if(this.size==0) {
			this.tail=n;
		}
		n.next = this.head;
		this.head = n;
		this.size++;
	}
	
	public void addLast(int data) {
		if(size==0) {
			addFirst(data);
			return;
		}
		Node n = new Node(data,null);
		this.tail.next=n;
		this.tail=n;
		this.size++;
	}
	
	public void add(int data,int idx) {
		Node n=new Node(data,null);
		Node prev=getNode(idx-1);
		n.next=prev.next;
		prev.next=n;
		this.size++;
	}
	private Node getNode(int idx) {
		if(idx>=this.size) return null;
		if(idx==this.size-1) return this.tail;
		Node temp = this.head;
		int tempIdx=0;
		while(tempIdx<idx) {
			temp = temp.next;
			tempIdx++;
		}
		return temp;
	}
	
	public int getData(int idx) {
		return getNode(idx).data;
	}
	
	public void set(int data,int idx) {
		Node n = getNode(idx);
		n.data=data;
	}
	
	public void removeFirst() {
		if(isEmpty()) return;
		if(this.size==1) this.tail = null;
		this.head=this.head.next;
		this.size--;
	}
	
	public boolean isEmpty() {
		return this.size==0;
	}
	private void swap(Node i,Node j) {
		int temp=i.data;
		i.data=j.data;
		j.data=temp;
	}
	public void reverseDI() {
		int l=0;
		int r=this.size-1;
		while(l<r) {
			Node lnode=getNode(l);
			Node rnode=getNode(r);
			swap(lnode,rnode);
			l++;
			r--;
		}
	}
	
//	**********Three Pointer Method**********
	public void reversePI() {
		Node p=null,c=this.head,n;
		while(c!=null) {
			n=c.next;
			c.next=p;
			p=c;
			c=n;
		}
		swapHeadTail();
	}
	
	public void reversePR() {
		reversePR(this.head);
		swapHeadTail();
		this.tail.next=null;
	}
	
	private void reversePR(Node n) {
		if(n==tail) return;
		
		reversePR(n.next);
		n.next.next=n;
	}
	
	private Node left; //only used for printing reverseData Recursively
	public void reverseDR() {
		left=this.head;
		reverseDR(this.head,0);
	}
	private void reverseDR(Node right,int ri) {
		if(right==null) return;
		reverseDR(right.next,ri+1);
		if(ri>=(this.size)/2) {
			swap(left, right);
			left=left.next;
		}
	}
	
	private void swapHeadTail() {
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
	}
	
	public void display() {
		Node temp=this.head;
		while(temp!=null) {
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
		System.out.println("null");
	}
}
