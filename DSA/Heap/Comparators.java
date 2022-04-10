package heap;

import java.util.*;
// Interface using implements
class Student implements Comparable<Student>{
	public int rollNumber;
	public String name;
	public Student(int rollNumber, String name) {
		this.rollNumber = rollNumber;
		this.name = name;
	}
	@Override
	public int compareTo(Student a){
		if(!this.name.equals(a.name)) {
			return this.name.compareTo(a.name);
		}else {
			if(this.rollNumber<a.rollNumber) {
				return -1;
			}else {
				return 1;
			}
		}
	}
}
public class Comparators {
	
	public static void main(String[] args) {
		/*ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		
		Collections.sort(list,getComparator());
		for(int i: list) {
			System.out.print(i+" ");
		}
		System.out.println();
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>(getComparator());
		heap.add(5);
		heap.add(25);
		heap.add(22);
		heap.add(12);
		heap.add(2);
		heap.add(1);
		heap.add(6);
		heap.add(9);
		heap.add(19);
		heap.add(66);
		while(!heap.isEmpty()) {
			System.out.print(heap.poll()+" ");
		}
		
		
		*/
		 Student santanu = new Student(1, "Santanu");
	        Student dinesh = new Student(2, "Dinesh");
	        Student shariq = new Student(3, "Shariq");
	        Student nikhat = new Student(4, "Nikhat");
	        Student srinivas = new Student(5, "Srinivas");
	        Student kiran = new Student(6, "Kiran");
	        Student Jyoti = new Student(7, "Jyoti");
	        Student Jyoti2 = new Student(8, "Jyoti");
	        Student dinesh2 = new Student(9, "Dinesh");
	        Student nikhat2 = new Student(10, "Nikhat");

//	        System.out.println(santanu.compareTo(dinesh));

	        ArrayList<Student> list = new ArrayList<>();
	        list.add(santanu);
	        list.add(dinesh);
	        list.add(shariq);
	        list.add(nikhat);
	        list.add(srinivas);
	        list.add(kiran);
	        list.add(Jyoti);
	        list.add(Jyoti2);
	        list.add(dinesh2);
	        list.add(nikhat2);
	        
	        Collections.sort(list);
	        for(Student student : list) {
	        	System.out.println(student.name +" "+ student.rollNumber);
	        }
		
	}
	/**
    -1 => order is already correct, a should lie before b
    0 => both are equal, let the order be same
    1 => a should lie after b
    **/
	//print number in such a way that even numbers are first in ascending order while odd numbers are last in descending order
//	Interface using anonymous object
	private static Comparator<Integer> getComparator(){
		return new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				if(a%2 == b%2) {
					if(a%2==1) {
						if(a>b) {
							return -1;
						}else {
							return 1;
						}
					}else {
						if(a>b) {
							return 1;
						}else {
							return -1;
						}
					}
				}else {
					if(a%2 == 0) {
						return -1;
					}else {
						return 1;
					}
				}
			}
		};
	}
}
