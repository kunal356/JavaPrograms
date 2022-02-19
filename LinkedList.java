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
	
	public void display() {
		Node temp=this.head;
		while(temp!=null) {
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
		System.out.println("null");
	}
}
