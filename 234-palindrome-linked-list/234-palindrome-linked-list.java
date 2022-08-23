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
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast =head,slow=head;
        
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        
        if(fast!=null){
            slow=slow.next;
        }
        
        ListNode prev=null;
        ListNode curr = slow;
        
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next=prev;
            prev = curr;
            curr=temp;
        }
        
        fast=head;
        while(prev!=null){
            if(fast.val!=prev.val)
                return false;
            fast=fast.next;
            prev=prev.next;
        }
        
        return true;
    }
}