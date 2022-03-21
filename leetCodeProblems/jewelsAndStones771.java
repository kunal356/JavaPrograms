// leetcode problem 771
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i<stones.length(); i++){
            int prevFreq = map.getOrDefault(stones.charAt(i),0);
            map.put(stones.charAt(i),prevFreq + 1);
        }
        int freq =0;
        for(int i=0; i<jewels.length(); i++){
            freq += map.getOrDefault(jewels.charAt(i),0);
        }
        return freq;
    }
}
