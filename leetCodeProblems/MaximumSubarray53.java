package leetCodeProblems;

public class MaximumSubarray53 {
	public static void main(String[] args) {
		int arr[]= {-2,1,-3,4,-1,2,1,-5,4};
		int maxSum = arr[0];
		int currSum = maxSum;
		for(int i=1;i<arr.length;i++) {
			if(currSum<0) currSum=0;
			currSum+=arr[i];
			maxSum=Math.max(currSum, maxSum);
		}
		System.out.println(maxSum);
	}

}
