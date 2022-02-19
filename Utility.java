package linkedlist;

public class Utility {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addFirst(60);
		ll.addFirst(50);
		ll.addFirst(40);
		ll.addFirst(30);
		ll.addFirst(20);
		ll.addFirst(10);
//		ll.display();
//		ll.removeFirst();
		ll.add(25, 2);
		ll.display();
		System.out.println(ll.getData(6));
		System.out.println(ll.getSize());
	}


}
