package adaptor;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2QueuePopEfficient {
	Queue<Integer> main;
	Queue<Integer> helper;
	int size;
	public StackUsing2QueuePopEfficient() {
		main = new LinkedList<>();
		helper = new LinkedList<>();
		this.size = 0;
	}
	
	public int pop() {
		if(main.size()==0) return -1;
		return main.remove();
		
	}
	
	public void push(int val) {
		helper.add(val);
		while(!main.isEmpty()) {
			helper.add(main.remove());
		}
		Queue<Integer> temp = main;
		main = helper;
		helper = temp;
		
	}
	
	public int peek() {
		return main.peek();	
	}
	
	public boolean isEmpty() {
		return main.isEmpty();
	}
	
	public int getSize() {
		return main.size();
	}
	
	public static void main(String[] args) {
		StackUsing2QueuePopEfficient st1 = new StackUsing2QueuePopEfficient();
		st1.push(1);
		st1.push(2);
		st1.push(3);
		st1.push(4);
		st1.push(5);
		System.out.println(st1.main);
		System.out.println(st1.peek());
		System.out.println(st1.pop());
		System.out.println(st1.main);
	}
	
}
