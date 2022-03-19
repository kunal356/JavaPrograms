// leetcode problem 2114
class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords=0;
        for(int i=0; i<sentences.length; i++){
            String[] words = sentences[i].split(" ");
            if(words.length > maxWords){
                maxWords=words.length;
            }
        }
        return maxWords;
    }
}
