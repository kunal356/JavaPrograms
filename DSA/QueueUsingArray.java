package queue;

public class QueueUsingArray {
	int data[];
	int size;
	int front;
	int rear;
	public QueueUsingArray(int capacity) {
		this.data = new int[capacity];
		this.size=0;
		this.front = this.rear =-1;
	}
	
	public void enqueue(int val) {
		if(size == data.length) {
			System.out.println("Queue overflow");
			return;
		}
		if(front == -1) front++;
		rear++;
		rear %= data.length;
		data[rear]=val;
		size++;
	}
	
	public int dequeue() {
		if(front==-1) {
			System.out.println("Queue Underflow");
			return -1;
		}
		int itemToDelete = data[front];
		if(front==rear) {
			this.size=0;
			front=-1;
			rear=-1;
			return itemToDelete;
		}
		front++;
		front %= data.length;
		size--;
		return itemToDelete;
	}
	
	public int peek() {
		if(front==-1) {
			System.out.println("Queue underflow");
			return -1;
		}
		return data[front];
	}
	
	public boolean isEmpty() {
		return this.size==0;
	}
	
	public void display() {
		for(int i=0; i<size; i++) {
			System.out.println(data[(front+i)%data.length]);
		}
	}
	public static void main(String[] args) {
		QueueUsingArray q = new QueueUsingArray(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		System.out.println("Item deleted "+q.dequeue());
		q.display();
		System.out.println("Item at peek "+q.peek());
	}
}
