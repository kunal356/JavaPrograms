class Main {
	public static int[] maxSlidingWindow(int a[], int k){
		int n = a.length;
		int r[] = new int[n-k+1];
		int ri =0;

		Deque<Integer> q = new ArrayDeque<>();
		for(int i=0; i<a.length; i++){
			// remove numbers out of range k
			if(!q.isEmpty() && q.peek()==i-k){
				q.poll();
			}

			// remove smaller numbers in k range as they are useless
			while(!q.isEmpty() && a[q.peekLast()]<a[i]){
				q.pollLast();
			}
			q.offer(i);
			if(i>=k-1){
				r[ri++] = a[q.peek()];
			}
		}
		return r;
	}
	public static void main (String[] args) {

             Scanner scan= new Scanner(System.in);
					  int N = scan.nextInt();
					  int arr[]= new int[N];

					  for(int i=0; i<arr.length; i++){
						  arr[i]=scan.nextInt();
					  }
					  int k=scan.nextInt();
					  int res[] = maxSlidingWindow(arr,k);
					  for(int i=0;i<res.length;i++){
						  System.out.print(res[i]+" ");
					  }
					  
	}
}
