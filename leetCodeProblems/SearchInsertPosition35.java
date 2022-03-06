package leetCodeProblems;

public class SearchInsertPosition35 {
	public static void main(String[] args) {
		int arr[]= {1,3,5,6,8,9};
		int k =3;
		int index=0;
		for(int i = 0 ;i<arr.length;i++) {
			if(arr[i]==k) {
				index=i;
			}if(arr[i]<k) {
				index=i+1;
			}
		}
		System.out.println(index);
	}
	
}
