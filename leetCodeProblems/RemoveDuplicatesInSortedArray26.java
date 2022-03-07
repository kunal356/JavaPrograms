class Solution {
  //problem no 26
    public int removeDuplicates(int[] nums) {
        Queue<Integer> s = new LinkedList<>();
        
        for(int i = 0; i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                s.add(nums[i]);
            }
        }s.add(nums[nums.length-1]);
        int count = 1;
        for(int i = 0 ;i<s.size();i++){
            nums[i]=s.remove();
            count++;
        }
         return count;
    }
   
}
