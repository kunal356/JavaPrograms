/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// leetCode problem 2130
class Solution {
    public int pairSum(ListNode head) {
        Deque<Integer> a = new ArrayDeque<>();
        ListNode curr = head;
        while(curr!=null){
            a.add(curr.val);
            curr = curr.next;
        }
        int max = 0;
        while(!a.isEmpty()){
            max = Math.max(a.pollFirst()+a.pollLast(),max);
        }
        return max;
        
    }
    
  
}
