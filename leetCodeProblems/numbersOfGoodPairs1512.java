//o(n^2) solution
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodpairs=0;
       for(int i=0; i<nums.length; i++){
           for(int j=nums.length-1; j>i; j--){
               if(nums[i] == nums[j]){
                    goodpairs++;
                }
            }
        }
         return goodpairs;
    }
}

// less space 
// Solution 2 using Hash Map
class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int goodpairs=0;
       for(int i=0; i<nums.length; i++){
          int prevFreq = map.getOrDefault(nums[i],0);
           map.put(nums[i],prevFreq+1);
        }
        for(Integer m : map.values()){
            if(m>1){
                goodpairs+=(m*(m-1))/2;
            }
        }
         return goodpairs;
    }
}
