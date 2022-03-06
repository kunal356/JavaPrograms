package adaptor;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2QueuePushEfficient {
	Queue<Integer> main;
	Queue<Integer> helper;
	int size;
	public StackUsing2QueuePushEfficient() {
		main = new LinkedList<>();
		helper = new LinkedList<>();
		this.size = 0;
	}
	
	public void push(int val) {
		main.add(val);
		
	}
	
	public int pop() {
		if(main.size()==0) return -1;
		while(main.size()>1) {
			helper.add(main.remove());
		}
		int itemToRemove = main.remove();
		Queue<Integer> temp = main;
		main = helper;
		helper = temp;
		return itemToRemove;
	}
	
	public int peek() {
		if(main.size()==0) return -1;
		while(main.size()>1) {
			helper.add(main.remove());
		}
		int itemToReturn = main.remove();
		helper.add(itemToReturn);
		
		Queue<Integer> temp = main;
		main = helper;
		helper = temp;
		return itemToReturn;
	}
	
	public boolean isEmpty() {
		return main.isEmpty();
	}
	
	public int getSize() {
		return main.size();
	}
	
	public static void main(String[] args) {
		StackUsing2QueuePushEfficient st = new StackUsing2QueuePushEfficient();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		System.out.println(st.main);
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.main);
		
	}

}
