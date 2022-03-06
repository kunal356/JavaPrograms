package adaptor;

import java.util.Stack;

public class QueueUsing2StackRemoveEfficient {
	Stack<Integer> main;
	Stack<Integer> helper;
	public QueueUsing2StackRemoveEfficient() {
		 main = new Stack<>();
		 helper = new Stack<>();
	}
	
	public void add(int val) {
		
		while(!main.isEmpty()) {
			helper.push(main.pop());
		}
		main.push(val);
		while(!helper.isEmpty()) {
			main.push(helper.pop());
		}
		
	}
	
	public int remove() {
		if(main.size()==0) return -1;
		return main.pop();
	}
	
	public int peek() {
		if(main.size()==0) return -1;
		return main.peek();
	}
	
	public boolean isEmpty() {
		return main.isEmpty();
	}
	
	public int getSize() {
		return main.size();
	}
	
	public static void main(String[] args) {
		QueueUsing2StackRemoveEfficient q1 = new QueueUsing2StackRemoveEfficient();
		q1.add(10);
		q1.add(20);
		q1.add(30);
		q1.add(40);
		q1.add(50);
		System.out.println(q1.peek());
		System.out.println(q1.remove());
		System.out.println(q1.main);
		System.out.println(q1.peek());
		
	}
}

