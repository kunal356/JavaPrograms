package adaptor;
import java.util.Stack;
public class QueueUsing2StackAddEfficient {
	Stack<Integer> main;
	Stack<Integer> helper;
	public QueueUsing2StackAddEfficient() {
		 main = new Stack<>();
		 helper = new Stack<>();
	}
	
	public void add(int val) {
		main.push(val);
	}
	
	public int remove() {
		if(main.size()==0) return -1;
		while(main.size()>1) {
			helper.push(main.pop());
		}
		int itemToRemove = main.pop();
		while(!helper.isEmpty()) {
			main.push(helper.pop());
		}
		return itemToRemove;
	}
	
	public int peek() {
		if(main.size()==0) return -1;
		while(main.size()>1) {
			helper.push(main.pop());
		}
		int itemToReturn = main.peek();
		while(!helper.isEmpty()) {
			main.push(helper.pop());
		}
		return itemToReturn;
	}
	
	public boolean isEmpty() {
		return main.isEmpty();
	}
	
	public int getSize() {
		return main.size();
	}
	
	public static void main(String[] args) {
		QueueUsing2StackAddEfficient q = new QueueUsing2StackAddEfficient();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		System.out.println(q.main);
		System.out.println(q.peek());
		System.out.println(q.remove());
		System.out.println(q.main);
		System.out.println(q.peek());
	}

}
