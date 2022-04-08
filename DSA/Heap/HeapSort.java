
public class HeapSort {
	public static void main(String[] args) {
		int arr[] = {6,3,2,5,1};
		heapSort(arr,5);
		printArray(arr);
		
	}
	
	private static void  heapSort(int arr[],int n) {
		for(int i = n/2 - 1;i>=0;i--) {
			heapify(arr,n,i);
		}
		for(int i = n-1; i>=0; i--) {
			swap(arr,i,0);
			heapify(arr,i,0);
		}
	}
	
	private static void swap(int arr[],int x,int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	
	private static void heapify(int[] arr,int n,int i) {
		int left = 2*i+1;
		int right = 2*i+2;
		int largest = i;
		
		if(left < n && arr[left]>arr[largest]) {
			largest = left;
		}
		if(right<n && arr[right]>arr[largest]) {
			largest = right;
		}
		if(largest != i) {
			swap(arr,i,largest);
			heapify(arr,n,largest);
		}
	}
	
	private static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

