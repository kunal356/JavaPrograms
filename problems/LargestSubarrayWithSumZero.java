class Main {
//   GFG problem
    public static int subArraySumZero(int arr[]){
        int sum = 0;
        HashMap<Integer,Integer> m = new HashMap<>();
        int max=0;
        for(int i = 0 ;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                max=i+1;
            }else {
                if(m.get(sum)!=null){
                    max=Math.max(max,i-m.get(sum));

                }else {
                    m.put(sum,i);
                }
            }
        }
        return max>0?max:-1;
    }
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(subArraySumZero(arr));

	}
}
