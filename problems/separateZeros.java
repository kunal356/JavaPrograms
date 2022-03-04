package assignments;

import java.util.Queue;
import java.util.LinkedList;

public class Separatezeros {
	
	public static void main(String[] args) {
		int arr[]= {1, 0, 11, 13, 0, 5, 0, 21, 13, 0, 72};
		Queue<Integer> q = new LinkedList<>();
		int zeroCount = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				q.add(arr[i]);				
			}else {
				zeroCount++;
			}
			
		}
		int j=0;
		while(j<zeroCount) {
			arr[j]=0;
			j++;
		}
		while(j<arr.length) {
			arr[j]=q.remove();
			j++;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
}
